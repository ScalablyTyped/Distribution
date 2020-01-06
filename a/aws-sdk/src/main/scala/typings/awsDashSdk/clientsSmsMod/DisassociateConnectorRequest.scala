package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateConnectorRequest extends js.Object {
  /**
    * The identifier of the connector.
    */
  var connectorId: ConnectorId = js.native
}

object DisassociateConnectorRequest {
  @scala.inline
  def apply(connectorId: ConnectorId): DisassociateConnectorRequest = {
    val __obj = js.Dynamic.literal(connectorId = connectorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateConnectorRequest]
  }
}

