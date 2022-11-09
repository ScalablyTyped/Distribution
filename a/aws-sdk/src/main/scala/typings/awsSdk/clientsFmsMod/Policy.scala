package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  /**
    * Indicates whether Firewall Manager should automatically remove protections from resources that leave the policy scope and clean up resources that Firewall Manager is managing for accounts when those accounts leave policy scope. For example, Firewall Manager will disassociate a Firewall Manager managed web ACL from a protected customer resource when the customer resource leaves policy scope.  By default, Firewall Manager doesn't remove protections or delete Firewall Manager managed resources.  This option is not available for Shield Advanced or WAF Classic policies.
    */
  var DeleteUnusedFMManagedResources: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the Amazon Web Services account IDs and Organizations organizational units (OUs) to exclude from the policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time. You can specify inclusions or exclusions, but not both. If you specify an IncludeMap, Firewall Manager applies the policy to all accounts specified by the IncludeMap, and does not evaluate any ExcludeMap specifications. If you do not specify an IncludeMap, then Firewall Manager applies the policy to all accounts except for those specified by the ExcludeMap. You can specify account IDs, OUs, or a combination:    Specify account IDs by setting the key to ACCOUNT. For example, the following is a valid map: {“ACCOUNT” : [“accountID1”, “accountID2”]}.   Specify OUs by setting the key to ORG_UNIT. For example, the following is a valid map: {“ORG_UNIT” : [“ouid111”, “ouid112”]}.   Specify accounts and OUs together in a single map, separated with a comma. For example, the following is a valid map: {“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}.  
    */
  var ExcludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.undefined
  
  /**
    * If set to True, resources with the tags that are specified in the ResourceTag array are not in scope of the policy. If set to False, and the ResourceTag array is not null, only resources with the specified tags are in scope of the policy.
    */
  var ExcludeResourceTags: Boolean
  
  /**
    * Specifies the Amazon Web Services account IDs and Organizations organizational units (OUs) to include in the policy. Specifying an OU is the equivalent of specifying all accounts in the OU and in any of its child OUs, including any child OUs and accounts that are added at a later time. You can specify inclusions or exclusions, but not both. If you specify an IncludeMap, Firewall Manager applies the policy to all accounts specified by the IncludeMap, and does not evaluate any ExcludeMap specifications. If you do not specify an IncludeMap, then Firewall Manager applies the policy to all accounts except for those specified by the ExcludeMap. You can specify account IDs, OUs, or a combination:    Specify account IDs by setting the key to ACCOUNT. For example, the following is a valid map: {“ACCOUNT” : [“accountID1”, “accountID2”]}.   Specify OUs by setting the key to ORG_UNIT. For example, the following is a valid map: {“ORG_UNIT” : [“ouid111”, “ouid112”]}.   Specify accounts and OUs together in a single map, separated with a comma. For example, the following is a valid map: {“ACCOUNT” : [“accountID1”, “accountID2”], “ORG_UNIT” : [“ouid111”, “ouid112”]}.  
    */
  var IncludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.undefined
  
  /**
    * The definition of the Network Firewall firewall policy.
    */
  var PolicyDescription: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The ID of the Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.clientsFmsMod.PolicyId] = js.undefined
  
  /**
    * The name of the Firewall Manager policy.
    */
  var PolicyName: ResourceName
  
  /**
    * A unique identifier for each update to the policy. When issuing a PutPolicy request, the PolicyUpdateToken in the request must match the PolicyUpdateToken of the current policy version. To get the PolicyUpdateToken of the current policy version, use a GetPolicy request.
    */
  var PolicyUpdateToken: js.UndefOr[typings.awsSdk.clientsFmsMod.PolicyUpdateToken] = js.undefined
  
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: Boolean
  
  /**
    * The unique identifiers of the resource sets used by the policy.
    */
  var ResourceSetIds: js.UndefOr[typings.awsSdk.clientsFmsMod.ResourceSetIds] = js.undefined
  
  /**
    * An array of ResourceTag objects.
    */
  var ResourceTags: js.UndefOr[typings.awsSdk.clientsFmsMod.ResourceTags] = js.undefined
  
  /**
    * The type of resource protected by or in scope of the policy. This is in the format shown in the Amazon Web Services Resource Types Reference. To apply this policy to multiple resource types, specify a resource type of ResourceTypeList and then specify the resource types in a ResourceTypeList. For WAF and Shield Advanced, resource types include AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::ElasticLoadBalancing::LoadBalancer, AWS::EC2::EIP, and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. For an Network Firewall policy or DNS Firewall policy, the value is AWS::EC2::VPC.
    */
  var ResourceType: typings.awsSdk.clientsFmsMod.ResourceType
  
  /**
    * An array of ResourceType objects. Use this only to specify multiple resource types. To specify a single resource type, use ResourceType.
    */
  var ResourceTypeList: js.UndefOr[typings.awsSdk.clientsFmsMod.ResourceTypeList] = js.undefined
  
  /**
    * Details about the security service that is being used to protect the resources.
    */
  var SecurityServicePolicyData: typings.awsSdk.clientsFmsMod.SecurityServicePolicyData
}
object Policy {
  
