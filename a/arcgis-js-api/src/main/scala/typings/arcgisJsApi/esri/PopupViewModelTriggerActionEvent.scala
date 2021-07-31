package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupViewModelTriggerActionEvent extends StObject {
  
  var action: ActionButton | ActionToggle
}
object PopupViewModelTriggerActionEvent {
  
  @scala.inline
  def apply(action: ActionButton | ActionToggle): PopupViewModelTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupViewModelTriggerActionEvent]
  }
  
  @scala.inline
  implicit class PopupViewModelTriggerActionEventMutableBuilder[Self <: PopupViewModelTriggerActionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionButton | ActionToggle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
