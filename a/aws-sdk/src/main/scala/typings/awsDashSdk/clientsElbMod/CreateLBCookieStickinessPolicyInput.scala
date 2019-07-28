package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLBCookieStickinessPolicyInput extends js.Object {
  /**
    * The time period, in seconds, after which the cookie should be considered stale. If you do not specify this parameter, the default value is 0, which indicates that the sticky session should last for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[typings.awsDashSdk.clientsElbMod.CookieExpirationPeriod] = js.undefined
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsDashSdk.clientsElbMod.PolicyName
}

object CreateLBCookieStickinessPolicyInput {
  @scala.inline
  def apply(
    LoadBalancerName: AccessPointName,
    PolicyName: PolicyName,
    CookieExpirationPeriod: js.UndefOr[CookieExpirationPeriod] = js.undefined
  ): CreateLBCookieStickinessPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName, PolicyName = PolicyName)
    if (!js.isUndefined(CookieExpirationPeriod)) __obj.updateDynamic("CookieExpirationPeriod")(CookieExpirationPeriod)
    __obj.asInstanceOf[CreateLBCookieStickinessPolicyInput]
  }
}

