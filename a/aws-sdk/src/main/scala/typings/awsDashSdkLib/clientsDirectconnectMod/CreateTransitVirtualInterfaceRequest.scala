package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransitVirtualInterfaceRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  /**
    * Information about the transit virtual interface.
    */
  var newTransitVirtualInterface: NewTransitVirtualInterface
}

object CreateTransitVirtualInterfaceRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, newTransitVirtualInterface: NewTransitVirtualInterface): CreateTransitVirtualInterfaceRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, newTransitVirtualInterface = newTransitVirtualInterface)
  
    __obj.asInstanceOf[CreateTransitVirtualInterfaceRequest]
  }
}

