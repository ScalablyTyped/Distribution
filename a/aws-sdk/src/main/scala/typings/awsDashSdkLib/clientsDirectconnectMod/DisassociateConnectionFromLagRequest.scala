package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateConnectionFromLagRequest extends js.Object {
  /**
    * The ID of the connection.
    */
  var connectionId: ConnectionId
  /**
    * The ID of the LAG.
    */
  var lagId: LagId
}

object DisassociateConnectionFromLagRequest {
  @scala.inline
  def apply(connectionId: ConnectionId, lagId: LagId): DisassociateConnectionFromLagRequest = {
    val __obj = js.Dynamic.literal(connectionId = connectionId, lagId = lagId)
  
    __obj.asInstanceOf[DisassociateConnectionFromLagRequest]
  }
}

