package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorProfileConfig extends StObject {
  
  /**
    *  The connector-specific credentials required by each connector. 
    */
  var connectorProfileCredentials: ConnectorProfileCredentials
  
  /**
    *  The connector-specific properties of the profile configuration. 
    */
  var connectorProfileProperties: ConnectorProfileProperties
}
object ConnectorProfileConfig {
  
  inline def apply(
    connectorProfileCredentials: ConnectorProfileCredentials,
    connectorProfileProperties: ConnectorProfileProperties
  ): ConnectorProfileConfig = {
    val __obj = js.Dynamic.literal(connectorProfileCredentials = connectorProfileCredentials.asInstanceOf[js.Any], connectorProfileProperties = connectorProfileProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorProfileConfig]
  }
  
  extension [Self <: ConnectorProfileConfig](x: Self) {
    
    inline def setConnectorProfileCredentials(value: ConnectorProfileCredentials): Self = StObject.set(x, "connectorProfileCredentials", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileProperties(value: ConnectorProfileProperties): Self = StObject.set(x, "connectorProfileProperties", value.asInstanceOf[js.Any])
  }
}
