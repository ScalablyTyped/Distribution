package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFlowResponse extends js.Object {
  /**
    * The ARN of the flow that was deleted.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
  /**
    * The status of the flow when the DeleteFlow process begins.
    */
  var Status: js.UndefOr[Status] = js.undefined
}

object DeleteFlowResponse {
  @scala.inline
  def apply(FlowArn: __string = null, Status: Status = null): DeleteFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowResponse]
  }
}

