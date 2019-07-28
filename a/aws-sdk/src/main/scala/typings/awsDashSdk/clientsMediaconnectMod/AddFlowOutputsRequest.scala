package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddFlowOutputsRequest extends js.Object {
  /**
    * The flow that you want to add outputs to.
    */
  var FlowArn: __string
  /**
    * A list of outputs that you want to add.
    */
  var Outputs: __listOfAddOutputRequest
}

object AddFlowOutputsRequest {
  @scala.inline
  def apply(FlowArn: __string, Outputs: __listOfAddOutputRequest): AddFlowOutputsRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn, Outputs = Outputs)
  
    __obj.asInstanceOf[AddFlowOutputsRequest]
  }
}

