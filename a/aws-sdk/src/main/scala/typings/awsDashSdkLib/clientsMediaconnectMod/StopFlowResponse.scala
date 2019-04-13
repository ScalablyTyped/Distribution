package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopFlowResponse extends js.Object {
  /**
    * The ARN of the flow that you stopped.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
  /**
    * The status of the flow when the StopFlow process begins.
    */
  var Status: js.UndefOr[Status] = js.undefined
}

object StopFlowResponse {
  @scala.inline
  def apply(FlowArn: __string = null, Status: Status = null): StopFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopFlowResponse]
  }
}

