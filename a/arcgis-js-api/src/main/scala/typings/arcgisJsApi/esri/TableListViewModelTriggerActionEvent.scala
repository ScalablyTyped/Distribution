package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableListViewModelTriggerActionEvent extends StObject {
  
  var action: ActionButton | ActionToggle
  
  var item: TableListListItem
}
object TableListViewModelTriggerActionEvent {
  
  inline def apply(action: ActionButton | ActionToggle, item: TableListListItem): TableListViewModelTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableListViewModelTriggerActionEvent]
  }
  
  extension [Self <: TableListViewModelTriggerActionEvent](x: Self) {
    
    inline def setAction(value: ActionButton | ActionToggle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TableListListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
