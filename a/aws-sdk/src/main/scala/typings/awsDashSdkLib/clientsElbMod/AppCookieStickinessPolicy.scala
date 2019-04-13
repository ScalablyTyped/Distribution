package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCookieStickinessPolicy extends js.Object {
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: js.UndefOr[CookieName] = js.undefined
  /**
    * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[PolicyName] = js.undefined
}

object AppCookieStickinessPolicy {
  @scala.inline
  def apply(CookieName: CookieName = null, PolicyName: PolicyName = null): AppCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    if (CookieName != null) __obj.updateDynamic("CookieName")(CookieName)
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName)
    __obj.asInstanceOf[AppCookieStickinessPolicy]
  }
}

