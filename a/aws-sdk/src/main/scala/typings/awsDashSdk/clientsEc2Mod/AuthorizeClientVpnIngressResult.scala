package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeClientVpnIngressResult extends js.Object {
  /**
    * The current state of the authorization rule.
    */
  var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus] = js.native
}

object AuthorizeClientVpnIngressResult {
  @scala.inline
  def apply(Status: ClientVpnAuthorizationRuleStatus = null): AuthorizeClientVpnIngressResult = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeClientVpnIngressResult]
  }
}

