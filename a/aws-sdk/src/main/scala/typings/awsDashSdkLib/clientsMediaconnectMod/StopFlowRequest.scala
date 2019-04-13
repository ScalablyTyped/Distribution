package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopFlowRequest extends js.Object {
  /**
    * The ARN of the flow that you want to stop.
    */
  var FlowArn: __string
}

object StopFlowRequest {
  @scala.inline
  def apply(FlowArn: __string): StopFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn)
  
    __obj.asInstanceOf[StopFlowRequest]
  }
}

