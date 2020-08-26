package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerListViewModelTriggerActionEvent extends js.Object {
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
  implicit class LayerListViewModelTriggerActionEventOps[Self <: LayerListViewModelTriggerActionEvent] (val x: Self) extends AnyVal {
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
    def setItem(value: ListItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

