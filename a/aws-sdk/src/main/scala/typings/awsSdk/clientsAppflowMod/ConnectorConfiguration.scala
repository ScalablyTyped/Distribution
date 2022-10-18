package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorConfiguration extends StObject {
  
  /**
    * The authentication config required for the connector.
    */
  var authenticationConfig: js.UndefOr[AuthenticationConfig] = js.undefined
  
  /**
    *  Specifies whether the connector can be used as a destination. 
    */
  var canUseAsDestination: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Specifies whether the connector can be used as a source. 
    */
  var canUseAsSource: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the registered connector.
    */
  var connectorArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * A description about the connector.
    */
  var connectorDescription: js.UndefOr[ConnectorDescription] = js.undefined
  
  /**
    * The label used for registering the connector.
    */
  var connectorLabel: js.UndefOr[ConnectorLabel] = js.undefined
  
  /**
    *  Specifies connector-specific metadata such as oAuthScopes, supportedRegions, privateLinkServiceUrl, and so on. 
    */
  var connectorMetadata: js.UndefOr[ConnectorMetadata] = js.undefined
  
  /**
    * The connection modes that the connector supports.
    */
  var connectorModes: js.UndefOr[ConnectorModeList] = js.undefined
  
  /**
    * The connector name.
    */
  var connectorName: js.UndefOr[ConnectorName] = js.undefined
  
  /**
    * The owner who developed the connector.
    */
  var connectorOwner: js.UndefOr[ConnectorOwner] = js.undefined
  
  /**
    * The configuration required for registering the connector.
    */
  var connectorProvisioningConfig: js.UndefOr[ConnectorProvisioningConfig] = js.undefined
  
  /**
    * The provisioning type used to register the connector.
    */
  var connectorProvisioningType: js.UndefOr[ConnectorProvisioningType] = js.undefined
  
  /**
    * The required connector runtime settings.
    */
  var connectorRuntimeSettings: js.UndefOr[ConnectorRuntimeSettingList] = js.undefined
  
  /**
    * The connector type.
    */
  var connectorType: js.UndefOr[ConnectorType] = js.undefined
  
  /**
    * The connector version.
    */
  var connectorVersion: js.UndefOr[ConnectorVersion] = js.undefined
  
  /**
    *  Specifies if PrivateLink is enabled for that connector. 
    */
  var isPrivateLinkEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Specifies if a PrivateLink endpoint URL is required. 
    */
  var isPrivateLinkEndpointUrlRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Logo URL of the connector.
    */
  var logoURL: js.UndefOr[LogoURL] = js.undefined
  
  /**
    * The date on which the connector was registered.
    */
  var registeredAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about who registered the connector.
    */
  var registeredBy: js.UndefOr[RegisteredBy] = js.undefined
  
  /**
    * A list of API versions that are supported by the connector.
    */
  var supportedApiVersions: js.UndefOr[SupportedApiVersionList] = js.undefined
  
  /**
    *  Lists the connectors that are available for use as destinations. 
    */
  var supportedDestinationConnectors: js.UndefOr[ConnectorTypeList] = js.undefined
  
  /**
    * A list of operators supported by the connector.
    */
  var supportedOperators: js.UndefOr[SupportedOperatorList] = js.undefined
  
  /**
    *  Specifies the supported flow frequency for that connector. 
    */
  var supportedSchedulingFrequencies: js.UndefOr[SchedulingFrequencyTypeList] = js.undefined
  
  /**
    *  Specifies the supported trigger types for the flow. 
    */
  var supportedTriggerTypes: js.UndefOr[TriggerTypeList] = js.undefined
  
  /**
    * A list of write operations supported by the connector.
    */
  var supportedWriteOperations: js.UndefOr[SupportedWriteOperationList] = js.undefined
}
object ConnectorConfiguration {
  
