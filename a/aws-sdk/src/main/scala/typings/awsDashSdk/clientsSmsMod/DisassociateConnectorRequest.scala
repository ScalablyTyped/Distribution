package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateConnectorRequest extends js.Object {
  /**
    * The identifier of the connector.
    */
  var connectorId: ConnectorId
}

object DisassociateConnectorRequest {
  @scala.inline
  def apply(connectorId: ConnectorId): DisassociateConnectorRequest = {
    val __obj = js.Dynamic.literal(connectorId = connectorId)
  
    __obj.asInstanceOf[DisassociateConnectorRequest]
  }
}

