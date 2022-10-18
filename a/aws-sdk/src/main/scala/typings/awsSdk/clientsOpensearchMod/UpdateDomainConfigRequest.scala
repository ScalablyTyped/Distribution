package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainConfigRequest extends StObject {
  
  /**
    * IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * Modifies the advanced option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Advanced options  for more information. 
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AdvancedOptions] = js.undefined
  
  /**
    * Specifies advanced security options.
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.undefined
  
  /**
    * Specifies Auto-Tune options.
    */
  var AutoTuneOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AutoTuneOptions] = js.undefined
  
  /**
    * The type and number of instances to instantiate for the domain cluster.
    */
  var ClusterConfig: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ClusterConfig] = js.undefined
  
  /**
    * Options to specify the Cognito user and identity pools for OpenSearch Dashboards authentication. For more information, see Configuring Amazon Cognito authentication for OpenSearch Dashboards. 
    */
  var CognitoOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.CognitoOptions] = js.undefined
  
  /**
    * Options to specify configuration that will be applied to the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainEndpointOptions] = js.undefined
  
  /**
    * The name of the domain you're updating.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * This flag, when set to True, specifies whether the UpdateDomain request should return the results of validation checks (DryRunResults) without actually applying the change.
    */
  var DryRun: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DryRun] = js.undefined
  
  /**
    * Specify the type and size of the EBS volume to use.
    */
  var EBSOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.EBSOptions] = js.undefined
  
  /**
    * Specifies encryption of data at rest options.
    */
  var EncryptionAtRestOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.EncryptionAtRestOptions] = js.undefined
  
  /**
    * Map of LogType and LogPublishingOption, each containing options to publish a given type of OpenSearch log. 
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.LogPublishingOptions] = js.undefined
  
  /**
    * Specifies node-to-node encryption options.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NodeToNodeEncryptionOptions] = js.undefined
  
  /**
    * Option to set the time, in UTC format, for the daily automated snapshot. Default value is 0 hours. 
    */
  var SnapshotOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.SnapshotOptions] = js.undefined
  
  /**
    * Options to specify the subnets and security groups for the VPC endpoint. For more information, see Launching your Amazon OpenSearch Service domains using a VPC . 
    */
  var VPCOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.VPCOptions] = js.undefined
}
object UpdateDomainConfigRequest {
  
  inline def apply(DomainName: DomainName): UpdateDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainConfigRequest]
  }
  
  extension [Self <: UpdateDomainConfigRequest](x: Self) {
    
    inline def setAccessPolicies(value: PolicyDocument): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    inline def setAdvancedOptions(value: AdvancedOptions): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    inline def setAdvancedSecurityOptions(value: AdvancedSecurityOptionsInput): Self = StObject.set(x, "AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "AdvancedSecurityOptions", js.undefined)
    
    inline def setAutoTuneOptions(value: AutoTuneOptions): Self = StObject.set(x, "AutoTuneOptions", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneOptionsUndefined: Self = StObject.set(x, "AutoTuneOptions", js.undefined)
    
    inline def setClusterConfig(value: ClusterConfig): Self = StObject.set(x, "ClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigUndefined: Self = StObject.set(x, "ClusterConfig", js.undefined)
    
    inline def setCognitoOptions(value: CognitoOptions): Self = StObject.set(x, "CognitoOptions", value.asInstanceOf[js.Any])
    
    inline def setCognitoOptionsUndefined: Self = StObject.set(x, "CognitoOptions", js.undefined)
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptions): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEBSOptions(value: EBSOptions): Self = StObject.set(x, "EBSOptions", value.asInstanceOf[js.Any])
    
    inline def setEBSOptionsUndefined: Self = StObject.set(x, "EBSOptions", js.undefined)
    
    inline def setEncryptionAtRestOptions(value: EncryptionAtRestOptions): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    inline def setLogPublishingOptions(value: LogPublishingOptions): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    inline def setNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptions): Self = StObject.set(x, "NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setNodeToNodeEncryptionOptionsUndefined: Self = StObject.set(x, "NodeToNodeEncryptionOptions", js.undefined)
    
    inline def setSnapshotOptions(value: SnapshotOptions): Self = StObject.set(x, "SnapshotOptions", value.asInstanceOf[js.Any])
    
    inline def setSnapshotOptionsUndefined: Self = StObject.set(x, "SnapshotOptions", js.undefined)
    
    inline def setVPCOptions(value: VPCOptions): Self = StObject.set(x, "VPCOptions", value.asInstanceOf[js.Any])
    
    inline def setVPCOptionsUndefined: Self = StObject.set(x, "VPCOptions", js.undefined)
  }
}
