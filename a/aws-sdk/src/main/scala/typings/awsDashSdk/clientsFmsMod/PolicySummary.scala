package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicySummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the specified policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.undefined
  /**
    * The ID of the specified policy.
    */
  var PolicyId: js.UndefOr[typings.awsDashSdk.clientsFmsMod.PolicyId] = js.undefined
  /**
    * The friendly name of the specified policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.undefined
  /**
    * Indicates if the policy should be automatically applied to new resources.
    */
  var RemediationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of resource to protect with the policy. This is in the format shown in AWS Resource Types Reference. For example: AWS::ElasticLoadBalancingV2::LoadBalancer or AWS::CloudFront::Distribution.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsFmsMod.ResourceType] = js.undefined
  /**
    * The service that the policy is using to protect the resources. This specifies the type of policy that is created, either a WAF policy or Shield Advanced policy.
    */
  var SecurityServiceType: js.UndefOr[typings.awsDashSdk.clientsFmsMod.SecurityServiceType] = js.undefined
}

object PolicySummary {
  @scala.inline
  def apply(
    PolicyArn: ResourceArn = null,
    PolicyId: PolicyId = null,
    PolicyName: ResourceName = null,
    RemediationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ResourceType: ResourceType = null,
    SecurityServiceType: SecurityServiceType = null
  ): PolicySummary = {
    val __obj = js.Dynamic.literal()
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn)
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    if (!js.isUndefined(RemediationEnabled)) __obj.updateDynamic("RemediationEnabled")(RemediationEnabled)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (SecurityServiceType != null) __obj.updateDynamic("SecurityServiceType")(SecurityServiceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicySummary]
  }
}

