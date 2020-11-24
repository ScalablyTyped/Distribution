package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorProfileConfig extends js.Object {
  
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
  implicit class ConnectorProfileConfigOps[Self <: ConnectorProfileConfig] (val x: Self) extends AnyVal {
    
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
    def setConnectorProfileCredentials(value: ConnectorProfileCredentials): Self = this.set("connectorProfileCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileProperties(value: ConnectorProfileProperties): Self = this.set("connectorProfileProperties", value.asInstanceOf[js.Any])
  }
}
