package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupTriggerActionEvent extends js.Object {
  var action: ActionButton | ActionToggle = js.native
}

object PopupTriggerActionEvent {
  @scala.inline
  def apply(action: ActionButton | ActionToggle): PopupTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupTriggerActionEvent]
  }
  @scala.inline
  implicit class PopupTriggerActionEventOps[Self <: PopupTriggerActionEvent] (val x: Self) extends AnyVal {
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
  }
  
}

