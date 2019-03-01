package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesNodeHttpDependencyTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait httpRequestOptions extends js.Object {
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var family: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
}

object httpRequestOptions {
  @scala.inline
  def apply(
    auth: java.lang.String = null,
    family: scala.Int | scala.Double = null,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    localAddress: java.lang.String = null,
    method: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    socketPath: java.lang.String = null
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

