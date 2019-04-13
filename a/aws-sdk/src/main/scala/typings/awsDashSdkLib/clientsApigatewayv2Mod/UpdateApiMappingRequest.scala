package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApiMappingRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: Id
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: __string
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
  /**
    * The domain name.
    */
  var DomainName: __string
  /**
    * The API stage.
    */
  var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
}

object UpdateApiMappingRequest {
  @scala.inline
  def apply(
    ApiId: Id,
    ApiMappingId: __string,
    DomainName: __string,
    ApiMappingKey: SelectionKey = null,
    Stage: StringWithLengthBetween1And128 = null
  ): UpdateApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, ApiMappingId = ApiMappingId, DomainName = DomainName)
    if (ApiMappingKey != null) __obj.updateDynamic("ApiMappingKey")(ApiMappingKey)
    if (Stage != null) __obj.updateDynamic("Stage")(Stage)
    __obj.asInstanceOf[UpdateApiMappingRequest]
  }
}

