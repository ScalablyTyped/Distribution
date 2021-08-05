package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupTriggerActionEvent extends StObject {
  
  var action: ActionButton | ActionToggle
}
object PopupTriggerActionEvent {
  
  inline def apply(action: ActionButton | ActionToggle): PopupTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupTriggerActionEvent]
  }
  
  extension [Self <: PopupTriggerActionEvent](x: Self) {
    
    inline def setAction(value: ActionButton | ActionToggle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
