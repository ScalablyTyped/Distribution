package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentAnimateCfg extends StObject {
  
  /**
    * @title 动画延迟时间
    */
  val delay: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 动画执行时间
    */
  val duration: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 动画缓动函数
    */
  val easing: js.UndefOr[String] = js.undefined
}
object ComponentAnimateCfg {
  
  inline def apply(): ComponentAnimateCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentAnimateCfg]
  }
  
  extension [Self <: ComponentAnimateCfg](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
