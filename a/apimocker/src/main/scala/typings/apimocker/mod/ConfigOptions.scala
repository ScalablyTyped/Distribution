package typings.apimocker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var allowAvoidPreFlight: js.UndefOr[Boolean] = js.undefined
  var allowedDomains: js.UndefOr[js.Array[String]] = js.undefined
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var logRequestHeaders: js.UndefOr[Boolean] = js.undefined
  var mockDirectory: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var useUploadFieldname: js.UndefOr[Boolean] = js.undefined
  var webServices: js.UndefOr[js.Any] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    allowAvoidPreFlight: js.UndefOr[Boolean] = js.undefined,
    allowedDomains: js.Array[String] = null,
    allowedHeaders: js.Array[String] = null,
    logRequestHeaders: js.UndefOr[Boolean] = js.undefined,
    mockDirectory: String = null,
    port: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    useUploadFieldname: js.UndefOr[Boolean] = js.undefined,
    webServices: js.Any = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAvoidPreFlight)) __obj.updateDynamic("allowAvoidPreFlight")(allowAvoidPreFlight.asInstanceOf[js.Any])
    if (allowedDomains != null) __obj.updateDynamic("allowedDomains")(allowedDomains.asInstanceOf[js.Any])
    if (allowedHeaders != null) __obj.updateDynamic("allowedHeaders")(allowedHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(logRequestHeaders)) __obj.updateDynamic("logRequestHeaders")(logRequestHeaders.asInstanceOf[js.Any])
    if (mockDirectory != null) __obj.updateDynamic("mockDirectory")(mockDirectory.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (!js.isUndefined(useUploadFieldname)) __obj.updateDynamic("useUploadFieldname")(useUploadFieldname.asInstanceOf[js.Any])
    if (webServices != null) __obj.updateDynamic("webServices")(webServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

