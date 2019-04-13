package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policies extends js.Object {
  /**
    * The stickiness policies created using CreateAppCookieStickinessPolicy.
    */
  var AppCookieStickinessPolicies: js.UndefOr[AppCookieStickinessPolicies] = js.undefined
  /**
    * The stickiness policies created using CreateLBCookieStickinessPolicy.
    */
  var LBCookieStickinessPolicies: js.UndefOr[LBCookieStickinessPolicies] = js.undefined
  /**
    * The policies other than the stickiness policies.
    */
  var OtherPolicies: js.UndefOr[PolicyNames] = js.undefined
}

object Policies {
  @scala.inline
  def apply(
    AppCookieStickinessPolicies: AppCookieStickinessPolicies = null,
    LBCookieStickinessPolicies: LBCookieStickinessPolicies = null,
    OtherPolicies: PolicyNames = null
  ): Policies = {
    val __obj = js.Dynamic.literal()
    if (AppCookieStickinessPolicies != null) __obj.updateDynamic("AppCookieStickinessPolicies")(AppCookieStickinessPolicies)
    if (LBCookieStickinessPolicies != null) __obj.updateDynamic("LBCookieStickinessPolicies")(LBCookieStickinessPolicies)
    if (OtherPolicies != null) __obj.updateDynamic("OtherPolicies")(OtherPolicies)
    __obj.asInstanceOf[Policies]
  }
}

