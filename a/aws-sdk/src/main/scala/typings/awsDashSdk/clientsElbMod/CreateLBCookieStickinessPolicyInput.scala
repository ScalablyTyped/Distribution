package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLBCookieStickinessPolicyInput extends js.Object {
  /**
    * The time period, in seconds, after which the cookie should be considered stale. If you do not specify this parameter, the default value is 0, which indicates that the sticky session should last for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[typings.awsDashSdk.clientsElbMod.CookieExpirationPeriod] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsDashSdk.clientsElbMod.PolicyName = js.native
}

object CreateLBCookieStickinessPolicyInput {
  @scala.inline
  def apply(
    LoadBalancerName: AccessPointName,
    PolicyName: PolicyName,
    CookieExpirationPeriod: Int | Double = null
  ): CreateLBCookieStickinessPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    if (CookieExpirationPeriod != null) __obj.updateDynamic("CookieExpirationPeriod")(CookieExpirationPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLBCookieStickinessPolicyInput]
  }
}

