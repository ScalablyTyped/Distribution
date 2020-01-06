package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApiMappingRequest extends js.Object {
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: __string = js.native
  /**
    * The domain name.
    */
  var DomainName: __string = js.native
}

object DeleteApiMappingRequest {
  @scala.inline
  def apply(ApiMappingId: __string, DomainName: __string): DeleteApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiMappingId = ApiMappingId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteApiMappingRequest]
  }
}

