package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFlowRequest extends js.Object {
  /**
    * The ARN of the flow that you want to delete.
    */
  var FlowArn: __string
}

object DeleteFlowRequest {
  @scala.inline
  def apply(FlowArn: __string): DeleteFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn)
  
    __obj.asInstanceOf[DeleteFlowRequest]
  }
}

