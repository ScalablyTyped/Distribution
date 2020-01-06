package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableVgwRoutePropagationRequest extends js.Object {
  /**
    * The ID of the virtual private gateway.
    */
  var GatewayId: VpnGatewayId = js.native
  /**
    * The ID of the route table.
    */
  var RouteTableId: typings.awsDashSdk.clientsEc2Mod.RouteTableId = js.native
}

object DisableVgwRoutePropagationRequest {
  @scala.inline
  def apply(GatewayId: VpnGatewayId, RouteTableId: RouteTableId): DisableVgwRoutePropagationRequest = {
    val __obj = js.Dynamic.literal(GatewayId = GatewayId.asInstanceOf[js.Any], RouteTableId = RouteTableId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisableVgwRoutePropagationRequest]
  }
}

