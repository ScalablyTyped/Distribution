package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientVpnAuthorizationRuleStatus extends js.Object {
  /**
    * The state of the authorization rule.
    */
  var Code: js.UndefOr[ClientVpnAuthorizationRuleStatusCode] = js.undefined
  /**
    * A message about the status of the authorization rule, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object ClientVpnAuthorizationRuleStatus {
  @scala.inline
  def apply(Code: ClientVpnAuthorizationRuleStatusCode = null, Message: String = null): ClientVpnAuthorizationRuleStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[ClientVpnAuthorizationRuleStatus]
  }
}

