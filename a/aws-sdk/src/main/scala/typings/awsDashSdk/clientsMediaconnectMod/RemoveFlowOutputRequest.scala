package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowOutputRequest extends js.Object {
  /**
    * The flow that you want to remove an output from.
    */
  var FlowArn: __string = js.native
  /**
    * The ARN of the output that you want to remove.
    */
  var OutputArn: __string = js.native
}

object RemoveFlowOutputRequest {
  @scala.inline
  def apply(FlowArn: __string, OutputArn: __string): RemoveFlowOutputRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveFlowOutputRequest]
  }
}

