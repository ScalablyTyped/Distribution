package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceFlowConfig extends StObject {
  
  /**
    * The name of the AppFlow connector profile. This name must be unique for each connector profile in the AWS account.
    */
  var ConnectorProfileName: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.ConnectorProfileName] = js.undefined
  
  /**
    * The type of connector, such as Salesforce, Marketo, and so on.
    */
  var ConnectorType: SourceConnectorType
  
  /**
    * Defines the configuration for a scheduled incremental data pull. If a valid configuration is provided, the fields specified in the configuration are used when querying for the incremental data pull.
    */
  var IncrementalPullConfig: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.IncrementalPullConfig] = js.undefined
  
  /**
    * Specifies the information that is required to query a particular source connector.
    */
  var SourceConnectorProperties: typings.awsSdk.clientsCustomerprofilesMod.SourceConnectorProperties
}
object SourceFlowConfig {
  
  inline def apply(ConnectorType: SourceConnectorType, SourceConnectorProperties: SourceConnectorProperties): SourceFlowConfig = {
    val __obj = js.Dynamic.literal(ConnectorType = ConnectorType.asInstanceOf[js.Any], SourceConnectorProperties = SourceConnectorProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFlowConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceFlowConfig] (val x: Self) extends AnyVal {
    
    inline def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "ConnectorProfileName", value.asInstanceOf[js.Any])
    
    inline def setConnectorProfileNameUndefined: Self = StObject.set(x, "ConnectorProfileName", js.undefined)
    
    inline def setConnectorType(value: SourceConnectorType): Self = StObject.set(x, "ConnectorType", value.asInstanceOf[js.Any])
    
    inline def setIncrementalPullConfig(value: IncrementalPullConfig): Self = StObject.set(x, "IncrementalPullConfig", value.asInstanceOf[js.Any])
    
    inline def setIncrementalPullConfigUndefined: Self = StObject.set(x, "IncrementalPullConfig", js.undefined)
    
    inline def setSourceConnectorProperties(value: SourceConnectorProperties): Self = StObject.set(x, "SourceConnectorProperties", value.asInstanceOf[js.Any])
  }
}
