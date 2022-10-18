package typings.antvGBase

import typings.antvGBase.libInterfacesMod.ICanvas
import typings.antvGBase.libInterfacesMod.IElement
import typings.d3Timer.mod.Timer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimateTimelineMod {
  
  @JSImport("@antv/g-base/lib/animate/timeline", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Timeline {
    /**
      * 时间轴构造函数，依赖于画布
      * @param {}
      */
    def this(canvas: ICanvas) = this()
  }
  
  @js.native
  trait Timeline extends StObject {
    
    /**
      * 增加动画元素
      */
    def addAnimator(shape: Any): Unit = js.native
    
    /**
      * 执行动画的元素列表
      * @type {IElement[]}
      */
    var animators: js.Array[IElement] = js.native
    
    /**
      * 画布
      * @type {ICanvas}
      */
    var canvas: ICanvas = js.native
    
    /**
      * 当前时间
      * @type {number}
      */
    var current: Double = js.native
    
    /**
      * 获取当前时间
      */
    def getTime(): Double = js.native
    
    /**
      * 初始化定时器
      */
    def initTimer(): Unit = js.native
    
    /**
      * 是否有动画在执行
      */
    def isAnimating(): Boolean = js.native
    
    /**
      * 移除动画元素
      */
    def removeAnimator(index: Any): Unit = js.native
    
    /**
      * 停止定时器
      */
    def stop(): Unit = js.native
    
    /**
      * 停止时间轴上所有元素的动画，并置空动画元素列表
      * @param {boolean} toEnd 是否到动画的最终状态，用来透传给动画元素的 stopAnimate 方法
      */
    def stopAllAnimations(): Unit = js.native
    def stopAllAnimations(toEnd: Boolean): Unit = js.native
    
    /**
      * 定时器
      * @type {d3Timer.Timer}
      */
    var timer: Timer_ = js.native
  }
}
