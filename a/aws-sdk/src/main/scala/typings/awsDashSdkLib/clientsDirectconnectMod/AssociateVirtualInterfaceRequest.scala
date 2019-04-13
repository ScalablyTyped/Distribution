package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the LAG or connection.
    */
  var connectionId: ConnectionId
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
}

object AssociateVirtualInterfaceRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, virtualInterfaceId: VirtualInterfaceId): AssociateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, virtualInterfaceId = virtualInterfaceId)
  
    __obj.asInstanceOf[AssociateVirtualInterfaceRequest]
  }
}

