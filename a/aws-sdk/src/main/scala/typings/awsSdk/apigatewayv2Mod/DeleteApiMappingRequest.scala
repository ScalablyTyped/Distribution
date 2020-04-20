package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApiMappingRequest extends js.Object {
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: string = js.native
  /**
    * The domain name.
    */
  var DomainName: string = js.native
}

object DeleteApiMappingRequest {
  @scala.inline
  def apply(ApiMappingId: string, DomainName: string): DeleteApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiMappingRequest]
  }
}

