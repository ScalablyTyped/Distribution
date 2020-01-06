package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIntegrationRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The integration ID.
    */
  var IntegrationId: __string = js.native
}

object DeleteIntegrationRequest {
  @scala.inline
  def apply(ApiId: __string, IntegrationId: __string): DeleteIntegrationRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIntegrationRequest]
  }
}

