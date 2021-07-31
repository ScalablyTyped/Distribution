package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerListTriggerActionEvent extends StObject {
  
  var action: ActionButton | ActionToggle
  
  var item: ListItem
}
object LayerListTriggerActionEvent {
  
  @scala.inline
  def apply(action: ActionButton | ActionToggle, item: ListItem): LayerListTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerListTriggerActionEvent]
  }
  
  @scala.inline
  implicit class LayerListTriggerActionEventMutableBuilder[Self <: LayerListTriggerActionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionButton | ActionToggle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
