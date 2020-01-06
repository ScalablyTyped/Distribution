package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddFlowOutputsRequest extends js.Object {
  /**
    * The flow that you want to add outputs to.
    */
  var FlowArn: __string = js.native
  /**
    * A list of outputs that you want to add.
    */
  var Outputs: __listOfAddOutputRequest = js.native
}

object AddFlowOutputsRequest {
  @scala.inline
  def apply(FlowArn: __string, Outputs: __listOfAddOutputRequest): AddFlowOutputsRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddFlowOutputsRequest]
  }
}

