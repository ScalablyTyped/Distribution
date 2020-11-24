package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableListTriggerActionEvent extends js.Object {
  
  var action: ActionButton | ActionToggle = js.native
  
  var item: TableListListItem = js.native
}
object TableListTriggerActionEvent {
  
  @scala.inline
  def apply(action: ActionButton | ActionToggle, item: TableListListItem): TableListTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableListTriggerActionEvent]
  }
  
  @scala.inline
  implicit class TableListTriggerActionEventOps[Self <: TableListTriggerActionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: ActionButton | ActionToggle): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: TableListListItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
}
