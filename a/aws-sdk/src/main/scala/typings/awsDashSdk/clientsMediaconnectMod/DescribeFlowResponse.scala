package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFlowResponse extends js.Object {
  var Flow: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Flow] = js.undefined
  var Messages: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Messages] = js.undefined
}

object DescribeFlowResponse {
  @scala.inline
  def apply(Flow: Flow = null, Messages: Messages = null): DescribeFlowResponse = {
    val __obj = js.Dynamic.literal()
    if (Flow != null) __obj.updateDynamic("Flow")(Flow)
    if (Messages != null) __obj.updateDynamic("Messages")(Messages)
    __obj.asInstanceOf[DescribeFlowResponse]
  }
}

