package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApiMappingRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: Id
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
  /**
    * The domain name.
    */
  var DomainName: __string
  /**
    * The API stage.
    */
  var Stage: StringWithLengthBetween1And128
}

object CreateApiMappingRequest {
  @scala.inline
  def apply(
    ApiId: Id,
    DomainName: __string,
    Stage: StringWithLengthBetween1And128,
    ApiMappingKey: SelectionKey = null
  ): CreateApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, DomainName = DomainName, Stage = Stage)
    if (ApiMappingKey != null) __obj.updateDynamic("ApiMappingKey")(ApiMappingKey)
    __obj.asInstanceOf[CreateApiMappingRequest]
  }
}

