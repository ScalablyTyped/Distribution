package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntrospectionSchemaRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The schema format: SDL or JSON.
    */
  var format: OutputType
  /**
    * A flag that specifies whether the schema introspection should contain directives.
    */
  var includeDirectives: js.UndefOr[BooleanValue] = js.undefined
}

object GetIntrospectionSchemaRequest {
  @scala.inline
  def apply(apiId: String, format: OutputType, includeDirectives: js.UndefOr[BooleanValue] = js.undefined): GetIntrospectionSchemaRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, format = format.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDirectives)) __obj.updateDynamic("includeDirectives")(includeDirectives)
    __obj.asInstanceOf[GetIntrospectionSchemaRequest]
  }
}

