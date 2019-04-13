package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveFlowOutputRequest extends js.Object {
  /**
    * The flow that you want to remove an output from.
    */
  var FlowArn: __string
  /**
    * The ARN of the output that you want to remove.
    */
  var OutputArn: __string
}

object RemoveFlowOutputRequest {
  @scala.inline
  def apply(FlowArn: __string, OutputArn: __string): RemoveFlowOutputRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn, OutputArn = OutputArn)
  
    __obj.asInstanceOf[RemoveFlowOutputRequest]
  }
}

