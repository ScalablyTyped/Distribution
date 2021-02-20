package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorProfileConfig extends StObject {
  
  /**
    *  The connector-specific credentials required by each connector. 
    */
  var connectorProfileCredentials: ConnectorProfileCredentials = js.native
  
  /**
    *  The connector-specific properties of the profile configuration. 
    */
  var connectorProfileProperties: ConnectorProfileProperties = js.native
}
object ConnectorProfileConfig {
  
  @scala.inline
  def apply(
    connectorProfileCredentials: ConnectorProfileCredentials,
    connectorProfileProperties: ConnectorProfileProperties
  ): ConnectorProfileConfig = {
    val __obj = js.Dynamic.literal(connectorProfileCredentials = connectorProfileCredentials.asInstanceOf[js.Any], connectorProfileProperties = connectorProfileProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorProfileConfig]
  }
  
  @scala.inline
  implicit class ConnectorProfileConfigMutableBuilder[Self <: ConnectorProfileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorProfileCredentials(value: ConnectorProfileCredentials): Self = StObject.set(x, "connectorProfileCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileProperties(value: ConnectorProfileProperties): Self = StObject.set(x, "connectorProfileProperties", value.asInstanceOf[js.Any])
  }
}
