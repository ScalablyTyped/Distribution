package typings.auth0DotWidget.auth0DotWidgetMod

import typings.auth0DashJs.auth0DashJsMod.AuthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0Constructor extends AuthOptions {
  var assetsUrl: js.UndefOr[String] = js.undefined
  var cdn: js.UndefOr[String] = js.undefined
  var dict: js.UndefOr[js.Any] = js.undefined
}

object Auth0Constructor {
  @scala.inline
  def apply(
    clientID: String,
    domain: String,
    __tryLocalStorageFirst: js.UndefOr[Boolean] = js.undefined,
    _disableDeprecationWarnings: js.UndefOr[Boolean] = js.undefined,
    _sendTelemetry: js.UndefOr[Boolean] = js.undefined,
    _telemetryInfo: js.Any = null,
    assetsUrl: String = null,
    audience: String = null,
    cdn: String = null,
    dict: js.Any = null,
    leeway: Int | Double = null,
    plugins: js.Array[_] = null,
    redirectUri: String = null,
    responseMode: String = null,
    responseType: String = null,
    scope: String = null
  ): Auth0Constructor = {
    val __obj = js.Dynamic.literal(clientID = clientID, domain = domain)
    if (!js.isUndefined(__tryLocalStorageFirst)) __obj.updateDynamic("__tryLocalStorageFirst")(__tryLocalStorageFirst)
    if (!js.isUndefined(_disableDeprecationWarnings)) __obj.updateDynamic("_disableDeprecationWarnings")(_disableDeprecationWarnings)
    if (!js.isUndefined(_sendTelemetry)) __obj.updateDynamic("_sendTelemetry")(_sendTelemetry)
    if (_telemetryInfo != null) __obj.updateDynamic("_telemetryInfo")(_telemetryInfo)
    if (assetsUrl != null) __obj.updateDynamic("assetsUrl")(assetsUrl)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (cdn != null) __obj.updateDynamic("cdn")(cdn)
    if (dict != null) __obj.updateDynamic("dict")(dict)
    if (leeway != null) __obj.updateDynamic("leeway")(leeway.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Auth0Constructor]
  }
}

