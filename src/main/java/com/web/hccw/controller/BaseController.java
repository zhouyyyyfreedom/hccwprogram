package com.web.hccw.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Created by zhouyu on 20190812
 */
@Controller
@Scope("prototype")
public class BaseController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getImgTxtConfigList(HttpServletRequest result, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("name","123");
        return modelAndView;
    }


}
