package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainStatus extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the domain. For more information, see IAM identifiers  in the AWS Identity and Access Management User Guide.
    */
  var ARN: typings.awsSdk.clientsOpensearchMod.ARN
  
  /**
    * Identity and Access Management (IAM) policy document specifying the access policies for the domain.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * Key-value pairs that specify advanced configuration options.
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AdvancedOptions] = js.undefined
  
  /**
    * Settings for fine-grained access control.
    */
  var AdvancedSecurityOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AdvancedSecurityOptions] = js.undefined
  
  /**
    * Auto-Tune settings for the domain.
    */
  var AutoTuneOptions: js.UndefOr[AutoTuneOptionsOutput] = js.undefined
  
  /**
    * Information about a configuration change happening on the domain.
    */
  var ChangeProgressDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ChangeProgressDetails] = js.undefined
  
  /**
    * Container for the cluster configuration of the domain.
    */
  var ClusterConfig: typings.awsSdk.clientsOpensearchMod.ClusterConfig
  
  /**
    * Key-value pairs to configure Amazon Cognito authentication for OpenSearch Dashboards.
    */
  var CognitoOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.CognitoOptions] = js.undefined
  
  /**
    * Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain creation is still in progress.
    */
  var Created: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain deletion is still in progress. Once deletion is complete, the status of the domain is no longer returned.
    */
  var Deleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainEndpointOptions] = js.undefined
  
  /**
    * Unique identifier for the domain.
    */
  var DomainId: typings.awsSdk.clientsOpensearchMod.DomainId
  
  /**
    * Name of the domain. Domain names are unique across all domains owned by the same account within an Amazon Web Services Region.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * Container for EBS-based storage settings for the domain.
    */
  var EBSOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.EBSOptions] = js.undefined
  
  /**
    * Encryption at rest settings for the domain.
    */
  var EncryptionAtRestOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.EncryptionAtRestOptions] = js.undefined
  
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests to the domain.
    */
  var Endpoint: js.UndefOr[ServiceUrl] = js.undefined
  
  /**
    * The key-value pair that exists if the OpenSearch Service domain uses VPC endpoints.. Example key, value: 'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'.
    */
  var Endpoints: js.UndefOr[EndpointsMap] = js.undefined
  
  /**
    * Version of OpenSearch or Elasticsearch that the domain is running, in the format Elasticsearch_X.Y or OpenSearch_X.Y.
    */
  var EngineVersion: js.UndefOr[VersionString] = js.undefined
  
  /**
    * Log publishing options for the domain.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.LogPublishingOptions] = js.undefined
  
  /**
    * Whether node-to-node encryption is enabled or disabled.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NodeToNodeEncryptionOptions] = js.undefined
  
  /**
    * The status of the domain configuration. True if OpenSearch Service is processing configuration changes. False if the configuration is active.
    */
  var Processing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current status of the domain's service software.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ServiceSoftwareOptions] = js.undefined
  
  /**
    * DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
    */
  var SnapshotOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.SnapshotOptions] = js.undefined
  
  /**
    * The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if OpenSearch Service is in the process of a version upgrade. False if the configuration is active.
    */
  var UpgradeProcessing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The VPC configuration for the domain.
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfo] = js.undefined
}
object DomainStatus {
  
  inline def apply(ARN: ARN, ClusterConfig: ClusterConfig, DomainId: DomainId, DomainName: DomainName): DomainStatus = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], ClusterConfig = ClusterConfig.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainStatus]
  }
  
  extension [Self <: DomainStatus](x: Self) {
    
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
    
    inline def setClusterConfig(value: ClusterConfig): Self = StObject.set(x, "ClusterConfig", value.asInstanceOf[js.Any])
    
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
    
    inline def setEncryptionAtRestOptions(value: EncryptionAtRestOptions): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    inline def setEndpoint(value: ServiceUrl): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setEndpoints(value: EndpointsMap): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEngineVersion(value: VersionString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
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
