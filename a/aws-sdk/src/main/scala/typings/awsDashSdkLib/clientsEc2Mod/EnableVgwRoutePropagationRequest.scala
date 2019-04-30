package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableVgwRoutePropagationRequest extends js.Object {
  /**
    * The ID of the virtual private gateway that is attached to a VPC. The virtual private gateway must be attached to the same VPC that the routing tables are associated with. 
    */
  var GatewayId: String
  /**
    * The ID of the route table. The routing table must be associated with the same VPC that the virtual private gateway is attached to. 
    */
  var RouteTableId: String
}

object EnableVgwRoutePropagationRequest {
  @scala.inline
  def apply(GatewayId: String, RouteTableId: String): EnableVgwRoutePropagationRequest = {
    val __obj = js.Dynamic.literal(GatewayId = GatewayId, RouteTableId = RouteTableId)
  
    __obj.asInstanceOf[EnableVgwRoutePropagationRequest]
  }
}

