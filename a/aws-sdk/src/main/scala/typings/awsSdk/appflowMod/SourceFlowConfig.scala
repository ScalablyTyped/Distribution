package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFlowConfig extends StObject {
  
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
  implicit class SourceFlowConfigMutableBuilder[Self <: SourceFlowConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementalPullConfig(value: IncrementalPullConfig): Self = StObject.set(x, "incrementalPullConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementalPullConfigUndefined: Self = StObject.set(x, "incrementalPullConfig", js.undefined)
    
    @scala.inline
    def setSourceConnectorProperties(value: SourceConnectorProperties): Self = StObject.set(x, "sourceConnectorProperties", value.asInstanceOf[js.Any])
  }
}
