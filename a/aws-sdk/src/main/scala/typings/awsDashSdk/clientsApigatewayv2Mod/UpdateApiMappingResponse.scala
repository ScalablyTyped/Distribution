package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApiMappingResponse extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: js.UndefOr[Id] = js.undefined
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: js.UndefOr[Id] = js.undefined
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
  /**
    * The API stage.
    */
  var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
}

object UpdateApiMappingResponse {
  @scala.inline
  def apply(
    ApiId: Id = null,
    ApiMappingId: Id = null,
    ApiMappingKey: SelectionKey = null,
    Stage: StringWithLengthBetween1And128 = null
  ): UpdateApiMappingResponse = {
    val __obj = js.Dynamic.literal()
    if (ApiId != null) __obj.updateDynamic("ApiId")(ApiId)
    if (ApiMappingId != null) __obj.updateDynamic("ApiMappingId")(ApiMappingId)
    if (ApiMappingKey != null) __obj.updateDynamic("ApiMappingKey")(ApiMappingKey)
    if (Stage != null) __obj.updateDynamic("Stage")(Stage)
    __obj.asInstanceOf[UpdateApiMappingResponse]
  }
}

