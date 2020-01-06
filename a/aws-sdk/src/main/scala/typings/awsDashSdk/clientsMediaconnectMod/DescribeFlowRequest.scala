package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFlowRequest extends js.Object {
  /**
    * The ARN of the flow that you want to describe.
    */
  var FlowArn: __string = js.native
}

object DescribeFlowRequest {
  @scala.inline
  def apply(FlowArn: __string): DescribeFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeFlowRequest]
  }
}

