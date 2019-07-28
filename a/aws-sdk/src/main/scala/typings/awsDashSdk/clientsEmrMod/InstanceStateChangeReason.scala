package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceStateChangeReason extends js.Object {
  /**
    * The programmable code for the state change reason.
    */
  var Code: js.UndefOr[InstanceStateChangeReasonCode] = js.undefined
  /**
    * The status change reason description.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object InstanceStateChangeReason {
  @scala.inline
  def apply(Code: InstanceStateChangeReasonCode = null, Message: String = null): InstanceStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[InstanceStateChangeReason]
  }
}

