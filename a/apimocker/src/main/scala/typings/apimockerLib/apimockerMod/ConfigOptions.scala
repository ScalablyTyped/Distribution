package typings
package apimockerLib.apimockerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var allowAvoidPreFlight: js.UndefOr[scala.Boolean] = js.undefined
  var allowedDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowedHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var logRequestHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var mockDirectory: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String] = js.undefined
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  var useUploadFieldname: js.UndefOr[scala.Boolean] = js.undefined
  var webServices: js.UndefOr[js.Any] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    allowAvoidPreFlight: js.UndefOr[scala.Boolean] = js.undefined,
    allowedDomains: js.Array[java.lang.String] = null,
    allowedHeaders: js.Array[java.lang.String] = null,
    logRequestHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    mockDirectory: java.lang.String = null,
    port: java.lang.String = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    useUploadFieldname: js.UndefOr[scala.Boolean] = js.undefined,
    webServices: js.Any = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAvoidPreFlight)) __obj.updateDynamic("allowAvoidPreFlight")(allowAvoidPreFlight)
    if (allowedDomains != null) __obj.updateDynamic("allowedDomains")(allowedDomains)
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders)
    if (!js.isUndefined(logRequestHeaders)) __obj.updateDynamic("logRequestHeaders")(logRequestHeaders)
    if (mockDirectory != null) __obj.updateDynamic("mockDirectory")(mockDirectory)
    if (port != null) __obj.updateDynamic("port")(port)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (!js.isUndefined(useUploadFieldname)) __obj.updateDynamic("useUploadFieldname")(useUploadFieldname)
    if (webServices != null) __obj.updateDynamic("webServices")(webServices)
    __obj.asInstanceOf[ConfigOptions]
  }
}

