package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateConnectionWithLagRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  /**
    * The ID of the LAG with which to associate the connection.
    */
  var lagId: LagId
}

object AssociateConnectionWithLagRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, lagId: LagId): AssociateConnectionWithLagRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, lagId = lagId)
  
    __obj.asInstanceOf[AssociateConnectionWithLagRequest]
  }
}

