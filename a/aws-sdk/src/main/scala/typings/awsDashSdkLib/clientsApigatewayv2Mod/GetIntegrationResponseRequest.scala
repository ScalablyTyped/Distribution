package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntegrationResponseRequest extends js.Object {
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

object GetIntegrationResponseRequest {
  @scala.inline
  def apply(ApiId: __string, IntegrationId: __string, IntegrationResponseId: __string): GetIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, IntegrationId = IntegrationId, IntegrationResponseId = IntegrationResponseId)
  
    __obj.asInstanceOf[GetIntegrationResponseRequest]
  }
}

