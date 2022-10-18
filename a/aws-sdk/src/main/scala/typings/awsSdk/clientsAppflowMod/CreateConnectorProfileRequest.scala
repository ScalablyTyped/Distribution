package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectorProfileRequest extends StObject {
  
  /**
    *  Indicates the connection mode and specifies whether it is public or private. Private flows use Amazon Web Services PrivateLink to route data over Amazon Web Services infrastructure without exposing it to the public internet. 
    */
  var connectionMode: ConnectionMode
  
  /**
    * The label of the connector. The label is unique for each ConnectorRegistration in your Amazon Web Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
    */
  var connectorLabel: js.UndefOr[ConnectorLabel] = js.undefined
  
  /**
    *  Defines the connector-specific configuration and credentials. 
    */
  var connectorProfileConfig: ConnectorProfileConfig
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in your Amazon Web Services account. 
    */
  var connectorProfileName: ConnectorProfileName
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: ConnectorType
  
  /**
    *  The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key. 
    */
  var kmsArn: js.UndefOr[KMSArn] = js.undefined
}
object CreateConnectorProfileRequest {
  
  inline def apply(
    connectionMode: ConnectionMode,
    connectorProfileConfig: ConnectorProfileConfig,
    connectorProfileName: ConnectorProfileName,
    connectorType: ConnectorType
  ): CreateConnectorProfileRequest = {
    val __obj = js.Dynamic.literal(connectionMode = connectionMode.asInstanceOf[js.Any], connectorProfileConfig = connectorProfileConfig.asInstanceOf[js.Any], connectorProfileName = connectorProfileName.asInstanceOf[js.Any], connectorType = connectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectorProfileRequest]
  }
  
  extension [Self <: CreateConnectorProfileRequest](x: Self) {
    
    inline def setConnectionMode(value: ConnectionMode): Self = StObject.set(x, "connectionMode", value.asInstanceOf[js.Any])
    
    inline def setConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "connectorLabel", value.asInstanceOf[js.Any])
    
    inline def setConnectorLabelUndefined: Self = StObject.set(x, "connectorLabel", js.undefined)
    
    inline def setConnectorProfileConfig(value: ConnectorProfileConfig): Self = StObject.set(x, "connectorProfileConfig", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setKmsArn(value: KMSArn): Self = StObject.set(x, "kmsArn", value.asInstanceOf[js.Any])
    
    inline def setKmsArnUndefined: Self = StObject.set(x, "kmsArn", js.undefined)
  }
}
