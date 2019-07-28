package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementOptions extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var domain: String
  var scope: js.UndefOr[String] = js.undefined
  var telemetry: js.UndefOr[Boolean] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var tokenProvider: js.UndefOr[TokenProvider] = js.undefined
}

object ManagementOptions {
  @scala.inline
  def apply(
    domain: String,
    audience: String = null,
    clientId: String = null,
    clientSecret: String = null,
    scope: String = null,
    telemetry: js.UndefOr[Boolean] = js.undefined,
    token: String = null,
    tokenProvider: TokenProvider = null
  ): ManagementOptions = {
    val __obj = js.Dynamic.literal(domain = domain)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(telemetry)) __obj.updateDynamic("telemetry")(telemetry)
    if (token != null) __obj.updateDynamic("token")(token)
    if (tokenProvider != null) __obj.updateDynamic("tokenProvider")(tokenProvider)
    __obj.asInstanceOf[ManagementOptions]
  }
}

