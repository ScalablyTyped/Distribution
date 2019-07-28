package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntegrationRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The integration ID.
    */
  var IntegrationId: __string
}

object GetIntegrationRequest {
  @scala.inline
  def apply(ApiId: __string, IntegrationId: __string): GetIntegrationRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, IntegrationId = IntegrationId)
  
    __obj.asInstanceOf[GetIntegrationRequest]
  }
}

