package typings.auth0Widget.mod

import typings.auth0Js.mod.AuthOptions
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
    leeway: js.UndefOr[Double] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    plugins: js.Array[_] = null,
    redirectUri: String = null,
    responseMode: String = null,
    responseType: String = null,
    scope: String = null
  ): Auth0Constructor = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    if (!js.isUndefined(__tryLocalStorageFirst)) __obj.updateDynamic("__tryLocalStorageFirst")(__tryLocalStorageFirst.get.asInstanceOf[js.Any])
    if (!js.isUndefined(_disableDeprecationWarnings)) __obj.updateDynamic("_disableDeprecationWarnings")(_disableDeprecationWarnings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(_sendTelemetry)) __obj.updateDynamic("_sendTelemetry")(_sendTelemetry.get.asInstanceOf[js.Any])
    if (_telemetryInfo != null) __obj.updateDynamic("_telemetryInfo")(_telemetryInfo.asInstanceOf[js.Any])
    if (assetsUrl != null) __obj.updateDynamic("assetsUrl")(assetsUrl.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (cdn != null) __obj.updateDynamic("cdn")(cdn.asInstanceOf[js.Any])
    if (dict != null) __obj.updateDynamic("dict")(dict.asInstanceOf[js.Any])
    if (!js.isUndefined(leeway)) __obj.updateDynamic("leeway")(leeway.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Constructor]
  }
}

