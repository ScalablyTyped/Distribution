package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicePushDetails extends js.Object {
  var errorReason: js.UndefOr[ErrorInfo] = js.native
  var recipient: js.Any = js.native
  var state: js.UndefOr[DevicePushState] = js.native
}

object DevicePushDetails {
  @scala.inline
  def apply(recipient: js.Any): DevicePushDetails = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePushDetails]
  }
  @scala.inline
  implicit class DevicePushDetailsOps[Self <: DevicePushDetails] (val x: Self) extends AnyVal {
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
    def setRecipient(value: js.Any): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorReason(value: ErrorInfo): Self = this.set("errorReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorReason: Self = this.set("errorReason", js.undefined)
    @scala.inline
    def setState(value: DevicePushState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

