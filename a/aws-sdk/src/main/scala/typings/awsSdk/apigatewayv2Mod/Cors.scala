package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cors extends js.Object {
  /**
    * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
    */
  var AllowCredentials: js.UndefOr[boolean] = js.native
  /**
    * Represents a collection of allowed headers. Supported only for HTTP APIs.
    */
  var AllowHeaders: js.UndefOr[CorsHeaderList] = js.native
  /**
    * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
    */
  var AllowMethods: js.UndefOr[CorsMethodList] = js.native
  /**
    * Represents a collection of allowed origins. Supported only for HTTP APIs.
    */
  var AllowOrigins: js.UndefOr[CorsOriginList] = js.native
  /**
    * Represents a collection of exposed headers. Supported only for HTTP APIs.
    */
  var ExposeHeaders: js.UndefOr[CorsHeaderList] = js.native
  /**
    * The number of seconds that the browser should cache preflight request results. Supported only for HTTP APIs.
    */
  var MaxAge: js.UndefOr[IntegerWithLengthBetweenMinus1And86400] = js.native
}

object Cors {
  @scala.inline
  def apply(
    AllowCredentials: js.UndefOr[Boolean] = js.undefined,
    AllowHeaders: CorsHeaderList = null,
    AllowMethods: CorsMethodList = null,
    AllowOrigins: CorsOriginList = null,
    ExposeHeaders: CorsHeaderList = null,
    MaxAge: Int | Double = null
  ): Cors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowCredentials)) __obj.updateDynamic("AllowCredentials")(AllowCredentials.asInstanceOf[js.Any])
    if (AllowHeaders != null) __obj.updateDynamic("AllowHeaders")(AllowHeaders.asInstanceOf[js.Any])
    if (AllowMethods != null) __obj.updateDynamic("AllowMethods")(AllowMethods.asInstanceOf[js.Any])
    if (AllowOrigins != null) __obj.updateDynamic("AllowOrigins")(AllowOrigins.asInstanceOf[js.Any])
    if (ExposeHeaders != null) __obj.updateDynamic("ExposeHeaders")(ExposeHeaders.asInstanceOf[js.Any])
    if (MaxAge != null) __obj.updateDynamic("MaxAge")(MaxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cors]
  }
}

