package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateConnectorProfileRequest extends js.Object {
  
  /**
    *  Indicates the connection mode and if it is public or private. 
    */
  var connectionMode: ConnectionMode = js.native
  
  /**
    *  Defines the connector-specific profile configuration and credentials. 
    */
  var connectorProfileConfig: ConnectorProfileConfig = js.native
  
  /**
    *  The name of the connector profile and is unique for each ConnectorProfile in the AWS Account. 
    */
  var connectorProfileName: ConnectorProfileName = js.native
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
  implicit class UpdateConnectorProfileRequestOps[Self <: UpdateConnectorProfileRequest] (val x: Self) extends AnyVal {
    
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
  }
}
