package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateElasticsearchDomainRequest extends StObject {
  
  /**
    *  IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    *  Option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Configuration Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.clientsEsMod.AdvancedOptions] = js.undefined
  
  /**
    * Specifies advanced security options.
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.undefined
  
  /**
    * Specifies Auto-Tune options.
    */
  var AutoTuneOptions: js.UndefOr[AutoTuneOptionsInput] = js.undefined
  
  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typings.awsSdk.clientsEsMod.CognitoOptions] = js.undefined
  
  /**
    * Options to specify configuration that will be applied to the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsSdk.clientsEsMod.DomainEndpointOptions] = js.undefined
  
  /**
    * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by an account within an AWS region. Domain names must start with a lowercase letter and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
  
  /**
    * Options to enable, disable and specify the type and size of EBS storage volumes. 
    */
  var EBSOptions: js.UndefOr[typings.awsSdk.clientsEsMod.EBSOptions] = js.undefined
  
  /**
    * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the domain cluster. 
    */
  var ElasticsearchClusterConfig: js.UndefOr[typings.awsSdk.clientsEsMod.ElasticsearchClusterConfig] = js.undefined
  
  /**
    * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
  
  /**
    * Specifies the Encryption At Rest Options.
    */
  var EncryptionAtRestOptions: js.UndefOr[typings.awsSdk.clientsEsMod.EncryptionAtRestOptions] = js.undefined
  
  /**
    * Map of LogType and LogPublishingOption, each containing options to publish a given type of Elasticsearch log.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.clientsEsMod.LogPublishingOptions] = js.undefined
  
  /**
    * Specifies the NodeToNodeEncryptionOptions.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typings.awsSdk.clientsEsMod.NodeToNodeEncryptionOptions] = js.undefined
  
  /**
    * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours. 
    */
  var SnapshotOptions: js.UndefOr[typings.awsSdk.clientsEsMod.SnapshotOptions] = js.undefined
  
  /**
    * A list of Tag added during domain creation.
    */
  var TagList: js.UndefOr[typings.awsSdk.clientsEsMod.TagList] = js.undefined
  
  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see Creating a VPC in VPC Endpoints for Amazon Elasticsearch Service Domains
    */
  var VPCOptions: js.UndefOr[typings.awsSdk.clientsEsMod.VPCOptions] = js.undefined
}
object CreateElasticsearchDomainRequest {
  
  inline def apply(DomainName: DomainName): CreateElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateElasticsearchDomainRequest]
  }
  
  extension [Self <: CreateElasticsearchDomainRequest](x: Self) {
    
    inline def setAccessPolicies(value: PolicyDocument): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    inline def setAdvancedOptions(value: AdvancedOptions): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    inline def setAdvancedSecurityOptions(value: AdvancedSecurityOptionsInput): Self = StObject.set(x, "AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "AdvancedSecurityOptions", js.undefined)
    
    inline def setAutoTuneOptions(value: AutoTuneOptionsInput): Self = StObject.set(x, "AutoTuneOptions", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneOptionsUndefined: Self = StObject.set(x, "AutoTuneOptions", js.undefined)
    
    inline def setCognitoOptions(value: CognitoOptions): Self = StObject.set(x, "CognitoOptions", value.asInstanceOf[js.Any])
    
    inline def setCognitoOptionsUndefined: Self = StObject.set(x, "CognitoOptions", js.undefined)
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptions): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setEBSOptions(value: EBSOptions): Self = StObject.set(x, "EBSOptions", value.asInstanceOf[js.Any])
    
    inline def setEBSOptionsUndefined: Self = StObject.set(x, "EBSOptions", js.undefined)
    
    inline def setElasticsearchClusterConfig(value: ElasticsearchClusterConfig): Self = StObject.set(x, "ElasticsearchClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchClusterConfigUndefined: Self = StObject.set(x, "ElasticsearchClusterConfig", js.undefined)
    
    inline def setElasticsearchVersion(value: ElasticsearchVersionString): Self = StObject.set(x, "ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchVersionUndefined: Self = StObject.set(x, "ElasticsearchVersion", js.undefined)
    
    inline def setEncryptionAtRestOptions(value: EncryptionAtRestOptions): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
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
