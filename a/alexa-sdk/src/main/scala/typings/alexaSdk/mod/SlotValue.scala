package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotValue extends js.Object {
  var confirmationStatus: js.UndefOr[ConfirmationStatuses] = js.native
  var name: String = js.native
  var resolutions: js.UndefOr[Resolutions] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object SlotValue {
  @scala.inline
  def apply(name: String): SlotValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotValue]
  }
  @scala.inline
  implicit class SlotValueOps[Self <: SlotValue] (val x: Self) extends AnyVal {
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
    def setConfirmationStatus(value: ConfirmationStatuses): Self = this.set("confirmationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmationStatus: Self = this.set("confirmationStatus", js.undefined)
    @scala.inline
    def setResolutions(value: Resolutions): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutions: Self = this.set("resolutions", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

