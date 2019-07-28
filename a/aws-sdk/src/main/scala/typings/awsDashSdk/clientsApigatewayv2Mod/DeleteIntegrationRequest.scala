package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIntegrationRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The integration ID.
    */
  var IntegrationId: __string
}

object DeleteIntegrationRequest {
  @scala.inline
  def apply(ApiId: __string, IntegrationId: __string): DeleteIntegrationRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, IntegrationId = IntegrationId)
  
    __obj.asInstanceOf[DeleteIntegrationRequest]
  }
}

