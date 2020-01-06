package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntegrationRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The integration ID.
    */
  var IntegrationId: __string = js.native
}

object GetIntegrationRequest {
  @scala.inline
  def apply(ApiId: __string, IntegrationId: __string): GetIntegrationRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIntegrationRequest]
  }
}

