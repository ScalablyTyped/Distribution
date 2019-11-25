package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicePushDetails extends js.Object {
  var errorReason: js.UndefOr[ErrorInfo] = js.undefined
  var recipient: js.Any
  var state: js.UndefOr[DevicePushState] = js.undefined
}

object DevicePushDetails {
  @scala.inline
  def apply(recipient: js.Any, errorReason: ErrorInfo = null, state: DevicePushState = null): DevicePushDetails = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any])
    if (errorReason != null) __obj.updateDynamic("errorReason")(errorReason.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePushDetails]
  }
}

