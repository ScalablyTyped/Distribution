package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReimportApiRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * Represents the base path of the imported API. Supported only for HTTP APIs.
    */
  var Basepath: js.UndefOr[string] = js.native
  /**
    * The OpenAPI definition. Supported only for HTTP APIs.
    */
  var Body: string = js.native
  /**
    * Specifies whether to rollback the API creation (true) or not (false) when a warning is encountered. The default value is false.
    */
  var FailOnWarnings: js.UndefOr[boolean] = js.native
}

object ReimportApiRequest {
  @scala.inline
  def apply(
    ApiId: string,
    Body: string,
    Basepath: string = null,
    FailOnWarnings: js.UndefOr[Boolean] = js.undefined
  ): ReimportApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any])
    if (Basepath != null) __obj.updateDynamic("Basepath")(Basepath.asInstanceOf[js.Any])
    if (!js.isUndefined(FailOnWarnings)) __obj.updateDynamic("FailOnWarnings")(FailOnWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReimportApiRequest]
  }
}

