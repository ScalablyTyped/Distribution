package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupTriggerActionEvent extends js.Object {
  var action: ActionButton | ActionToggle
}

object PopupTriggerActionEvent {
  @scala.inline
  def apply(action: ActionButton | ActionToggle): PopupTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopupTriggerActionEvent]
  }
}

