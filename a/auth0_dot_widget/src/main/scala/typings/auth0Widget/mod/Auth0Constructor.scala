package typings.auth0Widget.mod

import typings.auth0Js.anon.Jwksuri
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
    _csrf: String = null,
    _disableDeprecationWarnings: js.UndefOr[Boolean] = js.undefined,
    _intstate: String = null,
    _sendTelemetry: js.UndefOr[Boolean] = js.undefined,
    _telemetryInfo: js.Any = null,
    _timesToRetryFailedRequests: js.UndefOr[Double] = js.undefined,
    assetsUrl: String = null,
    audience: String = null,
    cdn: String = null,
    dict: js.Any = null,
    jwksURI: String = null,
    leeway: js.UndefOr[Double] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    overrides: Jwksuri = null,
    plugins: js.Any = null,
    popupOrigin: String = null,
    protocol: String = null,
    redirectUri: String = null,
    responseMode: String = null,
    responseType: String = null,
    response_type: String = null,
    scope: String = null,
    state: String = null,
    tenant: String = null,
    universalLoginPage: js.UndefOr[Boolean] = js.undefined
  ): Auth0Constructor = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    if (!js.isUndefined(__tryLocalStorageFirst)) __obj.updateDynamic("__tryLocalStorageFirst")(__tryLocalStorageFirst.get.asInstanceOf[js.Any])
    if (_csrf != null) __obj.updateDynamic("_csrf")(_csrf.asInstanceOf[js.Any])
    if (!js.isUndefined(_disableDeprecationWarnings)) __obj.updateDynamic("_disableDeprecationWarnings")(_disableDeprecationWarnings.get.asInstanceOf[js.Any])
    if (_intstate != null) __obj.updateDynamic("_intstate")(_intstate.asInstanceOf[js.Any])
    if (!js.isUndefined(_sendTelemetry)) __obj.updateDynamic("_sendTelemetry")(_sendTelemetry.get.asInstanceOf[js.Any])
    if (_telemetryInfo != null) __obj.updateDynamic("_telemetryInfo")(_telemetryInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(_timesToRetryFailedRequests)) __obj.updateDynamic("_timesToRetryFailedRequests")(_timesToRetryFailedRequests.get.asInstanceOf[js.Any])
    if (assetsUrl != null) __obj.updateDynamic("assetsUrl")(assetsUrl.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (cdn != null) __obj.updateDynamic("cdn")(cdn.asInstanceOf[js.Any])
    if (dict != null) __obj.updateDynamic("dict")(dict.asInstanceOf[js.Any])
    if (jwksURI != null) __obj.updateDynamic("jwksURI")(jwksURI.asInstanceOf[js.Any])
    if (!js.isUndefined(leeway)) __obj.updateDynamic("leeway")(leeway.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (popupOrigin != null) __obj.updateDynamic("popupOrigin")(popupOrigin.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tenant != null) __obj.updateDynamic("tenant")(tenant.asInstanceOf[js.Any])
    if (!js.isUndefined(universalLoginPage)) __obj.updateDynamic("universalLoginPage")(universalLoginPage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Constructor]
  }
}

