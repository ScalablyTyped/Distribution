package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocatePublicVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection on which the public virtual interface is provisioned.
    */
  var connectionId: ConnectionId = js.native
  /**
    * Information about the public virtual interface.
    */
  var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation = js.native
  /**
    * The ID of the AWS account that owns the public virtual interface.
    */
  var ownerAccount: OwnerAccount = js.native
}

object AllocatePublicVirtualInterfaceRequest {
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocatePublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], newPublicVirtualInterfaceAllocation = newPublicVirtualInterfaceAllocation.asInstanceOf[js.Any], ownerAccount = ownerAccount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AllocatePublicVirtualInterfaceRequest]
  }
}

