package typings
package awsDashSdkLib.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceViolator extends js.Object {
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The resource type. This is in the format shown in AWS Resource Types Reference. For example: AWS::ElasticLoadBalancingV2::LoadBalancer or AWS::CloudFront::Distribution.
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The reason that the resource is not protected by the policy.
    */
  var ViolationReason: js.UndefOr[ViolationReason] = js.undefined
}

object ComplianceViolator {
  @scala.inline
  def apply(
    ResourceId: ResourceId = null,
    ResourceType: ResourceType = null,
    ViolationReason: ViolationReason = null
  ): ComplianceViolator = {
    val __obj = js.Dynamic.literal()
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (ViolationReason != null) __obj.updateDynamic("ViolationReason")(ViolationReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceViolator]
  }
}

