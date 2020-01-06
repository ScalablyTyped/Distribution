package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopFlowRequest extends js.Object {
  /**
    * The ARN of the flow that you want to stop.
    */
  var FlowArn: __string = js.native
}

object StopFlowRequest {
  @scala.inline
  def apply(FlowArn: __string): StopFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopFlowRequest]
  }
}

