package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepStateChangeReason extends js.Object {
  /**
    * The programmable code for the state change reason. Note: Currently, the service provides no code for the state change.
    */
  var Code: js.UndefOr[StepStateChangeReasonCode] = js.undefined
  /**
    * The descriptive message for the state change reason.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object StepStateChangeReason {
  @scala.inline
  def apply(Code: StepStateChangeReasonCode = null, Message: String = null): StepStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[StepStateChangeReason]
  }
}

