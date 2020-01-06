package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEffectivePolicyRequest extends js.Object {
  /**
    * The type of policy that you want information about.
    */
  var PolicyType: EffectivePolicyType = js.native
  /**
    * When you're signed in as the master account, specify the ID of the account that you want details about. Specifying an organization root or OU as the target is not supported. 
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.native
}

object DescribeEffectivePolicyRequest {
  @scala.inline
  def apply(PolicyType: EffectivePolicyType, TargetId: PolicyTargetId = null): DescribeEffectivePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyType = PolicyType.asInstanceOf[js.Any])
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEffectivePolicyRequest]
  }
}

