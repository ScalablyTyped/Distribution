package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagementOptions extends js.Object {
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var domain: java.lang.String
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var telemetry: js.UndefOr[scala.Boolean] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var tokenProvider: js.UndefOr[TokenProvider] = js.undefined
}

object ManagementOptions {
  @scala.inline
  def apply(
    domain: java.lang.String,
    audience: java.lang.String = null,
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    scope: java.lang.String = null,
    telemetry: js.UndefOr[scala.Boolean] = js.undefined,
    token: java.lang.String = null,
    tokenProvider: TokenProvider = null
  ): ManagementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
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

