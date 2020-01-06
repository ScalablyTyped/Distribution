package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerPoliciesInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.native
  /**
    * The names of the policies.
    */
  var PolicyNames: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyNames] = js.native
}

object DescribeLoadBalancerPoliciesInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName = null, PolicyNames: PolicyNames = null): DescribeLoadBalancerPoliciesInput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName.asInstanceOf[js.Any])
    if (PolicyNames != null) __obj.updateDynamic("PolicyNames")(PolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancerPoliciesInput]
  }
}

