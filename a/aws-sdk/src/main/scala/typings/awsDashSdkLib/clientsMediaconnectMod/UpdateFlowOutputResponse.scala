package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFlowOutputResponse extends js.Object {
  /**
    * The ARN of the flow that is associated with the updated output.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
  var Output: js.UndefOr[Output] = js.undefined
}

object UpdateFlowOutputResponse {
  @scala.inline
  def apply(FlowArn: __string = null, Output: Output = null): UpdateFlowOutputResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    if (Output != null) __obj.updateDynamic("Output")(Output)
    __obj.asInstanceOf[UpdateFlowOutputResponse]
  }
}

