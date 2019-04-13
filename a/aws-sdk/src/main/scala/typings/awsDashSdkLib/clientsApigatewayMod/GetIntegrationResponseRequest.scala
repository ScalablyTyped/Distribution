package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntegrationResponseRequest extends js.Object {
  /**
    * [Required] Specifies a get integration response request's HTTP method.
    */
  var httpMethod: String
  /**
    * [Required] Specifies a get integration response request's resource identifier.
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] Specifies a get integration response request's status code.
    */
  var statusCode: StatusCode
}

object GetIntegrationResponseRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String, statusCode: StatusCode): GetIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, resourceId = resourceId, restApiId = restApiId, statusCode = statusCode)
  
    __obj.asInstanceOf[GetIntegrationResponseRequest]
  }
}

