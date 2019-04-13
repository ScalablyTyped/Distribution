package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDirectConnectGatewayAssociationRequest extends js.Object {
  /**
    * The ID of the Direct Connect gateway association.
    */
  var associationId: js.UndefOr[DirectConnectGatewayAssociationId] = js.undefined
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
}

object DeleteDirectConnectGatewayAssociationRequest {
  @scala.inline
  def apply(
    associationId: DirectConnectGatewayAssociationId = null,
    directConnectGatewayId: DirectConnectGatewayId = null,
    virtualGatewayId: VirtualGatewayId = null
  ): DeleteDirectConnectGatewayAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (associationId != null) __obj.updateDynamic("associationId")(associationId)
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId)
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId)
    __obj.asInstanceOf[DeleteDirectConnectGatewayAssociationRequest]
  }
}

