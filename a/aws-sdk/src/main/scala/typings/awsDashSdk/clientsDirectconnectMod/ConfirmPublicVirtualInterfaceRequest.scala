package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmPublicVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}

object ConfirmPublicVirtualInterfaceRequest {
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId): ConfirmPublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId)
  
    __obj.asInstanceOf[ConfirmPublicVirtualInterfaceRequest]
  }
}

