package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationFlowConfig extends js.Object {
  
  /**
    *  The name of the connector profile. This name must be unique for each connector profile in the AWS account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.native
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: ConnectorType = js.native
  
  /**
    *  This stores the information that is required to query a particular connector. 
    */
  var destinationConnectorProperties: DestinationConnectorProperties = js.native
}
object DestinationFlowConfig {
  
  @scala.inline
  def apply(connectorType: ConnectorType, destinationConnectorProperties: DestinationConnectorProperties): DestinationFlowConfig = {
    val __obj = js.Dynamic.literal(connectorType = connectorType.asInstanceOf[js.Any], destinationConnectorProperties = destinationConnectorProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationFlowConfig]
  }
  
  @scala.inline
  implicit class DestinationFlowConfigOps[Self <: DestinationFlowConfig] (val x: Self) extends AnyVal {
    
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
    def setConnectorType(value: ConnectorType): Self = this.set("connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationConnectorProperties(value: DestinationConnectorProperties): Self = this.set("destinationConnectorProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = this.set("connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileName: Self = this.set("connectorProfileName", js.undefined)
  }
}
