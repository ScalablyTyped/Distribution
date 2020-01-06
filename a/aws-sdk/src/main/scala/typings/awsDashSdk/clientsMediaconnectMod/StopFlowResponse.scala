package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopFlowResponse extends js.Object {
  /**
    * The ARN of the flow that you stopped.
    */
  var FlowArn: js.UndefOr[__string] = js.native
  /**
    * The status of the flow when the StopFlow process begins.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Status] = js.native
}

object StopFlowResponse {
  @scala.inline
  def apply(FlowArn: __string = null, Status: Status = null): StopFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopFlowResponse]
  }
}

