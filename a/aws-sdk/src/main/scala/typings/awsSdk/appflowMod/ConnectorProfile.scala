package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorProfile extends js.Object {
  
  /**
    *  Indicates the connection mode and if it is public or private. 
    */
  var connectionMode: js.UndefOr[ConnectionMode] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the connector profile. 
    */
  var connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.native
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the AWS account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.native
  
  /**
    *  The connector-specific properties of the profile configuration. 
    */
  var connectorProfileProperties: js.UndefOr[ConnectorProfileProperties] = js.native
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.native
  
  /**
    *  Specifies when the connector profile was created. 
    */
  var createdAt: js.UndefOr[Date] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the connector profile credentials. 
    */
  var credentialsArn: js.UndefOr[ARN] = js.native
  
  /**
    *  Specifies when the connector profile was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[Date] = js.native
}
object ConnectorProfile {
  
  @scala.inline
  def apply(): ConnectorProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorProfile]
  }
  
  @scala.inline
  implicit class ConnectorProfileOps[Self <: ConnectorProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionMode(value: ConnectionMode): Self = this.set("connectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionMode: Self = this.set("connectionMode", js.undefined)
    
    @scala.inline
    def setConnectorProfileArn(value: ConnectorProfileArn): Self = this.set("connectorProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileArn: Self = this.set("connectorProfileArn", js.undefined)
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = this.set("connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileName: Self = this.set("connectorProfileName", js.undefined)
    
    @scala.inline
    def setConnectorProfileProperties(value: ConnectorProfileProperties): Self = this.set("connectorProfileProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileProperties: Self = this.set("connectorProfileProperties", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = this.set("connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorType: Self = this.set("connectorType", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setCredentialsArn(value: ARN): Self = this.set("credentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialsArn: Self = this.set("credentialsArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Date): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
  }
}
