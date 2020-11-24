package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFlowConfig extends js.Object {
  
  /**
    *  The name of the connector profile. This name must be unique for each connector profile in the AWS account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.native
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: ConnectorType = js.native
  
  /**
    *  Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields specified in the configuration are used when querying for the incremental data pull. 
    */
  var incrementalPullConfig: js.UndefOr[IncrementalPullConfig] = js.native
  
  /**
    *  Specifies the information that is required to query a particular source connector. 
    */
  var sourceConnectorProperties: SourceConnectorProperties = js.native
}
object SourceFlowConfig {
  
  @scala.inline
  def apply(connectorType: ConnectorType, sourceConnectorProperties: SourceConnectorProperties): SourceFlowConfig = {
    val __obj = js.Dynamic.literal(connectorType = connectorType.asInstanceOf[js.Any], sourceConnectorProperties = sourceConnectorProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFlowConfig]
  }
  
  @scala.inline
  implicit class SourceFlowConfigOps[Self <: SourceFlowConfig] (val x: Self) extends AnyVal {
    
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
    def setSourceConnectorProperties(value: SourceConnectorProperties): Self = this.set("sourceConnectorProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = this.set("connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorProfileName: Self = this.set("connectorProfileName", js.undefined)
    
    @scala.inline
    def setIncrementalPullConfig(value: IncrementalPullConfig): Self = this.set("incrementalPullConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementalPullConfig: Self = this.set("incrementalPullConfig", js.undefined)
  }
}
