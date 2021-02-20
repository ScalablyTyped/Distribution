package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnimationOptions extends StObject {
  
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: Double = js.native
  
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: Double = js.native
  
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timeFunction: TimingFunction = js.native
  
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: String = js.native
}
object CreateAnimationOptions {
  
  @scala.inline
  def apply(delay: Double, duration: Double, timeFunction: TimingFunction, transformOrigin: String): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timeFunction = timeFunction.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnimationOptions]
  }
  
  @scala.inline
  implicit class CreateAnimationOptionsMutableBuilder[Self <: CreateAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFunction(value: TimingFunction): Self = StObject.set(x, "timeFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
  }
}
