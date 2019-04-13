package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableVgwRoutePropagationRequest extends js.Object {
  /**
    * The ID of the virtual private gateway.
    */
  var GatewayId: String
  /**
    * The ID of the route table.
    */
  var RouteTableId: String
}

object DisableVgwRoutePropagationRequest {
  @scala.inline
  def apply(GatewayId: String, RouteTableId: String): DisableVgwRoutePropagationRequest = {
    val __obj = js.Dynamic.literal(GatewayId = GatewayId, RouteTableId = RouteTableId)
  
    __obj.asInstanceOf[DisableVgwRoutePropagationRequest]
  }
}

