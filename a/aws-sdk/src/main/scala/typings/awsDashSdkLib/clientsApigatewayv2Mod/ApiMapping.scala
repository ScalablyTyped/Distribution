package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiMapping extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: Id
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
  var Stage: StringWithLengthBetween1And128
}

object ApiMapping {
  @scala.inline
  def apply(
    ApiId: Id,
    Stage: StringWithLengthBetween1And128,
    ApiMappingId: Id = null,
    ApiMappingKey: SelectionKey = null
  ): ApiMapping = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, Stage = Stage)
    if (ApiMappingId != null) __obj.updateDynamic("ApiMappingId")(ApiMappingId)
    if (ApiMappingKey != null) __obj.updateDynamic("ApiMappingKey")(ApiMappingKey)
    __obj.asInstanceOf[ApiMapping]
  }
}

