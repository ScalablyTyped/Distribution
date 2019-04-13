package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmConnectionRequest extends js.Object {
  /**
    * The ID of the hosted connection.
    */
  var connectionId: ConnectionId
}

object ConfirmConnectionRequest {
  @scala.inline
  def apply(connectionId: ConnectionId): ConfirmConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId)
  
    __obj.asInstanceOf[ConfirmConnectionRequest]
  }
}

