package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntrospectionSchemaResponse extends js.Object {
  /**
    * The schema, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
    */
  var schema: js.UndefOr[_Blob] = js.undefined
}

object GetIntrospectionSchemaResponse {
  @scala.inline
  def apply(schema: _Blob = null): GetIntrospectionSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntrospectionSchemaResponse]
  }
}

