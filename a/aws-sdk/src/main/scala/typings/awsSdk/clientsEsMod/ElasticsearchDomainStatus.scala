package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchDomainStatus extends StObject {
  
  /**
    * The Amazon resource name (ARN) of an Elasticsearch domain. See Identifiers for IAM Entities in Using AWS Identity and Access Management for more information.
    */
  var ARN: typings.awsSdk.clientsEsMod.ARN
  
  /**
    *  IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * Specifies the status of the AdvancedOptions
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.clientsEsMod.AdvancedOptions] = js.undefined
  
  /**
    * The current status of the Elasticsearch domain's advanced security options.
    */
  var AdvancedSecurityOptions: js.UndefOr[typings.awsSdk.clientsEsMod.AdvancedSecurityOptions] = js.undefined
  
  /**
    * The current status of the Elasticsearch domain's Auto-Tune options.
    */
  var AutoTuneOptions: js.UndefOr[AutoTuneOptionsOutput] = js.undefined
  
  /**
    * Specifies change details of the domain configuration change.
    */
  var ChangeProgressDetails: js.UndefOr[typings.awsSdk.clientsEsMod.ChangeProgressDetails] = js.undefined
  
  /**
    * The CognitoOptions for the specified domain. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typings.awsSdk.clientsEsMod.CognitoOptions] = js.undefined
  
  /**
    * The domain creation status. True if the creation of an Elasticsearch domain is complete. False if domain creation is still in progress.
    */
  var Created: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The domain deletion status. True if a delete request has been received for the domain but resource cleanup is still in progress. False if the domain has not been deleted. Once domain deletion is complete, the status of the domain is no longer returned.
    */
  var Deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current status of the Elasticsearch domain's endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsSdk.clientsEsMod.DomainEndpointOptions] = js.undefined
  
  /**
    * The unique identifier for the specified Elasticsearch domain.
    */
  var DomainId: typings.awsSdk.clientsEsMod.DomainId
  
  /**
    * The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within an AWS region. Domain names start with a letter or number and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
  
  /**
    * The EBSOptions for the specified domain. See Configuring EBS-based Storage for more information.
    */
  var EBSOptions: js.UndefOr[typings.awsSdk.clientsEsMod.EBSOptions] = js.undefined
  
  /**
    * The type and number of instances in the domain cluster.
    */
  var ElasticsearchClusterConfig: typings.awsSdk.clientsEsMod.ElasticsearchClusterConfig
  
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
  
  /**
    *  Specifies the status of the EncryptionAtRestOptions.
    */
  var EncryptionAtRestOptions: js.UndefOr[typings.awsSdk.clientsEsMod.EncryptionAtRestOptions] = js.undefined
  
  /**
    * The Elasticsearch domain endpoint that you use to submit index and search requests.
    */
  var Endpoint: js.UndefOr[ServiceUrl] = js.undefined
  
  /**
    * Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example key, value: 'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'.
    */
  var Endpoints: js.UndefOr[EndpointsMap] = js.undefined
  
  /**
    * Log publishing options for the given domain.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.clientsEsMod.LogPublishingOptions] = js.undefined
  
  /**
    * Specifies the status of the NodeToNodeEncryptionOptions.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typings.awsSdk.clientsEsMod.NodeToNodeEncryptionOptions] = js.undefined
  
  /**
    * The status of the Elasticsearch domain configuration. True if Amazon Elasticsearch Service is processing configuration changes. False if the configuration is active.
    */
  var Processing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current status of the Elasticsearch domain's service software.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.clientsEsMod.ServiceSoftwareOptions] = js.undefined
  
  /**
    * Specifies the status of the SnapshotOptions
    */
  var SnapshotOptions: js.UndefOr[typings.awsSdk.clientsEsMod.SnapshotOptions] = js.undefined
  
  /**
    * The status of an Elasticsearch domain version upgrade. True if Amazon Elasticsearch Service is undergoing a version upgrade. False if the configuration is active.
    */
  var UpgradeProcessing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The VPCOptions for the specified domain. For more information, see VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfo] = js.undefined
}
object ElasticsearchDomainStatus {
  
