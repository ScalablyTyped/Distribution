package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableVgwRoutePropagationRequest extends js.Object {
  /**
    * The ID of the virtual private gateway.
    */
  var GatewayId: String
  /**
    * The ID of the route table.
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

