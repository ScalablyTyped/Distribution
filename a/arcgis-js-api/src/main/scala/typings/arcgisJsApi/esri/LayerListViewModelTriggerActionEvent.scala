package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerListViewModelTriggerActionEvent extends StObject {
  
  var action: ActionButton | ActionToggle = js.native
  
  var item: ListItem = js.native
}
object LayerListViewModelTriggerActionEvent {
  
  @scala.inline
  def apply(action: ActionButton | ActionToggle, item: ListItem): LayerListViewModelTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerListViewModelTriggerActionEvent]
  }
  
  @scala.inline
  implicit class LayerListViewModelTriggerActionEventMutableBuilder[Self <: LayerListViewModelTriggerActionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionButton | ActionToggle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: ListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
