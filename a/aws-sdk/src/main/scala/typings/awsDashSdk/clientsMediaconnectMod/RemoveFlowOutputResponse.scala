package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFlowOutputResponse extends js.Object {
  /**
    * The ARN of the flow that is associated with the output you removed.
    */
  var FlowArn: js.UndefOr[__string] = js.native
  /**
    * The ARN of the output that was removed.
    */
  var OutputArn: js.UndefOr[__string] = js.native
}

object RemoveFlowOutputResponse {
  @scala.inline
  def apply(FlowArn: __string = null, OutputArn: __string = null): RemoveFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    if (OutputArn != null) __obj.updateDynamic("OutputArn")(OutputArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFlowOutputResponse]
  }
}

