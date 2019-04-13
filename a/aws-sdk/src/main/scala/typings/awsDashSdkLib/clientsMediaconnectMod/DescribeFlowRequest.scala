package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFlowRequest extends js.Object {
  /**
    * The ARN of the flow that you want to describe.
    */
  var FlowArn: __string
}

object DescribeFlowRequest {
  @scala.inline
  def apply(FlowArn: __string): DescribeFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn)
  
    __obj.asInstanceOf[DescribeFlowRequest]
  }
}

