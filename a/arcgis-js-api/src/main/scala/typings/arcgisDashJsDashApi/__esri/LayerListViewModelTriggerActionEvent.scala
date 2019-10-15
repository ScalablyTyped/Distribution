package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerListViewModelTriggerActionEvent extends js.Object {
  var action: ActionButton | ActionToggle
  var item: ListItem
}

object LayerListViewModelTriggerActionEvent {
  @scala.inline
  def apply(action: ActionButton | ActionToggle, item: ListItem): LayerListViewModelTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item)
  
    __obj.asInstanceOf[LayerListViewModelTriggerActionEvent]
  }
}

