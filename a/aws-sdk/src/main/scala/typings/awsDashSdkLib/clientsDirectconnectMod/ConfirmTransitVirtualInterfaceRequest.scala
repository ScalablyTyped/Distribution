package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmTransitVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}

object ConfirmTransitVirtualInterfaceRequest {
  @scala.inline
  def apply(directConnectGatewayId: DirectConnectGatewayId, virtualInterfaceId: VirtualInterfaceId): ConfirmTransitVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId, virtualInterfaceId = virtualInterfaceId)
  
    __obj.asInstanceOf[ConfirmTransitVirtualInterfaceRequest]
  }
}

