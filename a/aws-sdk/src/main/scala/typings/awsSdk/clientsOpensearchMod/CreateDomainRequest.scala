package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainRequest extends StObject {
  
  /**
    * Identity and Access Management (IAM) policy document specifying the access policies for the new domain.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * Key-value pairs to specify advanced configuration options. The following key-value pairs are supported:    "rest.action.multi.allow_explicit_index": "true" | "false" - Note the use of a string rather than a boolean. Specifies whether explicit references to indexes are allowed inside the body of HTTP requests. If you want to configure access policies for domain sub-resources, such as specific indexes and domain APIs, you must disable this property. Default is true.    "indices.fielddata.cache.size": "80"  - Note the use of a string rather than a boolean. Specifies the percentage of heap space allocated to field data. Default is unbounded.    "indices.query.bool.max_clause_count": "1024" - Note the use of a string rather than a boolean. Specifies the maximum number of clauses allowed in a Lucene boolean query. Default is 1,024. Queries with more than the permitted number of clauses result in a TooManyClauses error.    "override_main_response_version": "true" | "false" - Note the use of a string rather than a boolean. Specifies whether the domain reports its version as 7.10 to allow Elasticsearch OSS clients and plugins to continue working with it. Default is false when creating a domain and true when upgrading a domain.   For more information, see Advanced cluster parameters.
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AdvancedOptions] = js.undefined
  
  /**
    * Options for fine-grained access control.
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.undefined
  
  /**
    * Options for Auto-Tune.
    */
  var AutoTuneOptions: js.UndefOr[AutoTuneOptionsInput] = js.undefined
  
  /**
    * Container for the cluster configuration of a domain.
    */
  var ClusterConfig: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ClusterConfig] = js.undefined
  
  /**
    * Key-value pairs to configure Amazon Cognito authentication. For more information, see Configuring Amazon Cognito authentication for OpenSearch Dashboards.
    */
  var CognitoOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.CognitoOptions] = js.undefined
  
  /**
    * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainEndpointOptions] = js.undefined
  
  /**
    * Name of the OpenSearch Service domain to create. Domain names are unique across the domains owned by an account within an Amazon Web Services Region.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
    */
  var EBSOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.EBSOptions] = js.undefined
  
  /**
    * Key-value pairs to enable encryption at rest.
    */
  var EncryptionAtRestOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.EncryptionAtRestOptions] = js.undefined
  
  /**
    * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch Service domain. For example, OpenSearch_1.0 or Elasticsearch_7.9. For more information, see Creating and managing Amazon OpenSearch Service domains.
    */
  var EngineVersion: js.UndefOr[VersionString] = js.undefined
  
  /**
    * Key-value pairs to configure slow log publishing.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.LogPublishingOptions] = js.undefined
  
  /**
    * Enables node-to-node encryption.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NodeToNodeEncryptionOptions] = js.undefined
  
  /**
    * DEPRECATED. Container for the parameters required to configure automated snapshots of domain indexes.
    */
  var SnapshotOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.SnapshotOptions] = js.undefined
  
  /**
    * List of tags to add to the domain upon creation.
    */
  var TagList: js.UndefOr[typings.awsSdk.clientsOpensearchMod.TagList] = js.undefined
  
  /**
    * Container for the values required to configure VPC access domains. If you don't specify these values, OpenSearch Service creates the domain with a public endpoint. For more information, see Launching your Amazon OpenSearch Service domains using a VPC.
    */
  var VPCOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.VPCOptions] = js.undefined
}
object CreateDomainRequest {
  
  inline def apply(DomainName: DomainName): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
  
  extension [Self <: CreateDomainRequest](x: Self) {
    
    inline def setAccessPolicies(value: PolicyDocument): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    inline def setAdvancedOptions(value: AdvancedOptions): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    inline def setAdvancedSecurityOptions(value: AdvancedSecurityOptionsInput): Self = StObject.set(x, "AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "AdvancedSecurityOptions", js.undefined)
    
    inline def setAutoTuneOptions(value: AutoTuneOptionsInput): Self = StObject.set(x, "AutoTuneOptions", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneOptionsUndefined: Self = StObject.set(x, "AutoTuneOptions", js.undefined)
    
    inline def setClusterConfig(value: ClusterConfig): Self = StObject.set(x, "ClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigUndefined: Self = StObject.set(x, "ClusterConfig", js.undefined)
    
    inline def setCognitoOptions(value: CognitoOptions): Self = StObject.set(x, "CognitoOptions", value.asInstanceOf[js.Any])
    
    inline def setCognitoOptionsUndefined: Self = StObject.set(x, "CognitoOptions", js.undefined)
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptions): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEBSOptions(value: EBSOptions): Self = StObject.set(x, "EBSOptions", value.asInstanceOf[js.Any])
    
    inline def setEBSOptionsUndefined: Self = StObject.set(x, "EBSOptions", js.undefined)
    
    inline def setEncryptionAtRestOptions(value: EncryptionAtRestOptions): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    inline def setEngineVersion(value: VersionString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setLogPublishingOptions(value: LogPublishingOptions): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    inline def setNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptions): Self = StObject.set(x, "NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setNodeToNodeEncryptionOptionsUndefined: Self = StObject.set(x, "NodeToNodeEncryptionOptions", js.undefined)
    
    inline def setSnapshotOptions(value: SnapshotOptions): Self = StObject.set(x, "SnapshotOptions", value.asInstanceOf[js.Any])
    
    inline def setSnapshotOptionsUndefined: Self = StObject.set(x, "SnapshotOptions", js.undefined)
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
    
    inline def setVPCOptions(value: VPCOptions): Self = StObject.set(x, "VPCOptions", value.asInstanceOf[js.Any])
    
    inline def setVPCOptionsUndefined: Self = StObject.set(x, "VPCOptions", js.undefined)
  }
}
