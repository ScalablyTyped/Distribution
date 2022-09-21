package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSliderViewModelTriggerActionEvent extends StObject {
  
  var action: Action
}
object TimeSliderViewModelTriggerActionEvent {
  
  inline def apply(action: Action): TimeSliderViewModelTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSliderViewModelTriggerActionEvent]
  }
  
  extension [Self <: TimeSliderViewModelTriggerActionEvent](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
