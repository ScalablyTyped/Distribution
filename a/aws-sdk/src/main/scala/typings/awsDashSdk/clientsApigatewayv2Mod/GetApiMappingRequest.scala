package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApiMappingRequest extends js.Object {
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: __string
  /**
    * The domain name.
    */
  var DomainName: __string
}

object GetApiMappingRequest {
  @scala.inline
  def apply(ApiMappingId: __string, DomainName: __string): GetApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiMappingId = ApiMappingId, DomainName = DomainName)
  
    __obj.asInstanceOf[GetApiMappingRequest]
  }
}

