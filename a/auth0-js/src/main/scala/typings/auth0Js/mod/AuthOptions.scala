package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var __tryLocalStorageFirst: js.UndefOr[Boolean] = js.undefined
  var _disableDeprecationWarnings: js.UndefOr[Boolean] = js.undefined
  var _sendTelemetry: js.UndefOr[Boolean] = js.undefined
  var _telemetryInfo: js.UndefOr[js.Any] = js.undefined
  var audience: js.UndefOr[String] = js.undefined
  var clientID: String
  var domain: String
  var leeway: js.UndefOr[Double] = js.undefined
  /**
    * maximum elapsed time in seconds since the last time the user
    * was actively authenticated by the authorization server.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
  var responseMode: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    clientID: String,
    domain: String,
    __tryLocalStorageFirst: js.UndefOr[Boolean] = js.undefined,
    _disableDeprecationWarnings: js.UndefOr[Boolean] = js.undefined,
    _sendTelemetry: js.UndefOr[Boolean] = js.undefined,
    _telemetryInfo: js.Any = null,
    audience: String = null,
    leeway: js.UndefOr[Double] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    plugins: js.Array[_] = null,
    redirectUri: String = null,
    responseMode: String = null,
    responseType: String = null,
    scope: String = null
  ): AuthOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    if (!js.isUndefined(__tryLocalStorageFirst)) __obj.updateDynamic("__tryLocalStorageFirst")(__tryLocalStorageFirst.get.asInstanceOf[js.Any])
    if (!js.isUndefined(_disableDeprecationWarnings)) __obj.updateDynamic("_disableDeprecationWarnings")(_disableDeprecationWarnings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(_sendTelemetry)) __obj.updateDynamic("_sendTelemetry")(_sendTelemetry.get.asInstanceOf[js.Any])
    if (_telemetryInfo != null) __obj.updateDynamic("_telemetryInfo")(_telemetryInfo.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (!js.isUndefined(leeway)) __obj.updateDynamic("leeway")(leeway.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

