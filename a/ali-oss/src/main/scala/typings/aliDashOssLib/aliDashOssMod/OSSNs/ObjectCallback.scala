package typings
package aliDashOssLib.aliDashOssMod.OSSNs

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

