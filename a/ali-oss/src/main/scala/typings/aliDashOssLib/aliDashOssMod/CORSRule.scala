package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CORSRule extends js.Object {
   // configure for Access-Control-Allow-Methods header
  var allowedHeader: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
   // configure for Access-Control-Allow-Origin header
  var allowedMethod: java.lang.String | js.Array[java.lang.String]
  var allowedOrigin: java.lang.String | js.Array[java.lang.String]
   // configure for Access-Control-Allow-Headers header
  var exposeHeader: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
   // configure for Access-Control-Expose-Headers header
  var maxAgeSeconds: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

