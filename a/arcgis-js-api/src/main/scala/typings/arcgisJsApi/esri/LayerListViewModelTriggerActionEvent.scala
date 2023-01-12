package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerListViewModelTriggerActionEvent extends StObject {
  
  var action: ActionButton | ActionToggle
  
  var item: ListItem
}
object LayerListViewModelTriggerActionEvent {
  
  inline def apply(action: ActionButton | ActionToggle, item: ListItem): LayerListViewModelTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerListViewModelTriggerActionEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerListViewModelTriggerActionEvent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ActionButton | ActionToggle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setItem(value: ListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
