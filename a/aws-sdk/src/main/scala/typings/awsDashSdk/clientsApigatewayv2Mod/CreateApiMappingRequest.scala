package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiMappingRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: Id = js.native
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  /**
    * The domain name.
    */
  var DomainName: __string = js.native
  /**
    * The API stage.
    */
  var Stage: StringWithLengthBetween1And128 = js.native
}

object CreateApiMappingRequest {
  @scala.inline
  def apply(
    ApiId: Id,
    DomainName: __string,
    Stage: StringWithLengthBetween1And128,
    ApiMappingKey: SelectionKey = null
  ): CreateApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    if (ApiMappingKey != null) __obj.updateDynamic("ApiMappingKey")(ApiMappingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiMappingRequest]
  }
}

