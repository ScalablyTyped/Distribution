package typings.applicationinsights.outDeclarationsContractsTelemetryTypesNodeHttpDependencyTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait httpRequestOptions extends js.Object {
  var auth: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
}

object httpRequestOptions {
  @scala.inline
  def apply(
    auth: String = null,
    family: Int | Double = null,
    headers: StringDictionary[js.Any] = null,
    host: String = null,
    hostname: String = null,
    localAddress: String = null,
    method: String = null,
    path: String = null,
    port: Int | Double = null,
    protocol: String = null,
    socketPath: String = null
  ): httpRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    __obj.asInstanceOf[httpRequestOptions]
  }
}

