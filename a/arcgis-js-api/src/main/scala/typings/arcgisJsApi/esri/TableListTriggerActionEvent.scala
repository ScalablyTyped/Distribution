package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableListTriggerActionEvent extends StObject {
  
  var action: ActionButton | ActionToggle
  
  var item: TableListListItem
}
object TableListTriggerActionEvent {
  
  inline def apply(action: ActionButton | ActionToggle, item: TableListListItem): TableListTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableListTriggerActionEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableListTriggerActionEvent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ActionButton | ActionToggle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setItem(value: TableListListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
