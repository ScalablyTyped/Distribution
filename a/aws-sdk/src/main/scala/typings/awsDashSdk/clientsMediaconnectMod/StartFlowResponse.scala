package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartFlowResponse extends js.Object {
  /**
    * The ARN of the flow that you started.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
  /**
    * The status of the flow when the StartFlow process begins.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Status] = js.undefined
}

object StartFlowResponse {
  @scala.inline
  def apply(FlowArn: __string = null, Status: Status = null): StartFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartFlowResponse]
  }
}

