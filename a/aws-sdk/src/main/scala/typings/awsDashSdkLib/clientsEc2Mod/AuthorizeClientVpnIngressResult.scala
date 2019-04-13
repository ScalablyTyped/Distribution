package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeClientVpnIngressResult extends js.Object {
  /**
    * The current state of the authorization rule.
    */
  var Status: js.UndefOr[ClientVpnAuthorizationRuleStatus] = js.undefined
}

object AuthorizeClientVpnIngressResult {
  @scala.inline
  def apply(Status: ClientVpnAuthorizationRuleStatus = null): AuthorizeClientVpnIngressResult = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[AuthorizeClientVpnIngressResult]
  }
}

