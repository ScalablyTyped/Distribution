package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePublicVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  /**
    * Information about the public virtual interface.
    */
  var newPublicVirtualInterface: NewPublicVirtualInterface
}

object CreatePublicVirtualInterfaceRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, newPublicVirtualInterface: NewPublicVirtualInterface): CreatePublicVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, newPublicVirtualInterface = newPublicVirtualInterface)
  
    __obj.asInstanceOf[CreatePublicVirtualInterfaceRequest]
  }
}

