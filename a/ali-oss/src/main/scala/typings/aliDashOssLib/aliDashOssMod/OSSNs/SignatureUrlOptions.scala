package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureUrlOptions extends js.Object {
   // the HTTP method, default is 'GET'
  var `Content-Type`: js.UndefOr[java.lang.String] = js.undefined
   // set the response headers for download
  var callback: js.UndefOr[ObjectCallback] = js.undefined
  var expires: js.UndefOr[scala.Double] = js.undefined
   // after expires seconds, the url will become invalid, default is 1800
  var method: js.UndefOr[HTTPMethods] = js.undefined
   // set the request content type
  var process: js.UndefOr[java.lang.String] = js.undefined
  var response: js.UndefOr[ResponseHeaderType] = js.undefined
}

object SignatureUrlOptions {
  @scala.inline
  def apply(
    `Content-Type`: java.lang.String = null,
    callback: ObjectCallback = null,
    expires: scala.Int | scala.Double = null,
    method: HTTPMethods = null,
    process: java.lang.String = null,
    response: ResponseHeaderType = null
  ): SignatureUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (`Content-Type` != null) __obj.updateDynamic("Content-Type")(`Content-Type`)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (process != null) __obj.updateDynamic("process")(process)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[SignatureUrlOptions]
  }
}

