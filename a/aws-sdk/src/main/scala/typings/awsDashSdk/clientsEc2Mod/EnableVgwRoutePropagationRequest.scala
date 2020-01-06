package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableVgwRoutePropagationRequest extends js.Object {
  /**
    * The ID of the virtual private gateway that is attached to a VPC. The virtual private gateway must be attached to the same VPC that the routing tables are associated with. 
    */
  var GatewayId: VpnGatewayId = js.native
  /**
    * The ID of the route table. The routing table must be associated with the same VPC that the virtual private gateway is attached to. 
    */
  var RouteTableId: typings.awsDashSdk.clientsEc2Mod.RouteTableId = js.native
}

object EnableVgwRoutePropagationRequest {
  @scala.inline
  def apply(GatewayId: VpnGatewayId, RouteTableId: RouteTableId): EnableVgwRoutePropagationRequest = {
    val __obj = js.Dynamic.literal(GatewayId = GatewayId.asInstanceOf[js.Any], RouteTableId = RouteTableId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableVgwRoutePropagationRequest]
  }
}

