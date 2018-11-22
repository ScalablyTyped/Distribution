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

