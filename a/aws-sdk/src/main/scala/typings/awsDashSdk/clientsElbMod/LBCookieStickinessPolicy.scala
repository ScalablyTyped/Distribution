package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LBCookieStickinessPolicy extends js.Object {
  /**
    * The time period, in seconds, after which the cookie should be considered stale. If this parameter is not specified, the stickiness session lasts for the duration of the browser session.
    */
  var CookieExpirationPeriod: js.UndefOr[typings.awsDashSdk.clientsElbMod.CookieExpirationPeriod] = js.native
  /**
    * The name of the policy. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyName] = js.native
}

object LBCookieStickinessPolicy {
  @scala.inline
  def apply(CookieExpirationPeriod: Int | Double = null, PolicyName: PolicyName = null): LBCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    if (CookieExpirationPeriod != null) __obj.updateDynamic("CookieExpirationPeriod")(CookieExpirationPeriod.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LBCookieStickinessPolicy]
  }
}

