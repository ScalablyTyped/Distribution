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
    *  The Amazon Resource Name (ARN) of the connector profile. 
    */
  var connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.undefined
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the AWS account. 
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
  var createdAt: js.UndefOr[Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the connector profile credentials. 
    */
  var credentialsArn: js.UndefOr[ARN] = js.undefined
  
  /**
    *  Specifies when the connector profile was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[Date] = js.undefined
}
object ConnectorProfile {
  
  @scala.inline
  def apply(): ConnectorProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorProfile]
  }
  
  @scala.inline
  implicit class ConnectorProfileMutableBuilder[Self <: ConnectorProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionMode(value: ConnectionMode): Self = StObject.set(x, "connectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionModeUndefined: Self = StObject.set(x, "connectionMode", js.undefined)
    
    @scala.inline
    def setConnectorProfileArn(value: ConnectorProfileArn): Self = StObject.set(x, "connectorProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileArnUndefined: Self = StObject.set(x, "connectorProfileArn", js.undefined)
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    @scala.inline
    def setConnectorProfileProperties(value: ConnectorProfileProperties): Self = StObject.set(x, "connectorProfileProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfilePropertiesUndefined: Self = StObject.set(x, "connectorProfileProperties", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCredentialsArn(value: ARN): Self = StObject.set(x, "credentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsArnUndefined: Self = StObject.set(x, "credentialsArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
  }
}
