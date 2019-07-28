package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectConnectGatewayRequest extends js.Object {
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId
}

object DeleteDirectConnectGatewayRequest {
  @scala.inline
  def apply(directConnectGatewayId: DirectConnectGatewayId): DeleteDirectConnectGatewayRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId)
  
    __obj.asInstanceOf[DeleteDirectConnectGatewayRequest]
  }
}

