package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntegrationResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The integration ID.
    */
  var IntegrationId: __string = js.native
  /**
    * The integration response ID.
    */
  var IntegrationResponseId: __string = js.native
}

object GetIntegrationResponseRequest {
  @scala.inline
  def apply(ApiId: __string, IntegrationId: __string, IntegrationResponseId: __string): GetIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationId = IntegrationId.asInstanceOf[js.Any], IntegrationResponseId = IntegrationResponseId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIntegrationResponseRequest]
  }
}

