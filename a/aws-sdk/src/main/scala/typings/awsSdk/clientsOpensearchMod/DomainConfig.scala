package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainConfig extends StObject {
  
  /**
    * Specifies the access policies for the domain.
    */
  var AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined
  
  /**
    * Key-value pairs to specify advanced configuration options. For more information, see Advanced options.
    */
  var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.undefined
  
  /**
    * Container for fine-grained access control settings for the domain.
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus] = js.undefined
  
  /**
    * Container for Auto-Tune settings for the domain.
    */
  var AutoTuneOptions: js.UndefOr[AutoTuneOptionsStatus] = js.undefined
  
  /**
    * Container for information about the progress of an existing configuration change.
    */
  var ChangeProgressDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ChangeProgressDetails] = js.undefined
  
  /**
    * Container for the cluster configuration of a the domain.
    */
  var ClusterConfig: js.UndefOr[ClusterConfigStatus] = js.undefined
  
  /**
    * Container for Amazon Cognito options for the domain.
    */
  var CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.undefined
  
  /**
    * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.undefined
  
  /**
    * Container for EBS options configured for an OpenSearch Service domain.
    */
  var EBSOptions: js.UndefOr[EBSOptionsStatus] = js.undefined
  
  /**
    * Key-value pairs to enable encryption at rest.
    */
  var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.undefined
  
  /**
    * The OpenSearch or Elasticsearch version that the domain is running.
    */
  var EngineVersion: js.UndefOr[VersionStatus] = js.undefined
  
  /**
    * Key-value pairs to configure slow log publishing.
    */
  var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.undefined
  
  /**
    * Whether node-to-node encryption is enabled or disabled.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.undefined
  
  /**
    * DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
    */
  var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.undefined
  
  /**
    * The current VPC options for the domain and the status of any updates to their configuration.
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.undefined
}
object DomainConfig {
  
  inline def apply(): DomainConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainConfig]
  }
  
  extension [Self <: DomainConfig](x: Self) {
    
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
    
    inline def setClusterConfig(value: ClusterConfigStatus): Self = StObject.set(x, "ClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigUndefined: Self = StObject.set(x, "ClusterConfig", js.undefined)
    
    inline def setCognitoOptions(value: CognitoOptionsStatus): Self = StObject.set(x, "CognitoOptions", value.asInstanceOf[js.Any])
    
    inline def setCognitoOptionsUndefined: Self = StObject.set(x, "CognitoOptions", js.undefined)
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    inline def setEBSOptions(value: EBSOptionsStatus): Self = StObject.set(x, "EBSOptions", value.asInstanceOf[js.Any])
    
    inline def setEBSOptionsUndefined: Self = StObject.set(x, "EBSOptions", js.undefined)
    
    inline def setEncryptionAtRestOptions(value: EncryptionAtRestOptionsStatus): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    inline def setEngineVersion(value: VersionStatus): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
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
