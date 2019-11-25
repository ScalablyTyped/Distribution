package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureUrlOptions extends js.Object {
   // the HTTP method, default is 'GET'
  var `Content-Type`: js.UndefOr[String] = js.undefined
   // set the response headers for download
  var callback: js.UndefOr[ObjectCallback] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
   // after expires seconds, the url will become invalid, default is 1800
  var method: js.UndefOr[HTTPMethods] = js.undefined
   // set the request content type
  var process: js.UndefOr[String] = js.undefined
  var response: js.UndefOr[ResponseHeaderType] = js.undefined
}

object SignatureUrlOptions {
  @scala.inline
  def apply(
    `Content-Type`: String = null,
    callback: ObjectCallback = null,
    expires: Int | Double = null,
    method: HTTPMethods = null,
    process: String = null,
    response: ResponseHeaderType = null
  ): SignatureUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (`Content-Type` != null) __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureUrlOptions]
  }
}

