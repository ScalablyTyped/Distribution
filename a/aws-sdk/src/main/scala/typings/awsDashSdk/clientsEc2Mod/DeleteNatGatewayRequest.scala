package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNatGatewayRequest extends js.Object {
  /**
    * The ID of the NAT gateway.
    */
  var NatGatewayId: String
}

object DeleteNatGatewayRequest {
  @scala.inline
  def apply(NatGatewayId: String): DeleteNatGatewayRequest = {
    val __obj = js.Dynamic.literal(NatGatewayId = NatGatewayId)
  
    __obj.asInstanceOf[DeleteNatGatewayRequest]
  }
}

