package typings.alexaSdk.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intent extends js.Object {
  var confirmationStatus: js.UndefOr[ConfirmationStatuses] = js.native
  var name: String = js.native
  var slots: Record[String, SlotValue] = js.native
}

object Intent {
  @scala.inline
  def apply(name: String, slots: Record[String, SlotValue]): Intent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intent]
  }
  @scala.inline
  implicit class IntentOps[Self <: Intent] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlots(value: Record[String, SlotValue]): Self = this.set("slots", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfirmationStatus(value: ConfirmationStatuses): Self = this.set("confirmationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmationStatus: Self = this.set("confirmationStatus", js.undefined)
  }
  
}

