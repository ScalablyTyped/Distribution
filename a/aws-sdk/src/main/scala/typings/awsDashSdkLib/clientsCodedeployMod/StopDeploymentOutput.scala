package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDeploymentOutput extends js.Object {
  /**
    * The status of the stop deployment operation:   Pending: The stop operation is pending.   Succeeded: The stop operation was successful.  
    */
  var status: js.UndefOr[StopStatus] = js.undefined
  /**
    * An accompanying status message.
    */
  var statusMessage: js.UndefOr[Message] = js.undefined
}

object StopDeploymentOutput {
  @scala.inline
  def apply(status: StopStatus = null, statusMessage: Message = null): StopDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[StopDeploymentOutput]
  }
}

