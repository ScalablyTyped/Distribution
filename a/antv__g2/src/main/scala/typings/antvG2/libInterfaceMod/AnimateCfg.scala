package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimateCfg extends StObject {
  
  /**
    * @title 动画执行函数
    */
  val animation: js.UndefOr[String] = js.undefined
  
  /**
    * @title 动画执行结束后的回调函数
    */
  val callback: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /**
    * @title 动画延迟时间
    */
  val delay: js.UndefOr[Double | AnimateDelayCallback] = js.undefined
  
  /**
    * @title 动画执行时间
    */
  val duration: js.UndefOr[Double | AnimateDurationCallback] = js.undefined
  
  /**
    * @title 动画缓动函数
    */
  val easing: js.UndefOr[String | AnimateEasingCallback] = js.undefined
  
  /**
    * @title 动画是否重复
    */
  val repeat: js.UndefOr[Boolean] = js.undefined
}
object AnimateCfg {
  
  inline def apply(): AnimateCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimateCfg] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCallback(value: () => Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDelay(value: Double | AnimateDelayCallback): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction1(value: /* data */ Datum => Double): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double | AnimateDurationCallback): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationFunction1(value: /* data */ Datum => Double): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String | AnimateEasingCallback): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction1(value: /* data */ Datum => String): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
