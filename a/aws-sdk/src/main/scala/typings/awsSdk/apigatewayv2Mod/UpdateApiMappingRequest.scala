package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApiMappingRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: Id = js.native
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: string = js.native
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  /**
    * The domain name.
    */
  var DomainName: string = js.native
  /**
    * The API stage.
    */
  var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.native
}

object UpdateApiMappingRequest {
  @scala.inline
  def apply(
    ApiId: Id,
    ApiMappingId: string,
    DomainName: string,
    ApiMappingKey: SelectionKey = null,
    Stage: StringWithLengthBetween1And128 = null
  ): UpdateApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    if (ApiMappingKey != null) __obj.updateDynamic("ApiMappingKey")(ApiMappingKey.asInstanceOf[js.Any])
    if (Stage != null) __obj.updateDynamic("Stage")(Stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiMappingRequest]
  }
}

