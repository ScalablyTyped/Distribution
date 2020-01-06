package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppCookieStickinessPolicy extends js.Object {
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: js.UndefOr[typings.awsDashSdk.clientsElbMod.CookieName] = js.native
  /**
    * The mnemonic name for the policy being created. The name must be unique within a set of policies for this load balancer.
    */
  var PolicyName: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyName] = js.native
}

object AppCookieStickinessPolicy {
  @scala.inline
  def apply(CookieName: CookieName = null, PolicyName: PolicyName = null): AppCookieStickinessPolicy = {
    val __obj = js.Dynamic.literal()
    if (CookieName != null) __obj.updateDynamic("CookieName")(CookieName.asInstanceOf[js.Any])
    if (PolicyName != null) __obj.updateDynamic("PolicyName")(PolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCookieStickinessPolicy]
  }
}

