package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectCallback extends js.Object {
   // The host header value for initiating callback requests.
  var body: java.lang.String
   // The value of the request body when a callback is initiated, for example, key=$(key)&etag=$(etag)&my_var=$(x:my_var).
  var contentType: js.UndefOr[java.lang.String] = js.undefined
   // The Content-Type of the callback requests initiatiated, It supports application/x-www-form-urlencoded and application/json, and the former is the default value.
  var customValue: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
   // After a file is uploaded successfully, the OSS sends a callback request to this URL.
  var host: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object ObjectCallback {
  @scala.inline
  def apply(
    body: java.lang.String,
    url: java.lang.String,
    contentType: java.lang.String = null,
    customValue: js.Object = null,
    headers: js.Object = null,
    host: java.lang.String = null
  ): ObjectCallback = {
    val __obj = js.Dynamic.literal(body = body, url = url)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (customValue != null) __obj.updateDynamic("customValue")(customValue)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    __obj.asInstanceOf[ObjectCallback]
  }
}

