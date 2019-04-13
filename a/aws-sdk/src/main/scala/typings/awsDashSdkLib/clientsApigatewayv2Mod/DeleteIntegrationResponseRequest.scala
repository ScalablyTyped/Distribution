package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIntegrationResponseRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The integration ID.
    */
  var IntegrationId: __string
  /**
    * The integration response ID.
    */
  var IntegrationResponseId: __string
}

object DeleteIntegrationResponseRequest {
  @scala.inline
  def apply(ApiId: __string, IntegrationId: __string, IntegrationResponseId: __string): DeleteIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, IntegrationId = IntegrationId, IntegrationResponseId = IntegrationResponseId)
  
    __obj.asInstanceOf[DeleteIntegrationResponseRequest]
  }
}

