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
    * Specifies how to interpret the base path of the API during import. Valid values are ignore, prepend, and split. The default value is ignore. To learn more, see Set the OpenAPI basePath Property. Supported only for HTTP APIs.
    */
  var Basepath: js.UndefOr[string] = js.native
  /**
    * The OpenAPI definition. Supported only for HTTP APIs.
    */
  var Body: string = js.native
  /**
    * Specifies whether to rollback the API creation when a warning is encountered. By default, API creation continues if a warning is encountered.
    */
  var FailOnWarnings: js.UndefOr[boolean] = js.native
}

object ReimportApiRequest {
  @scala.inline
  def apply(
    ApiId: string,
    Body: string,
    Basepath: string = null,
    FailOnWarnings: js.UndefOr[boolean] = js.undefined
  ): ReimportApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any])
    if (Basepath != null) __obj.updateDynamic("Basepath")(Basepath.asInstanceOf[js.Any])
    if (!js.isUndefined(FailOnWarnings)) __obj.updateDynamic("FailOnWarnings")(FailOnWarnings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReimportApiRequest]
  }
}

