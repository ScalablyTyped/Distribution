package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchDomainConfig extends StObject {
  
  /**
    * IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined
  
  /**
    * Specifies the AdvancedOptions for the domain. See Configuring Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.undefined
  
  /**
    * Specifies AdvancedSecurityOptions for the domain. 
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus] = js.undefined
  
  /**
    * Specifies AutoTuneOptions for the domain. 
    */
  var AutoTuneOptions: js.UndefOr[AutoTuneOptionsStatus] = js.undefined
  
  /**
    * Specifies change details of the domain configuration change.
    */
  var ChangeProgressDetails: js.UndefOr[typings.awsSdk.clientsEsMod.ChangeProgressDetails] = js.undefined
  
  /**
    * The CognitoOptions for the specified domain. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.undefined
  
  /**
    * Specifies the DomainEndpointOptions for the Elasticsearch domain.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.undefined
  
  /**
    * Specifies the EBSOptions for the Elasticsearch domain.
    */
  var EBSOptions: js.UndefOr[EBSOptionsStatus] = js.undefined
  
  /**
    * Specifies the ElasticsearchClusterConfig for the Elasticsearch domain.
    */
  var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus] = js.undefined
  
  /**
    * String of format X.Y to specify version for the Elasticsearch domain.
    */
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus] = js.undefined
  
  /**
    * Specifies the EncryptionAtRestOptions for the Elasticsearch domain.
    */
  var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.undefined
  
  /**
    * Log publishing options for the given domain.
    */
  var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.undefined
  
  /**
    * Specifies the NodeToNodeEncryptionOptions for the Elasticsearch domain.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.undefined
  
  /**
    * Specifies the SnapshotOptions for the Elasticsearch domain.
    */
  var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.undefined
  
  /**
    * The VPCOptions for the specified domain. For more information, see VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.undefined
}
object ElasticsearchDomainConfig {
  
  inline def apply(): ElasticsearchDomainConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchDomainConfig]
  }
  
  extension [Self <: ElasticsearchDomainConfig](x: Self) {
    
    inline def setAccessPolicies(value: AccessPoliciesStatus): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    inline def setAdvancedOptions(value: AdvancedOptionsStatus): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    inline def setAdvancedSecurityOptions(value: AdvancedSecurityOptionsStatus): Self = StObject.set(x, "AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "AdvancedSecurityOptions", js.undefined)
    
    inline def setAutoTuneOptions(value: AutoTuneOptionsStatus): Self = StObject.set(x, "AutoTuneOptions", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneOptionsUndefined: Self = StObject.set(x, "AutoTuneOptions", js.undefined)
    
    inline def setChangeProgressDetails(value: ChangeProgressDetails): Self = StObject.set(x, "ChangeProgressDetails", value.asInstanceOf[js.Any])
    
    inline def setChangeProgressDetailsUndefined: Self = StObject.set(x, "ChangeProgressDetails", js.undefined)
    
    inline def setCognitoOptions(value: CognitoOptionsStatus): Self = StObject.set(x, "CognitoOptions", value.asInstanceOf[js.Any])
    
    inline def setCognitoOptionsUndefined: Self = StObject.set(x, "CognitoOptions", js.undefined)
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    inline def setEBSOptions(value: EBSOptionsStatus): Self = StObject.set(x, "EBSOptions", value.asInstanceOf[js.Any])
    
    inline def setEBSOptionsUndefined: Self = StObject.set(x, "EBSOptions", js.undefined)
    
    inline def setElasticsearchClusterConfig(value: ElasticsearchClusterConfigStatus): Self = StObject.set(x, "ElasticsearchClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchClusterConfigUndefined: Self = StObject.set(x, "ElasticsearchClusterConfig", js.undefined)
    
    inline def setElasticsearchVersion(value: ElasticsearchVersionStatus): Self = StObject.set(x, "ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchVersionUndefined: Self = StObject.set(x, "ElasticsearchVersion", js.undefined)
    
    inline def setEncryptionAtRestOptions(value: EncryptionAtRestOptionsStatus): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    inline def setLogPublishingOptions(value: LogPublishingOptionsStatus): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    inline def setNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptionsStatus): Self = StObject.set(x, "NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setNodeToNodeEncryptionOptionsUndefined: Self = StObject.set(x, "NodeToNodeEncryptionOptions", js.undefined)
    
    inline def setSnapshotOptions(value: SnapshotOptionsStatus): Self = StObject.set(x, "SnapshotOptions", value.asInstanceOf[js.Any])
    
    inline def setSnapshotOptionsUndefined: Self = StObject.set(x, "SnapshotOptions", js.undefined)
    
    inline def setVPCOptions(value: VPCDerivedInfoStatus): Self = StObject.set(x, "VPCOptions", value.asInstanceOf[js.Any])
    
    inline def setVPCOptionsUndefined: Self = StObject.set(x, "VPCOptions", js.undefined)
  }
}
