package typings
package aliDashOssLib.aliDashOssMod.OSSNs

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

object CORSRule {
  @scala.inline
  def apply(
    allowedMethod: java.lang.String | js.Array[java.lang.String],
    allowedOrigin: java.lang.String | js.Array[java.lang.String],
    allowedHeader: java.lang.String | js.Array[java.lang.String] = null,
    exposeHeader: java.lang.String | js.Array[java.lang.String] = null,
    maxAgeSeconds: java.lang.String | js.Array[java.lang.String] = null
  ): CORSRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedMethod")(allowedMethod.asInstanceOf[js.Any])
    __obj.updateDynamic("allowedOrigin")(allowedOrigin.asInstanceOf[js.Any])
    if (allowedHeader != null) __obj.updateDynamic("allowedHeader")(allowedHeader.asInstanceOf[js.Any])
    if (exposeHeader != null) __obj.updateDynamic("exposeHeader")(exposeHeader.asInstanceOf[js.Any])
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
}

