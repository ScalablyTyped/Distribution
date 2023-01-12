package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSliderTriggerActionEvent extends StObject {
  
  var action: Action
}
object TimeSliderTriggerActionEvent {
  
  inline def apply(action: Action): TimeSliderTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSliderTriggerActionEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeSliderTriggerActionEvent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
