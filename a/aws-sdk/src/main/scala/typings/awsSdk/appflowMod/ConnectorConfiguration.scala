package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorConfiguration extends StObject {
  
  /**
    *  Specifies whether the connector can be used as a destination. 
    */
  var canUseAsDestination: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Specifies whether the connector can be used as a source. 
    */
  var canUseAsSource: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Specifies connector-specific metadata such as oAuthScopes, supportedRegions, privateLinkServiceUrl, and so on. 
    */
  var connectorMetadata: js.UndefOr[ConnectorMetadata] = js.undefined
  
  /**
    *  Specifies if PrivateLink is enabled for that connector. 
    */
  var isPrivateLinkEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Specifies if a PrivateLink endpoint URL is required. 
    */
  var isPrivateLinkEndpointUrlRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Lists the connectors that are available for use as destinations. 
    */
  var supportedDestinationConnectors: js.UndefOr[ConnectorTypeList] = js.undefined
  
  /**
    *  Specifies the supported flow frequency for that connector. 
    */
  var supportedSchedulingFrequencies: js.UndefOr[SchedulingFrequencyTypeList] = js.undefined
  
  /**
    *  Specifies the supported trigger types for the flow. 
    */
  var supportedTriggerTypes: js.UndefOr[TriggerTypeList] = js.undefined
}
object ConnectorConfiguration {
  
  inline def apply(): ConnectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorConfiguration]
  }
  
  extension [Self <: ConnectorConfiguration](x: Self) {
    
    inline def setCanUseAsDestination(value: Boolean): Self = StObject.set(x, "canUseAsDestination", value.asInstanceOf[js.Any])
    
    inline def setCanUseAsDestinationUndefined: Self = StObject.set(x, "canUseAsDestination", js.undefined)
    
    inline def setCanUseAsSource(value: Boolean): Self = StObject.set(x, "canUseAsSource", value.asInstanceOf[js.Any])
    
    inline def setCanUseAsSourceUndefined: Self = StObject.set(x, "canUseAsSource", js.undefined)
    
    inline def setConnectorMetadata(value: ConnectorMetadata): Self = StObject.set(x, "connectorMetadata", value.asInstanceOf[js.Any])
    
    inline def setConnectorMetadataUndefined: Self = StObject.set(x, "connectorMetadata", js.undefined)
    
    inline def setIsPrivateLinkEnabled(value: Boolean): Self = StObject.set(x, "isPrivateLinkEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateLinkEnabledUndefined: Self = StObject.set(x, "isPrivateLinkEnabled", js.undefined)
    
    inline def setIsPrivateLinkEndpointUrlRequired(value: Boolean): Self = StObject.set(x, "isPrivateLinkEndpointUrlRequired", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateLinkEndpointUrlRequiredUndefined: Self = StObject.set(x, "isPrivateLinkEndpointUrlRequired", js.undefined)
    
    inline def setSupportedDestinationConnectors(value: ConnectorTypeList): Self = StObject.set(x, "supportedDestinationConnectors", value.asInstanceOf[js.Any])
    
    inline def setSupportedDestinationConnectorsUndefined: Self = StObject.set(x, "supportedDestinationConnectors", js.undefined)
    
    inline def setSupportedDestinationConnectorsVarargs(value: ConnectorType*): Self = StObject.set(x, "supportedDestinationConnectors", js.Array(value :_*))
    
    inline def setSupportedSchedulingFrequencies(value: SchedulingFrequencyTypeList): Self = StObject.set(x, "supportedSchedulingFrequencies", value.asInstanceOf[js.Any])
    
    inline def setSupportedSchedulingFrequenciesUndefined: Self = StObject.set(x, "supportedSchedulingFrequencies", js.undefined)
    
    inline def setSupportedSchedulingFrequenciesVarargs(value: ScheduleFrequencyType*): Self = StObject.set(x, "supportedSchedulingFrequencies", js.Array(value :_*))
    
    inline def setSupportedTriggerTypes(value: TriggerTypeList): Self = StObject.set(x, "supportedTriggerTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedTriggerTypesUndefined: Self = StObject.set(x, "supportedTriggerTypes", js.undefined)
    
    inline def setSupportedTriggerTypesVarargs(value: TriggerType*): Self = StObject.set(x, "supportedTriggerTypes", js.Array(value :_*))
  }
}
