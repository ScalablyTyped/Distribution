package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GAnimateCfg extends StObject {
  
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
  val delay: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 动画执行时间
    */
  val duration: Double
  
  /**
    * @title 动画缓动函数
    */
  val easing: js.UndefOr[String] = js.undefined
  
  /**
    * @title 动画是否重复
    */
  val repeat: js.UndefOr[Boolean] = js.undefined
}
object GAnimateCfg {
  
  inline def apply(duration: Double): GAnimateCfg = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GAnimateCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GAnimateCfg] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCallback(value: () => Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
