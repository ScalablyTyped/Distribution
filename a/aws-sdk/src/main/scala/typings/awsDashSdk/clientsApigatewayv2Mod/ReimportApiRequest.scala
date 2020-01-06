package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReimportApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * Represents the base path of the imported API. Supported only for HTTP APIs.
    */
  var Basepath: js.UndefOr[__string] = js.native
  /**
    * The OpenAPI definition. Supported only for HTTP APIs.
    */
  var Body: __string = js.native
  /**
    * Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The default value is false.
    */
  var FailOnWarnings: js.UndefOr[__boolean] = js.native
}

object ReimportApiRequest {
  @scala.inline
  def apply(
    ApiId: __string,
    Body: __string,
    Basepath: __string = null,
    FailOnWarnings: js.UndefOr[Boolean] = js.undefined
  ): ReimportApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any])
    if (Basepath != null) __obj.updateDynamic("Basepath")(Basepath.asInstanceOf[js.Any])
    if (!js.isUndefined(FailOnWarnings)) __obj.updateDynamic("FailOnWarnings")(FailOnWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReimportApiRequest]
  }
}

