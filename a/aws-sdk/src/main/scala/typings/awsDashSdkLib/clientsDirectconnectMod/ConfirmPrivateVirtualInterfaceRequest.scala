package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmPrivateVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  /**
    * The ID of the virtual private gateway.
    */
  var virtualGatewayId: js.UndefOr[VirtualGatewayId] = js.undefined
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}

object ConfirmPrivateVirtualInterfaceRequest {
  @scala.inline
  def apply(
    virtualInterfaceId: VirtualInterfaceId,
    directConnectGatewayId: DirectConnectGatewayId = null,
    virtualGatewayId: VirtualGatewayId = null
  ): ConfirmPrivateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId)
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId)
    if (virtualGatewayId != null) __obj.updateDynamic("virtualGatewayId")(virtualGatewayId)
    __obj.asInstanceOf[ConfirmPrivateVirtualInterfaceRequest]
  }
}

