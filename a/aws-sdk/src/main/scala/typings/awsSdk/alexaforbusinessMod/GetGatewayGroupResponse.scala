package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGatewayGroupResponse extends js.Object {
  var GatewayGroup: js.UndefOr[typings.awsSdk.alexaforbusinessMod.GatewayGroup] = js.native
}

object GetGatewayGroupResponse {
  @scala.inline
  def apply(GatewayGroup: GatewayGroup = null): GetGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (GatewayGroup != null) __obj.updateDynamic("GatewayGroup")(GatewayGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayGroupResponse]
  }
}