  inline def apply(
    ExcludeResourceTags: Boolean,
    PolicyName: ResourceName,
    RemediationEnabled: Boolean,
    ResourceType: ResourceType,
    SecurityServicePolicyData: SecurityServicePolicyData
  ): Policy = {
    val __obj = js.Dynamic.literal(ExcludeResourceTags = ExcludeResourceTags.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], RemediationEnabled = RemediationEnabled.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SecurityServicePolicyData = SecurityServicePolicyData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setDeleteUnusedFMManagedResources(value: Boolean): Self = StObject.set(x, "DeleteUnusedFMManagedResources", value.asInstanceOf[js.Any])
    
    inline def setDeleteUnusedFMManagedResourcesUndefined: Self = StObject.set(x, "DeleteUnusedFMManagedResources", js.undefined)
    
    inline def setExcludeMap(value: CustomerPolicyScopeMap): Self = StObject.set(x, "ExcludeMap", value.asInstanceOf[js.Any])
    
    inline def setExcludeMapUndefined: Self = StObject.set(x, "ExcludeMap", js.undefined)
    
    inline def setExcludeResourceTags(value: Boolean): Self = StObject.set(x, "ExcludeResourceTags", value.asInstanceOf[js.Any])
    
    inline def setIncludeMap(value: CustomerPolicyScopeMap): Self = StObject.set(x, "IncludeMap", value.asInstanceOf[js.Any])
    
    inline def setIncludeMapUndefined: Self = StObject.set(x, "IncludeMap", js.undefined)
    
    inline def setPolicyDescription(value: ResourceDescription): Self = StObject.set(x, "PolicyDescription", value.asInstanceOf[js.Any])
    
    inline def setPolicyDescriptionUndefined: Self = StObject.set(x, "PolicyDescription", js.undefined)
    
    inline def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    inline def setPolicyName(value: ResourceName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyUpdateToken(value: PolicyUpdateToken): Self = StObject.set(x, "PolicyUpdateToken", value.asInstanceOf[js.Any])
    
    inline def setPolicyUpdateTokenUndefined: Self = StObject.set(x, "PolicyUpdateToken", js.undefined)
    
    inline def setRemediationEnabled(value: Boolean): Self = StObject.set(x, "RemediationEnabled", value.asInstanceOf[js.Any])
    
    inline def setResourceSetIds(value: ResourceSetIds): Self = StObject.set(x, "ResourceSetIds", value.asInstanceOf[js.Any])
    
    inline def setResourceSetIdsUndefined: Self = StObject.set(x, "ResourceSetIds", js.undefined)
    
    inline def setResourceSetIdsVarargs(value: Base62Id*): Self = StObject.set(x, "ResourceSetIds", js.Array(value*))
    
    inline def setResourceTags(value: ResourceTags): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeList(value: ResourceTypeList): Self = StObject.set(x, "ResourceTypeList", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeListUndefined: Self = StObject.set(x, "ResourceTypeList", js.undefined)
    
    inline def setResourceTypeListVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypeList", js.Array(value*))
    
    inline def setSecurityServicePolicyData(value: SecurityServicePolicyData): Self = StObject.set(x, "SecurityServicePolicyData", value.asInstanceOf[js.Any])
  }
}
