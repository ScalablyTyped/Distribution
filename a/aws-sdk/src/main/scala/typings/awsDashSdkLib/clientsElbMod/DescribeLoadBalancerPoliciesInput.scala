package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBalancerPoliciesInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
  /**
    * The names of the policies.
    */
  var PolicyNames: js.UndefOr[PolicyNames] = js.undefined
}

object DescribeLoadBalancerPoliciesInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName = null, PolicyNames: PolicyNames = null): DescribeLoadBalancerPoliciesInput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName)
    if (PolicyNames != null) __obj.updateDynamic("PolicyNames")(PolicyNames)
    __obj.asInstanceOf[DescribeLoadBalancerPoliciesInput]
  }
}

