package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  /**
    * Specifies the AWS account IDs to exclude from the policy. The IncludeMap values are evaluated first, with all the appropriate account IDs added to the policy. Then the accounts listed in ExcludeMap are removed, resulting in the final list of accounts to add to the policy. The key to the map is ACCOUNT. For example, a valid ExcludeMap would be {“ACCOUNT” : [“accountID1”, “accountID2”]}.
    */
  var ExcludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.native
  /**
    * If set to True, resources with the tags that are specified in the ResourceTag array are not in scope of the policy. If set to False, and the ResourceTag array is not null, only resources with the specified tags are in scope of the policy.
    */
  var ExcludeResourceTags: Boolean = js.native
  /**
    * Specifies the AWS account IDs to include in the policy. If IncludeMap is null, all accounts in the organization in AWS Organizations are included in the policy. If IncludeMap is not null, only values listed in IncludeMap are included in the policy. The key to the map is ACCOUNT. For example, a valid IncludeMap would be {“ACCOUNT” : [“accountID1”, “accountID2”]}.
    */
  var IncludeMap: js.UndefOr[CustomerPolicyScopeMap] = js.native
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyId] = js.native
  /**
    * The friendly name of the AWS Firewall Manager policy.
    */
  var PolicyName: ResourceName = js.native
  /**
    * A unique identifier for each update to the policy. When issuing a PutPolicy request, the PolicyUpdateToken in the request must match the PolicyUpdateToken of the current policy version. To get the PolicyUpdateToken of the current policy version, use a GetPolicy request.
    */
  var PolicyUpdateToken: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyUpdateToken] = js.native
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: Boolean = js.native
  /**
    * An array of ResourceTag objects.
    */
  var ResourceTags: js.UndefOr[typings.awsDashSdk.clientsFmsMod.ResourceTags] = js.native
  /**
    * The type of resource protected by or in scope of the policy. This is in the format shown in the AWS Resource Types Reference. For AWS WAF and Shield Advanced, examples include AWS::ElasticLoadBalancingV2::LoadBalancer and AWS::CloudFront::Distribution. For a security group common policy, valid values are AWS::EC2::NetworkInterface and AWS::EC2::Instance. For a security group content audit policy, valid values are AWS::EC2::SecurityGroup, AWS::EC2::NetworkInterface, and AWS::EC2::Instance. For a security group usage audit policy, the value is AWS::EC2::SecurityGroup. 
    */
  var ResourceType: typings.awsDashSdk.clientsFmsMod.ResourceType = js.native
  /**
    * An array of ResourceType.
    */
  var ResourceTypeList: js.UndefOr[typings.awsDashSdk.clientsFmsMod.ResourceTypeList] = js.native
  /**
    * Details about the security service that is being used to protect the resources.
    */
  var SecurityServicePolicyData: typings.awsDashSdk.clientsFmsMod.SecurityServicePolicyData = js.native
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
    val __obj = js.Dynamic.literal(ExcludeResourceTags = ExcludeResourceTags.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], RemediationEnabled = RemediationEnabled.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], SecurityServicePolicyData = SecurityServicePolicyData.asInstanceOf[js.Any])
    if (ExcludeMap != null) __obj.updateDynamic("ExcludeMap")(ExcludeMap.asInstanceOf[js.Any])
    if (IncludeMap != null) __obj.updateDynamic("IncludeMap")(IncludeMap.asInstanceOf[js.Any])
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId.asInstanceOf[js.Any])
    if (PolicyUpdateToken != null) __obj.updateDynamic("PolicyUpdateToken")(PolicyUpdateToken.asInstanceOf[js.Any])
    if (ResourceTags != null) __obj.updateDynamic("ResourceTags")(ResourceTags.asInstanceOf[js.Any])
    if (ResourceTypeList != null) __obj.updateDynamic("ResourceTypeList")(ResourceTypeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

