package typings.apolloEngineReportingProtobuf.protobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.IValues
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a HTTP. */
trait IHTTP extends js.Object {
  /** HTTP host */
  var host: js.UndefOr[String | Null] = js.undefined
  /** HTTP method */
  var method: js.UndefOr[Method | Null] = js.undefined
  /** HTTP path */
  var path: js.UndefOr[String | Null] = js.undefined
  /** HTTP protocol */
  var protocol: js.UndefOr[String | Null] = js.undefined
  /** HTTP requestHeaders */
  var requestHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.undefined
  /** HTTP responseHeaders */
  var responseHeaders: js.UndefOr[StringDictionary[IValues] | Null] = js.undefined
  /** HTTP secure */
  var secure: js.UndefOr[Boolean | Null] = js.undefined
  /** HTTP statusCode */
  var statusCode: js.UndefOr[Double | Null] = js.undefined
}

object IHTTP {
  @scala.inline
  def apply(
    host: js.UndefOr[Null | String] = js.undefined,
    method: js.UndefOr[Null | Method] = js.undefined,
    path: js.UndefOr[Null | String] = js.undefined,
    protocol: js.UndefOr[Null | String] = js.undefined,
    requestHeaders: js.UndefOr[Null | StringDictionary[IValues]] = js.undefined,
    responseHeaders: js.UndefOr[Null | StringDictionary[IValues]] = js.undefined,
    secure: js.UndefOr[Null | Boolean] = js.undefined,
    statusCode: js.UndefOr[Null | Double] = js.undefined
  ): IHTTP = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(host)) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(protocol)) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(requestHeaders)) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(responseHeaders)) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTTP]
  }
}

