package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleConfiguration extends StObject {
  
  /**
    * Program transition configurations.
    */
  var Transition: typings.awsSdk.clientsMediatailorMod.Transition
}
object ScheduleConfiguration {
  
  inline def apply(Transition: Transition): ScheduleConfiguration = {
    val __obj = js.Dynamic.literal(Transition = Transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
  }
}
