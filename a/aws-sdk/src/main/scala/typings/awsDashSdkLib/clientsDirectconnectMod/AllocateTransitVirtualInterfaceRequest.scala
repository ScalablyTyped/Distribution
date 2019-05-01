package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateTransitVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection on which the transit virtual interface is provisioned.
    */
  var connectionId: ConnectionId
  /**
    * Information about the transit virtual interface.
    */
  var newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation
  /**
    * The ID of the AWS account that owns the transit virtual interface.
    */
  var ownerAccount: OwnerAccount
}

object AllocateTransitVirtualInterfaceRequest {
  @scala.inline
  def apply(
    connectionId: ConnectionId,
    newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation,
    ownerAccount: OwnerAccount
  ): AllocateTransitVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, newTransitVirtualInterfaceAllocation = newTransitVirtualInterfaceAllocation, ownerAccount = ownerAccount)
  
    __obj.asInstanceOf[AllocateTransitVirtualInterfaceRequest]
  }
}

