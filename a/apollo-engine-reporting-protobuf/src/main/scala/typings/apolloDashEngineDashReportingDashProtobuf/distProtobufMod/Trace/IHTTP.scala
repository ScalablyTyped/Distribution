package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.IValues
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.HTTP.Method
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
    host: String = null,
    method: Method = null,
    path: String = null,
    protocol: String = null,
    requestHeaders: StringDictionary[IValues] = null,
    responseHeaders: StringDictionary[IValues] = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    statusCode: Int | Double = null
  ): IHTTP = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTTP]
  }
}

