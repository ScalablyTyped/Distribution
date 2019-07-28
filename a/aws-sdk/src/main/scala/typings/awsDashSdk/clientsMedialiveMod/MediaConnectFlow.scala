package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConnectFlow extends js.Object {
  /**
    * The unique ARN of the MediaConnect Flow being used as a source.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
}

object MediaConnectFlow {
  @scala.inline
  def apply(FlowArn: __string = null): MediaConnectFlow = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    __obj.asInstanceOf[MediaConnectFlow]
  }
}

