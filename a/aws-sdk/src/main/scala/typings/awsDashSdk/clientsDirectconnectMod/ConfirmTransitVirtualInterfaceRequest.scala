package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmTransitVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: DirectConnectGatewayId = js.native
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}

object ConfirmTransitVirtualInterfaceRequest {
  @scala.inline
  def apply(directConnectGatewayId: DirectConnectGatewayId, virtualInterfaceId: VirtualInterfaceId): ConfirmTransitVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(directConnectGatewayId = directConnectGatewayId.asInstanceOf[js.Any], virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfirmTransitVirtualInterfaceRequest]
  }
}

