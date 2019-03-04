package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var _disableDeprecationWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var _sendTelemetry: js.UndefOr[scala.Boolean] = js.undefined
  var _telemetryInfo: js.UndefOr[js.Any] = js.undefined
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var clientID: java.lang.String
  var domain: java.lang.String
  var leeway: js.UndefOr[scala.Double] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  var responseMode: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    domain: java.lang.String,
    _disableDeprecationWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    _sendTelemetry: js.UndefOr[scala.Boolean] = js.undefined,
    _telemetryInfo: js.Any = null,
    audience: java.lang.String = null,
    leeway: scala.Int | scala.Double = null,
    plugins: js.Array[_] = null,
    redirectUri: java.lang.String = null,
    responseMode: java.lang.String = null,
    responseType: java.lang.String = null,
    scope: java.lang.String = null
  ): AuthOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID, domain = domain)
    if (!js.isUndefined(_disableDeprecationWarnings)) __obj.updateDynamic("_disableDeprecationWarnings")(_disableDeprecationWarnings)
    if (!js.isUndefined(_sendTelemetry)) __obj.updateDynamic("_sendTelemetry")(_sendTelemetry)
    if (_telemetryInfo != null) __obj.updateDynamic("_telemetryInfo")(_telemetryInfo)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (leeway != null) __obj.updateDynamic("leeway")(leeway.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AuthOptions]
  }
}