  inline def apply(): ConnectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorConfiguration]
  }
  
  extension [Self <: ConnectorConfiguration](x: Self) {
    
    inline def setAuthenticationConfig(value: AuthenticationConfig): Self = StObject.set(x, "authenticationConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationConfigUndefined: Self = StObject.set(x, "authenticationConfig", js.undefined)
    
    inline def setCanUseAsDestination(value: Boolean): Self = StObject.set(x, "canUseAsDestination", value.asInstanceOf[js.Any])
    
    inline def setCanUseAsDestinationUndefined: Self = StObject.set(x, "canUseAsDestination", js.undefined)
    
    inline def setCanUseAsSource(value: Boolean): Self = StObject.set(x, "canUseAsSource", value.asInstanceOf[js.Any])
    
    inline def setCanUseAsSourceUndefined: Self = StObject.set(x, "canUseAsSource", js.undefined)
    
    inline def setConnectorArn(value: ARN): Self = StObject.set(x, "connectorArn", value.asInstanceOf[js.Any])
    
    inline def setConnectorArnUndefined: Self = StObject.set(x, "connectorArn", js.undefined)
    
    inline def setConnectorDescription(value: ConnectorDescription): Self = StObject.set(x, "connectorDescription", value.asInstanceOf[js.Any])
    
    inline def setConnectorDescriptionUndefined: Self = StObject.set(x, "connectorDescription", js.undefined)
    
    inline def setConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "connectorLabel", value.asInstanceOf[js.Any])
    
    inline def setConnectorLabelUndefined: Self = StObject.set(x, "connectorLabel", js.undefined)
    
    inline def setConnectorMetadata(value: ConnectorMetadata): Self = StObject.set(x, "connectorMetadata", value.asInstanceOf[js.Any])
    
    inline def setConnectorMetadataUndefined: Self = StObject.set(x, "connectorMetadata", js.undefined)
    
    inline def setConnectorModes(value: ConnectorModeList): Self = StObject.set(x, "connectorModes", value.asInstanceOf[js.Any])
    
    inline def setConnectorModesUndefined: Self = StObject.set(x, "connectorModes", js.undefined)
    
    inline def setConnectorModesVarargs(value: ConnectorMode*): Self = StObject.set(x, "connectorModes", js.Array(value*))
    
    inline def setConnectorName(value: ConnectorName): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setConnectorOwner(value: ConnectorOwner): Self = StObject.set(x, "connectorOwner", value.asInstanceOf[js.Any])
    
    inline def setConnectorOwnerUndefined: Self = StObject.set(x, "connectorOwner", js.undefined)
    
    inline def setConnectorProvisioningConfig(value: ConnectorProvisioningConfig): Self = StObject.set(x, "connectorProvisioningConfig", value.asInstanceOf[js.Any])
    
    inline def setConnectorProvisioningConfigUndefined: Self = StObject.set(x, "connectorProvisioningConfig", js.undefined)
    
    inline def setConnectorProvisioningType(value: ConnectorProvisioningType): Self = StObject.set(x, "connectorProvisioningType", value.asInstanceOf[js.Any])
    
    inline def setConnectorProvisioningTypeUndefined: Self = StObject.set(x, "connectorProvisioningType", js.undefined)
    
    inline def setConnectorRuntimeSettings(value: ConnectorRuntimeSettingList): Self = StObject.set(x, "connectorRuntimeSettings", value.asInstanceOf[js.Any])
    
    inline def setConnectorRuntimeSettingsUndefined: Self = StObject.set(x, "connectorRuntimeSettings", js.undefined)
    
    inline def setConnectorRuntimeSettingsVarargs(value: ConnectorRuntimeSetting*): Self = StObject.set(x, "connectorRuntimeSettings", js.Array(value*))
    
    inline def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    inline def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    inline def setConnectorVersion(value: ConnectorVersion): Self = StObject.set(x, "connectorVersion", value.asInstanceOf[js.Any])
    
    inline def setConnectorVersionUndefined: Self = StObject.set(x, "connectorVersion", js.undefined)
    
    inline def setIsPrivateLinkEnabled(value: Boolean): Self = StObject.set(x, "isPrivateLinkEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateLinkEnabledUndefined: Self = StObject.set(x, "isPrivateLinkEnabled", js.undefined)
    
    inline def setIsPrivateLinkEndpointUrlRequired(value: Boolean): Self = StObject.set(x, "isPrivateLinkEndpointUrlRequired", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateLinkEndpointUrlRequiredUndefined: Self = StObject.set(x, "isPrivateLinkEndpointUrlRequired", js.undefined)
    
    inline def setLogoURL(value: LogoURL): Self = StObject.set(x, "logoURL", value.asInstanceOf[js.Any])
    
    inline def setLogoURLUndefined: Self = StObject.set(x, "logoURL", js.undefined)
    
    inline def setRegisteredAt(value: js.Date): Self = StObject.set(x, "registeredAt", value.asInstanceOf[js.Any])
    
    inline def setRegisteredAtUndefined: Self = StObject.set(x, "registeredAt", js.undefined)
    
    inline def setRegisteredBy(value: RegisteredBy): Self = StObject.set(x, "registeredBy", value.asInstanceOf[js.Any])
    
    inline def setRegisteredByUndefined: Self = StObject.set(x, "registeredBy", js.undefined)
    
    inline def setSupportedApiVersions(value: SupportedApiVersionList): Self = StObject.set(x, "supportedApiVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedApiVersionsUndefined: Self = StObject.set(x, "supportedApiVersions", js.undefined)
    
    inline def setSupportedApiVersionsVarargs(value: SupportedApiVersion*): Self = StObject.set(x, "supportedApiVersions", js.Array(value*))
    
    inline def setSupportedDestinationConnectors(value: ConnectorTypeList): Self = StObject.set(x, "supportedDestinationConnectors", value.asInstanceOf[js.Any])
    
    inline def setSupportedDestinationConnectorsUndefined: Self = StObject.set(x, "supportedDestinationConnectors", js.undefined)
    
    inline def setSupportedDestinationConnectorsVarargs(value: ConnectorType*): Self = StObject.set(x, "supportedDestinationConnectors", js.Array(value*))
    
    inline def setSupportedOperators(value: SupportedOperatorList): Self = StObject.set(x, "supportedOperators", value.asInstanceOf[js.Any])
    
    inline def setSupportedOperatorsUndefined: Self = StObject.set(x, "supportedOperators", js.undefined)
    
    inline def setSupportedOperatorsVarargs(value: Operators*): Self = StObject.set(x, "supportedOperators", js.Array(value*))
    
    inline def setSupportedSchedulingFrequencies(value: SchedulingFrequencyTypeList): Self = StObject.set(x, "supportedSchedulingFrequencies", value.asInstanceOf[js.Any])
    
    inline def setSupportedSchedulingFrequenciesUndefined: Self = StObject.set(x, "supportedSchedulingFrequencies", js.undefined)
    
    inline def setSupportedSchedulingFrequenciesVarargs(value: ScheduleFrequencyType*): Self = StObject.set(x, "supportedSchedulingFrequencies", js.Array(value*))
    
    inline def setSupportedTriggerTypes(value: TriggerTypeList): Self = StObject.set(x, "supportedTriggerTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedTriggerTypesUndefined: Self = StObject.set(x, "supportedTriggerTypes", js.undefined)
    
    inline def setSupportedTriggerTypesVarargs(value: TriggerType*): Self = StObject.set(x, "supportedTriggerTypes", js.Array(value*))
    
    inline def setSupportedWriteOperations(value: SupportedWriteOperationList): Self = StObject.set(x, "supportedWriteOperations", value.asInstanceOf[js.Any])
    
    inline def setSupportedWriteOperationsUndefined: Self = StObject.set(x, "supportedWriteOperations", js.undefined)
    
    inline def setSupportedWriteOperationsVarargs(value: WriteOperationType*): Self = StObject.set(x, "supportedWriteOperations", js.Array(value*))
  }
}
