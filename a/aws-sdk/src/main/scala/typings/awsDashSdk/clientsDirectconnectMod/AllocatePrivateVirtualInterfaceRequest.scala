package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocatePrivateVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection on which the private virtual interface is provisioned.
    */
  var connectionId: ConnectionId
  /**
    * Information about the private virtual interface.
    */
  var newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation
  /**
    * The ID of the AWS account that owns the virtual private interface.
    */
  var ownerAccount: OwnerAccount
}

object AllocatePrivateVirtualInterfaceRequest {
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocatePrivateVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, newPrivateVirtualInterfaceAllocation = newPrivateVirtualInterfaceAllocation, ownerAccount = ownerAccount)
  
    __obj.asInstanceOf[AllocatePrivateVirtualInterfaceRequest]
  }
}

