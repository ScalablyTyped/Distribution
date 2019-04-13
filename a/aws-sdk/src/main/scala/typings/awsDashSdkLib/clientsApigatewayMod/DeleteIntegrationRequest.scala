package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIntegrationRequest extends js.Object {
  /**
    * [Required] Specifies a delete integration request's HTTP method.
    */
  var httpMethod: String
  /**
    * [Required] Specifies a delete integration request's resource identifier.
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object DeleteIntegrationRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String): DeleteIntegrationRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, resourceId = resourceId, restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteIntegrationRequest]
  }
}