  inline def apply(
    ARN: ARN,
    DomainId: DomainId,
    DomainName: DomainName,
    ElasticsearchClusterConfig: ElasticsearchClusterConfig
  ): ElasticsearchDomainStatus = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ElasticsearchClusterConfig = ElasticsearchClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchDomainStatus]
  }
  
  extension [Self <: ElasticsearchDomainStatus](x: Self) {
    
    inline def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setAccessPolicies(value: PolicyDocument): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    inline def setAdvancedOptions(value: AdvancedOptions): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    inline def setAdvancedSecurityOptions(value: AdvancedSecurityOptions): Self = StObject.set(x, "AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "AdvancedSecurityOptions", js.undefined)
    
    inline def setAutoTuneOptions(value: AutoTuneOptionsOutput): Self = StObject.set(x, "AutoTuneOptions", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneOptionsUndefined: Self = StObject.set(x, "AutoTuneOptions", js.undefined)
    
    inline def setChangeProgressDetails(value: ChangeProgressDetails): Self = StObject.set(x, "ChangeProgressDetails", value.asInstanceOf[js.Any])
    
    inline def setChangeProgressDetailsUndefined: Self = StObject.set(x, "ChangeProgressDetails", js.undefined)
    
    inline def setCognitoOptions(value: CognitoOptions): Self = StObject.set(x, "CognitoOptions", value.asInstanceOf[js.Any])
    
    inline def setCognitoOptionsUndefined: Self = StObject.set(x, "CognitoOptions", js.undefined)
    
    inline def setCreated(value: Boolean): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "Deleted", js.undefined)
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptions): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEBSOptions(value: EBSOptions): Self = StObject.set(x, "EBSOptions", value.asInstanceOf[js.Any])
    
    inline def setEBSOptionsUndefined: Self = StObject.set(x, "EBSOptions", js.undefined)
    
    inline def setElasticsearchClusterConfig(value: ElasticsearchClusterConfig): Self = StObject.set(x, "ElasticsearchClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchVersion(value: ElasticsearchVersionString): Self = StObject.set(x, "ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchVersionUndefined: Self = StObject.set(x, "ElasticsearchVersion", js.undefined)
    
    inline def setEncryptionAtRestOptions(value: EncryptionAtRestOptions): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    inline def setEndpoint(value: ServiceUrl): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setEndpoints(value: EndpointsMap): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setLogPublishingOptions(value: LogPublishingOptions): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    inline def setNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptions): Self = StObject.set(x, "NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setNodeToNodeEncryptionOptionsUndefined: Self = StObject.set(x, "NodeToNodeEncryptionOptions", js.undefined)
    
    inline def setProcessing(value: Boolean): Self = StObject.set(x, "Processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingUndefined: Self = StObject.set(x, "Processing", js.undefined)
    
    inline def setServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = StObject.set(x, "ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    inline def setServiceSoftwareOptionsUndefined: Self = StObject.set(x, "ServiceSoftwareOptions", js.undefined)
    
    inline def setSnapshotOptions(value: SnapshotOptions): Self = StObject.set(x, "SnapshotOptions", value.asInstanceOf[js.Any])
    
    inline def setSnapshotOptionsUndefined: Self = StObject.set(x, "SnapshotOptions", js.undefined)
    
    inline def setUpgradeProcessing(value: Boolean): Self = StObject.set(x, "UpgradeProcessing", value.asInstanceOf[js.Any])
    
    inline def setUpgradeProcessingUndefined: Self = StObject.set(x, "UpgradeProcessing", js.undefined)
    
    inline def setVPCOptions(value: VPCDerivedInfo): Self = StObject.set(x, "VPCOptions", value.asInstanceOf[js.Any])
    
    inline def setVPCOptionsUndefined: Self = StObject.set(x, "VPCOptions", js.undefined)
  }
}
