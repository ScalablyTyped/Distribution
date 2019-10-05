package typings.asana.asanaMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthenticatorOptions extends js.Object {
  var credentials: js.UndefOr[Credentials | String] = js.undefined
  var flowType: js.UndefOr[FlowType] = js.undefined
}

object OauthAuthenticatorOptions {
  @scala.inline
  def apply(credentials: Credentials | String = null, flowType: FlowType = null): OauthAuthenticatorOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (flowType != null) __obj.updateDynamic("flowType")(flowType)
    __obj.asInstanceOf[OauthAuthenticatorOptions]
  }
}

