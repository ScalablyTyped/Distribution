package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFlowOutputsResponse extends js.Object {
  /**
    * The ARN of the flow that these outputs were added to.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
  /**
    * The details of the newly added outputs.
    */
  var Outputs: js.UndefOr[__listOfOutput] = js.undefined
}

object AddFlowOutputsResponse {
  @scala.inline
  def apply(FlowArn: __string = null, Outputs: __listOfOutput = null): AddFlowOutputsResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs)
    __obj.asInstanceOf[AddFlowOutputsResponse]
  }
}

