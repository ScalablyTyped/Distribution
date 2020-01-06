package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiMapping extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: Id = js.native
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: js.UndefOr[Id] = js.native
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  /**
    * The API stage.
    */
  var Stage: StringWithLengthBetween1And128 = js.native
}

object ApiMapping {
  @scala.inline
  def apply(
    ApiId: Id,
    Stage: StringWithLengthBetween1And128,
    ApiMappingId: Id = null,
    ApiMappingKey: SelectionKey = null
  ): ApiMapping = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    if (ApiMappingId != null) __obj.updateDynamic("ApiMappingId")(ApiMappingId.asInstanceOf[js.Any])
    if (ApiMappingKey != null) __obj.updateDynamic("ApiMappingKey")(ApiMappingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiMapping]
  }
}

