package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceFlowConfig extends StObject {
  
  /**
    *  The name of the connector profile. This name must be unique for each connector profile in the AWS account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.undefined
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: ConnectorType
  
  /**
    *  Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields specified in the configuration are used when querying for the incremental data pull. 
    */
  var incrementalPullConfig: js.UndefOr[IncrementalPullConfig] = js.undefined
  
  /**
    *  Specifies the information that is required to query a particular source connector. 
    */
  var sourceConnectorProperties: SourceConnectorProperties
}
object SourceFlowConfig {
  
  inline def apply(connectorType: ConnectorType, sourceConnectorProperties: SourceConnectorProperties): SourceFlowConfig = {
    val __obj = js.Dynamic.literal(connectorType = connectorType.asInstanceOf[js.Any], sourceConnectorProperties = sourceConnectorProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFlowConfig]
  }
  
  extension [Self <: SourceFlowConfig](x: Self) {
    
    inline def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setIncrementalPullConfig(value: IncrementalPullConfig): Self = StObject.set(x, "incrementalPullConfig", value.asInstanceOf[js.Any])
    
    inline def setIncrementalPullConfigUndefined: Self = StObject.set(x, "incrementalPullConfig", js.undefined)
    
    inline def setSourceConnectorProperties(value: SourceConnectorProperties): Self = StObject.set(x, "sourceConnectorProperties", value.asInstanceOf[js.Any])
  }
}
