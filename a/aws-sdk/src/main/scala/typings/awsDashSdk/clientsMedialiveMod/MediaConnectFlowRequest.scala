package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaConnectFlowRequest extends js.Object {
  /**
    * The ARN of the MediaConnect Flow that you want to use as a source.
    */
  var FlowArn: js.UndefOr[__string] = js.native
}

object MediaConnectFlowRequest {
  @scala.inline
  def apply(FlowArn: __string = null): MediaConnectFlowRequest = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConnectFlowRequest]
  }
}

