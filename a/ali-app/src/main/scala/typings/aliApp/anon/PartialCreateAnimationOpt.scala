package typings.aliApp.anon

import typings.aliApp.my.TimingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.CreateAnimationOptions> */
trait PartialCreateAnimationOpt extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var timeFunction: js.UndefOr[TimingFunction] = js.undefined
  
  var transformOrigin: js.UndefOr[String] = js.undefined
}
object PartialCreateAnimationOpt {
  
  @scala.inline
  def apply(): PartialCreateAnimationOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateAnimationOpt]
  }
  
  @scala.inline
  implicit class PartialCreateAnimationOptMutableBuilder[Self <: PartialCreateAnimationOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setTimeFunction(value: TimingFunction): Self = StObject.set(x, "timeFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFunctionUndefined: Self = StObject.set(x, "timeFunction", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
  }
}
