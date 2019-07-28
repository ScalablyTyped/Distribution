package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}

object DeleteVirtualInterfaceRequest {
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId): DeleteVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId)
  
    __obj.asInstanceOf[DeleteVirtualInterfaceRequest]
  }
}

