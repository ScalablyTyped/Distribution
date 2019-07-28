package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceFleetStateChangeReason extends js.Object {
  /**
    * A code corresponding to the reason the state change occurred.
    */
  var Code: js.UndefOr[InstanceFleetStateChangeReasonCode] = js.undefined
  /**
    * An explanatory message.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object InstanceFleetStateChangeReason {
  @scala.inline
  def apply(Code: InstanceFleetStateChangeReasonCode = null, Message: String = null): InstanceFleetStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[InstanceFleetStateChangeReason]
  }
}

