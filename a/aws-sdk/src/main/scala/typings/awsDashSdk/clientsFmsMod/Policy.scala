package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  /**
    * Specifies the AWS account IDs to exclude from the policy. The IncludeMap values are evaluated first, with all the appropriate account IDs added to the policy. Then the accounts listed in ExcludeMap are removed, resulting in the final list of accounts to add to the policy. The key to the map is ACCOUNT. For example, a valid ExcludeMap would be {“ACCOUNT” : [“accountID1”, “accountID2”]}.
    */
  var ExcludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.undefined
  /**
    * If set to True, resources with the tags that are specified in the ResourceTag array are not protected by the policy. If set to False, and the ResourceTag array is not null, only resources with the specified tags are associated with the policy.
    */
  var ExcludeResourceTags: Boolean
  /**
    * Specifies the AWS account IDs to include in the policy. If IncludeMap is null, all accounts in the organization in AWS Organizations are included in the policy. If IncludeMap is not null, only values listed in IncludeMap are included in the policy. The key to the map is ACCOUNT. For example, a valid IncludeMap would be {“ACCOUNT” : [“accountID1”, “accountID2”]}.
    */
  var IncludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.undefined
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyId] = js.undefined
  /**
    * The friendly name of the AWS Firewall Manager policy.
    */
  var PolicyName: ResourceName
  /**
    * A unique identifier for each update to the policy. When issuing a PutPolicy request, the PolicyUpdateToken in the request must match the PolicyUpdateToken of the current policy version. To get the PolicyUpdateToken of the current policy version, use a GetPolicy request.
    */
  var PolicyUpdateToken: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyUpdateToken] = js.undefined
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: Boolean
  /**
    * An array of ResourceTag objects.
    */
  var ResourceTags: js.UndefOr[typings.awsDashSdk.clientsFmsMod.ResourceTags] = js.undefined
  /**
    * The type of resource to protect with the policy. This is in the format shown in AWS Resource Types Reference. For example: AWS::ElasticLoadBalancingV2::LoadBalancer or AWS::CloudFront::Distribution.
    */
  var ResourceType: typings.awsDashSdk.clientsFmsMod.ResourceType
  /**
    * An array of ResourceType.
    */
  var ResourceTypeList: js.UndefOr[typings.awsDashSdk.clientsFmsMod.ResourceTypeList] = js.undefined
  /**
    * Details about the security service that is being used to protect the resources.
    */
  var SecurityServicePolicyData: typings.awsDashSdk.clientsFmsMod.SecurityServicePolicyData
}

object Policy {
  @scala.inline
  def apply(
    ExcludeResourceTags: Boolean,
    PolicyName: ResourceName,
    RemediationEnabled: Boolean,
    ResourceType: ResourceType,
    SecurityServicePolicyData: SecurityServicePolicyData,
    ExcludeMap: CustomerPolicyScopeMap = null,
    IncludeMap: CustomerPolicyScopeMap = null,
    PolicyId: PolicyId = null,
    PolicyUpdateToken: PolicyUpdateToken = null,
    ResourceTags: ResourceTags = null,
    ResourceTypeList: ResourceTypeList = null
  ): Policy = {
    val __obj = js.Dynamic.literal(ExcludeResourceTags = ExcludeResourceTags, PolicyName = PolicyName, RemediationEnabled = RemediationEnabled, ResourceType = ResourceType, SecurityServicePolicyData = SecurityServicePolicyData)
    if (ExcludeMap != null) __obj.updateDynamic("ExcludeMap")(ExcludeMap)
    if (IncludeMap != null) __obj.updateDynamic("IncludeMap")(IncludeMap)
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    if (PolicyUpdateToken != null) __obj.updateDynamic("PolicyUpdateToken")(PolicyUpdateToken)
    if (ResourceTags != null) __obj.updateDynamic("ResourceTags")(ResourceTags)
    if (ResourceTypeList != null) __obj.updateDynamic("ResourceTypeList")(ResourceTypeList)
    __obj.asInstanceOf[Policy]
  }
}

