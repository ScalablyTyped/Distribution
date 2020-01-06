package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartFlowRequest extends js.Object {
  /**
    * The ARN of the flow that you want to start.
    */
  var FlowArn: __string = js.native
}

object StartFlowRequest {
  @scala.inline
  def apply(FlowArn: __string): StartFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartFlowRequest]
  }
}

