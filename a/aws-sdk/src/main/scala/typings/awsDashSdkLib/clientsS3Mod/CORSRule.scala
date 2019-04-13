package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CORSRule extends js.Object {
  /**
    * Specifies which headers are allowed in a pre-flight OPTIONS request.
    */
  var AllowedHeaders: js.UndefOr[AllowedHeaders] = js.undefined
  /**
    * Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.
    */
  var AllowedMethods: awsDashSdkLib.clientsS3Mod.AllowedMethods
  /**
    * One or more origins you want customers to be able to access the bucket from.
    */
  var AllowedOrigins: awsDashSdkLib.clientsS3Mod.AllowedOrigins
  /**
    * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
    */
  var ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined
  /**
    * The time in seconds that your browser is to cache the preflight response for the specified resource.
    */
  var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined
}

object CORSRule {
  @scala.inline
  def apply(
    AllowedMethods: AllowedMethods,
    AllowedOrigins: AllowedOrigins,
    AllowedHeaders: AllowedHeaders = null,
    ExposeHeaders: ExposeHeaders = null,
    MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined
  ): CORSRule = {
    val __obj = js.Dynamic.literal(AllowedMethods = AllowedMethods, AllowedOrigins = AllowedOrigins)
    if (AllowedHeaders != null) __obj.updateDynamic("AllowedHeaders")(AllowedHeaders)
    if (ExposeHeaders != null) __obj.updateDynamic("ExposeHeaders")(ExposeHeaders)
    if (!js.isUndefined(MaxAgeSeconds)) __obj.updateDynamic("MaxAgeSeconds")(MaxAgeSeconds)
    __obj.asInstanceOf[CORSRule]
  }
}

