package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConnectionRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
}

object DeleteConnectionRequest {
  @scala.inline
  def apply(connectionId: ConnectionId): DeleteConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId)
  
    __obj.asInstanceOf[DeleteConnectionRequest]
  }
}

