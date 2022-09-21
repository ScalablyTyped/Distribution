package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorProfile extends StObject {
  
  /**
    *  Indicates the connection mode and if it is public or private. 
    */
  var connectionMode: js.UndefOr[ConnectionMode] = js.undefined
  
  /**
    * The label for the connector profile being created.
    */
  var connectorLabel: js.UndefOr[ConnectorLabel] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the connector profile. 
    */
  var connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.undefined
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the Amazon Web Services account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined
  
  /**
    *  The connector-specific properties of the profile configuration. 
    */
  var connectorProfileProperties: js.UndefOr[ConnectorProfileProperties] = js.undefined
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.undefined
  
  /**
    *  Specifies when the connector profile was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the connector profile credentials. 
    */
  var credentialsArn: js.UndefOr[ARN] = js.undefined
  
  /**
    *  Specifies when the connector profile was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Specifies the private connection provisioning state. 
    */
  var privateConnectionProvisioningState: js.UndefOr[PrivateConnectionProvisioningState] = js.undefined
}
object ConnectorProfile {
  
  inline def apply(): ConnectorProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorProfile]
  }
  
  extension [Self <: ConnectorProfile](x: Self) {
    
    inline def setConnectionMode(value: ConnectionMode): Self = StObject.set(x, "connectionMode", value.asInstanceOf[js.Any])
    
    inline def setConnectionModeUndefined: Self = StObject.set(x, "connectionMode", js.undefined)
    
    inline def setConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "connectorLabel", value.asInstanceOf[js.Any])
    
    inline def setConnectorLabelUndefined: Self = StObject.set(x, "connectorLabel", js.undefined)
    
    inline def setConnectorProfileArn(value: ConnectorProfileArn): Self = StObject.set(x, "connectorProfileArn", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileArnUndefined: Self = StObject.set(x, "connectorProfileArn", js.undefined)
    
    inline def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    inline def setConnectorProfileProperties(value: ConnectorProfileProperties): Self = StObject.set(x, "connectorProfileProperties", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfilePropertiesUndefined: Self = StObject.set(x, "connectorProfileProperties", js.undefined)
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCredentialsArn(value: ARN): Self = StObject.set(x, "credentialsArn", value.asInstanceOf[js.Any])
    
    inline def setCredentialsArnUndefined: Self = StObject.set(x, "credentialsArn", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setPrivateConnectionProvisioningState(value: PrivateConnectionProvisioningState): Self = StObject.set(x, "privateConnectionProvisioningState", value.asInstanceOf[js.Any])
    
    inline def setPrivateConnectionProvisioningStateUndefined: Self = StObject.set(x, "privateConnectionProvisioningState", js.undefined)
  }
}
