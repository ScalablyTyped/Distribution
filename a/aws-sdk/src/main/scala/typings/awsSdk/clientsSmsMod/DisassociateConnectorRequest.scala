package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateConnectorRequest extends StObject {
  
  /**
    * The ID of the connector.
    */
  var connectorId: ConnectorId
}
object DisassociateConnectorRequest {
  
  inline def apply(connectorId: ConnectorId): DisassociateConnectorRequest = {
    val __obj = js.Dynamic.literal(connectorId = connectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConnectorRequest]
  }
  
  extension [Self <: DisassociateConnectorRequest](x: Self) {
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "connectorId", value.asInstanceOf[js.Any])
  }
}
