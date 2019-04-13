package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConnectFlowRequest extends js.Object {
  /**
    * The ARN of the MediaConnect Flow that you want to use as a source.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
}

object MediaConnectFlowRequest {
  @scala.inline
  def apply(FlowArn: __string = null): MediaConnectFlowRequest = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    __obj.asInstanceOf[MediaConnectFlowRequest]
  }
}

