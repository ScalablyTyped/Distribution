package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAutomationSignalRequest extends js.Object {
  /**
    * The unique identifier for an existing Automation execution that you want to send the signal to.
    */
  var AutomationExecutionId: awsDashSdkLib.clientsSsmMod.AutomationExecutionId
  /**
    * The data sent with the signal. The data schema depends on the type of signal used in the request. 
    */
  var Payload: js.UndefOr[AutomationParameterMap] = js.undefined
  /**
    * The type of signal. Valid signal types include the following: Approve and Reject 
    */
  var SignalType: awsDashSdkLib.clientsSsmMod.SignalType
}

object SendAutomationSignalRequest {
  @scala.inline
  def apply(
    AutomationExecutionId: AutomationExecutionId,
    SignalType: SignalType,
    Payload: AutomationParameterMap = null
  ): SendAutomationSignalRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId, SignalType = SignalType.asInstanceOf[js.Any])
    if (Payload != null) __obj.updateDynamic("Payload")(Payload)
    __obj.asInstanceOf[SendAutomationSignalRequest]
  }
}

