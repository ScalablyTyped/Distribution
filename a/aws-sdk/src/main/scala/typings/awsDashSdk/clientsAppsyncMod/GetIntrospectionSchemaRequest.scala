package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntrospectionSchemaRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The schema format: SDL or JSON.
    */
  var format: OutputType = js.native
  /**
    * A flag that specifies whether the schema introspection should contain directives.
    */
  var includeDirectives: js.UndefOr[BooleanValue] = js.native
}

object GetIntrospectionSchemaRequest {
  @scala.inline
  def apply(apiId: String, format: OutputType, includeDirectives: js.UndefOr[scala.Boolean] = js.undefined): GetIntrospectionSchemaRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDirectives)) __obj.updateDynamic("includeDirectives")(includeDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntrospectionSchemaRequest]
  }
}

