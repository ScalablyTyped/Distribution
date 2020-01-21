package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CORSRule extends js.Object {
   // configure for Access-Control-Allow-Methods header
  var allowedHeader: js.UndefOr[String | js.Array[String]] = js.undefined
   // configure for Access-Control-Allow-Origin header
  var allowedMethod: String | js.Array[String]
  var allowedOrigin: String | js.Array[String]
   // configure for Access-Control-Allow-Headers header
  var exposeHeader: js.UndefOr[String | js.Array[String]] = js.undefined
   // configure for Access-Control-Expose-Headers header
  var maxAgeSeconds: js.UndefOr[String | js.Array[String]] = js.undefined
}

object CORSRule {
  @scala.inline
  def apply(
    allowedMethod: String | js.Array[String],
    allowedOrigin: String | js.Array[String],
    allowedHeader: String | js.Array[String] = null,
    exposeHeader: String | js.Array[String] = null,
    maxAgeSeconds: String | js.Array[String] = null
  ): CORSRule = {
    val __obj = js.Dynamic.literal(allowedMethod = allowedMethod.asInstanceOf[js.Any], allowedOrigin = allowedOrigin.asInstanceOf[js.Any])
    if (allowedHeader != null) __obj.updateDynamic("allowedHeader")(allowedHeader.asInstanceOf[js.Any])
    if (exposeHeader != null) __obj.updateDynamic("exposeHeader")(exposeHeader.asInstanceOf[js.Any])
    if (maxAgeSeconds != null) __obj.updateDynamic("maxAgeSeconds")(maxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
}

