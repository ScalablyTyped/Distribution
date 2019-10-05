package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CORSRule extends js.Object {
  /**
    * Headers that are specified in the Access-Control-Request-Headers header. These headers are allowed in a preflight OPTIONS request. In response to any preflight OPTIONS request, Amazon S3 returns any requested headers that are allowed.
    */
  var AllowedHeaders: js.UndefOr[typings.awsDashSdk.clientsS3Mod.AllowedHeaders] = js.undefined
  /**
    * An HTTP method that you allow the origin to execute. Valid values are GET, PUT, HEAD, POST, and DELETE.
    */
  var AllowedMethods: typings.awsDashSdk.clientsS3Mod.AllowedMethods
  /**
    * One or more origins you want customers to be able to access the bucket from.
    */
  var AllowedOrigins: typings.awsDashSdk.clientsS3Mod.AllowedOrigins
  /**
    * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
    */
  var ExposeHeaders: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ExposeHeaders] = js.undefined
  /**
    * The time in seconds that your browser is to cache the preflight response for the specified resource.
    */
  var MaxAgeSeconds: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MaxAgeSeconds] = js.undefined
}

object CORSRule {
  @scala.inline
  def apply(
    AllowedMethods: AllowedMethods,
    AllowedOrigins: AllowedOrigins,
    AllowedHeaders: AllowedHeaders = null,
    ExposeHeaders: ExposeHeaders = null,
    MaxAgeSeconds: Int | Double = null
  ): CORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods, AllowedOrigins = AllowedOrigins)
    if (AllowedHeaders != null) __obj.updateDynamic("AllowedHeaders")(AllowedHeaders)
    if (ExposeHeaders != null) __obj.updateDynamic("ExposeHeaders")(ExposeHeaders)
    if (MaxAgeSeconds != null) __obj.updateDynamic("MaxAgeSeconds")(MaxAgeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CORSRule]
  }
}

