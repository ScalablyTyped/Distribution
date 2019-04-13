package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupStateChangeReason extends js.Object {
  /**
    * The programmable code for the state change reason.
    */
  var Code: js.UndefOr[InstanceGroupStateChangeReasonCode] = js.undefined
  /**
    * The status change reason description.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object InstanceGroupStateChangeReason {
  @scala.inline
  def apply(Code: InstanceGroupStateChangeReasonCode = null, Message: String = null): InstanceGroupStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[InstanceGroupStateChangeReason]
  }
}

