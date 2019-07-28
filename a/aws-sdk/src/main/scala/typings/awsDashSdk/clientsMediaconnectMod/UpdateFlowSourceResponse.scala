package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFlowSourceResponse extends js.Object {
  /**
    * The ARN of the flow that you want to update.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
  /**
    * The settings for the source of the flow.
    */
  var Source: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Source] = js.undefined
}

object UpdateFlowSourceResponse {
  @scala.inline
  def apply(FlowArn: __string = null, Source: Source = null): UpdateFlowSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[UpdateFlowSourceResponse]
  }
}

