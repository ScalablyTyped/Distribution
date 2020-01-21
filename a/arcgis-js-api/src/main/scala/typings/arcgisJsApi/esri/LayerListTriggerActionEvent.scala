package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerListTriggerActionEvent extends js.Object {
  var action: ActionButton | ActionToggle
  var item: ListItem
}

object LayerListTriggerActionEvent {
  @scala.inline
  def apply(action: ActionButton | ActionToggle, item: ListItem): LayerListTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LayerListTriggerActionEvent]
  }
}

