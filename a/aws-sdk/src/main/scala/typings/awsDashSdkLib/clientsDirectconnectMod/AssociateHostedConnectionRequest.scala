package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateHostedConnectionRequest extends js.Object {
  /**
    * The ID of the hosted connection.
    */
  var connectionId: ConnectionId
  /**
    * The ID of the interconnect or the LAG.
    */
  var parentConnectionId: ConnectionId
}

object AssociateHostedConnectionRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, parentConnectionId: ConnectionId): AssociateHostedConnectionRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, parentConnectionId = parentConnectionId)
  
    __obj.asInstanceOf[AssociateHostedConnectionRequest]
  }
}

