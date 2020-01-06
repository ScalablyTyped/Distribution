package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStateChangeReason extends js.Object {
  /**
    * The programmable code for the state change reason.
    */
  var Code: js.UndefOr[InstanceStateChangeReasonCode] = js.native
  /**
    * The status change reason description.
    */
  var Message: js.UndefOr[String] = js.native
}

object InstanceStateChangeReason {
  @scala.inline
  def apply(Code: InstanceStateChangeReasonCode = null, Message: String = null): InstanceStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStateChangeReason]
  }
}

