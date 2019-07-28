package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartFlowRequest extends js.Object {
  /**
    * The ARN of the flow that you want to start.
    */
  var FlowArn: __string
}

object StartFlowRequest {
  @scala.inline
  def apply(FlowArn: __string): StartFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn)
  
    __obj.asInstanceOf[StartFlowRequest]
  }
}

