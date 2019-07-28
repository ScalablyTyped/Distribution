package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementClientOptions extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var domain: String
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var tokenProvider: js.UndefOr[TokenProvider] = js.undefined
}

object ManagementClientOptions {
  @scala.inline
  def apply(
    domain: String,
    audience: String = null,
    clientId: String = null,
    clientSecret: String = null,
    retry: RetryOptions = null,
    scope: String = null,
    token: String = null,
    tokenProvider: TokenProvider = null
  ): ManagementClientOptions = {
    val __obj = js.Dynamic.literal(domain = domain)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (token != null) __obj.updateDynamic("token")(token)
    if (tokenProvider != null) __obj.updateDynamic("tokenProvider")(tokenProvider)
    __obj.asInstanceOf[ManagementClientOptions]
  }
}

