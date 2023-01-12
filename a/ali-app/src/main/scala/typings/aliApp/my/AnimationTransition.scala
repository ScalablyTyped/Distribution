package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTransition extends StObject {
  
  var delay: Double
  
  var duration: Double
  
  var timingFunction: TimingFunction
}
object AnimationTransition {
  
  inline def apply(delay: Double, duration: Double, timingFunction: TimingFunction): AnimationTransition = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timingFunction = timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTransition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationTransition] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setTimingFunction(value: TimingFunction): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
  }
}
