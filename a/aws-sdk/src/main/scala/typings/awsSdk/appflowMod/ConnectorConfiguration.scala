package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorConfiguration extends js.Object {
  
  /**
    *  Specifies whether the connector can be used as a destination. 
    */
  var canUseAsDestination: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies whether the connector can be used as a source. 
    */
  var canUseAsSource: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies connector-specific metadata such as oAuthScopes, supportedRegions, privateLinkServiceUrl, and so on. 
    */
  var connectorMetadata: js.UndefOr[ConnectorMetadata] = js.native
  
  /**
    *  Specifies if PrivateLink is enabled for that connector. 
    */
  var isPrivateLinkEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    *  Specifies if a PrivateLink endpoint URL is required. 
    */
  var isPrivateLinkEndpointUrlRequired: js.UndefOr[Boolean] = js.native
  
  /**
    *  Lists the connectors that are available for use as destinations. 
    */
  var supportedDestinationConnectors: js.UndefOr[ConnectorTypeList] = js.native
  
  /**
    *  Specifies the supported flow frequency for that connector. 
    */
  var supportedSchedulingFrequencies: js.UndefOr[SchedulingFrequencyTypeList] = js.native
  
  /**
    *  Specifies the supported trigger types for the flow. 
    */
  var supportedTriggerTypes: js.UndefOr[TriggerTypeList] = js.native
}
object ConnectorConfiguration {
  
  @scala.inline
  def apply(): ConnectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorConfiguration]
  }
  
  @scala.inline
  implicit class ConnectorConfigurationOps[Self <: ConnectorConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCanUseAsDestination(value: Boolean): Self = this.set("canUseAsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUseAsDestination: Self = this.set("canUseAsDestination", js.undefined)
    
    @scala.inline
    def setCanUseAsSource(value: Boolean): Self = this.set("canUseAsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUseAsSource: Self = this.set("canUseAsSource", js.undefined)
    
    @scala.inline
    def setConnectorMetadata(value: ConnectorMetadata): Self = this.set("connectorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorMetadata: Self = this.set("connectorMetadata", js.undefined)
    
    @scala.inline
    def setIsPrivateLinkEnabled(value: Boolean): Self = this.set("isPrivateLinkEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrivateLinkEnabled: Self = this.set("isPrivateLinkEnabled", js.undefined)
    
    @scala.inline
    def setIsPrivateLinkEndpointUrlRequired(value: Boolean): Self = this.set("isPrivateLinkEndpointUrlRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrivateLinkEndpointUrlRequired: Self = this.set("isPrivateLinkEndpointUrlRequired", js.undefined)
    
    @scala.inline
    def setSupportedDestinationConnectorsVarargs(value: ConnectorType*): Self = this.set("supportedDestinationConnectors", js.Array(value :_*))
    
    @scala.inline
    def setSupportedDestinationConnectors(value: ConnectorTypeList): Self = this.set("supportedDestinationConnectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedDestinationConnectors: Self = this.set("supportedDestinationConnectors", js.undefined)
    
    @scala.inline
    def setSupportedSchedulingFrequenciesVarargs(value: ScheduleFrequencyType*): Self = this.set("supportedSchedulingFrequencies", js.Array(value :_*))
    
    @scala.inline
    def setSupportedSchedulingFrequencies(value: SchedulingFrequencyTypeList): Self = this.set("supportedSchedulingFrequencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedSchedulingFrequencies: Self = this.set("supportedSchedulingFrequencies", js.undefined)
    
    @scala.inline
    def setSupportedTriggerTypesVarargs(value: TriggerType*): Self = this.set("supportedTriggerTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedTriggerTypes(value: TriggerTypeList): Self = this.set("supportedTriggerTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedTriggerTypes: Self = this.set("supportedTriggerTypes", js.undefined)
  }
}
