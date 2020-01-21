package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIntegrationResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * The integration ID.
    */
  var IntegrationId: string = js.native
  /**
    * The integration response ID.
    */
  var IntegrationResponseId: string = js.native
}

object DeleteIntegrationResponseRequest {
  @scala.inline
  def apply(ApiId: string, IntegrationId: string, IntegrationResponseId: string): DeleteIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any], IntegrationResponseId = IntegrationResponseId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIntegrationResponseRequest]
  }
}

