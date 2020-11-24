package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConnectorProfileRequest extends js.Object {
  
  /**
    *  Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. 
    */
  var connectionMode: ConnectionMode = js.native
  
  /**
    *  Defines the connector-specific configuration and credentials. 
    */
  var connectorProfileConfig: ConnectorProfileConfig = js.native
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in your AWS account. 
    */
  var connectorProfileName: ConnectorProfileName = js.native
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: ConnectorType = js.native
  
  /**
    *  The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key. 
    */
  var kmsArn: js.UndefOr[KMSArn] = js.native
}
object CreateConnectorProfileRequest {
  
  @scala.inline
  def apply(
    connectionMode: ConnectionMode,
    connectorProfileConfig: ConnectorProfileConfig,
    connectorProfileName: ConnectorProfileName,
    connectorType: ConnectorType
  ): CreateConnectorProfileRequest = {
    val __obj = js.Dynamic.literal(connectionMode = connectionMode.asInstanceOf[js.Any], connectorProfileConfig = connectorProfileConfig.asInstanceOf[js.Any], connectorProfileName = connectorProfileName.asInstanceOf[js.Any], connectorType = connectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectorProfileRequest]
  }
  
  @scala.inline
  implicit class CreateConnectorProfileRequestOps[Self <: CreateConnectorProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setConnectorProfileConfig(value: ConnectorProfileConfig): Self = this.set("connectorProfileConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = this.set("connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = this.set("connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsArn(value: KMSArn): Self = this.set("kmsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsArn: Self = this.set("kmsArn", js.undefined)
  }
}
