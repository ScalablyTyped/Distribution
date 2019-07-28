package typings.ably.ablyMod.TypesNs

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
    val __obj = js.Dynamic.literal(recipient = recipient)
    if (errorReason != null) __obj.updateDynamic("errorReason")(errorReason)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[DevicePushDetails]
  }
}

