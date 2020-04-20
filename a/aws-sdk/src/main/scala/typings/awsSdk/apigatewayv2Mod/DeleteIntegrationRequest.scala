package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIntegrationRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The integration ID.
    */
  var IntegrationId: string = js.native
}

object DeleteIntegrationRequest {
  @scala.inline
  def apply(ApiId: string, IntegrationId: string): DeleteIntegrationRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntegrationRequest]
  }
}

