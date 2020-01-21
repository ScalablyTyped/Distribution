package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupViewModelTriggerActionEvent extends js.Object {
  var action: ActionButton | ActionToggle
}

object PopupViewModelTriggerActionEvent {
  @scala.inline
  def apply(action: ActionButton | ActionToggle): PopupViewModelTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopupViewModelTriggerActionEvent]
  }
}

