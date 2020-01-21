package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasemapLayerListTriggerActionEvent extends js.Object {
  var action: ActionButton | ActionToggle
  var item: ListItem
}

object BasemapLayerListTriggerActionEvent {
  @scala.inline
  def apply(action: ActionButton | ActionToggle, item: ListItem): BasemapLayerListTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BasemapLayerListTriggerActionEvent]
  }
}

