package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectorProfileRequest extends StObject {
  
  /**
    *  Indicates the connection mode and if it is public or private. 
    */
  var connectionMode: ConnectionMode
  
  /**
    *  Defines the connector-specific profile configuration and credentials. 
    */
  var connectorProfileConfig: ConnectorProfileConfig
  
  /**
    *  The name of the connector profile and is unique for each ConnectorProfile in the AWS Account. 
    */
  var connectorProfileName: ConnectorProfileName
}
object UpdateConnectorProfileRequest {
  
  @scala.inline
  def apply(
    connectionMode: ConnectionMode,
    connectorProfileConfig: ConnectorProfileConfig,
    connectorProfileName: ConnectorProfileName
  ): UpdateConnectorProfileRequest = {
    val __obj = js.Dynamic.literal(connectionMode = connectionMode.asInstanceOf[js.Any], connectorProfileConfig = connectorProfileConfig.asInstanceOf[js.Any], connectorProfileName = connectorProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectorProfileRequest]
  }
  
  @scala.inline
  implicit class UpdateConnectorProfileRequestMutableBuilder[Self <: UpdateConnectorProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionMode(value: ConnectionMode): Self = StObject.set(x, "connectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileConfig(value: ConnectorProfileConfig): Self = StObject.set(x, "connectorProfileConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
  }
}
