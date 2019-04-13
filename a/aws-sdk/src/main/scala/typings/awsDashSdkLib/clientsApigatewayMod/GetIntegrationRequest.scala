package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntegrationRequest extends js.Object {
  /**
    * [Required] Specifies a get integration request's HTTP method.
    */
  var httpMethod: String
  /**
    * [Required] Specifies a get integration request's resource identifier
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetIntegrationRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String): GetIntegrationRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, resourceId = resourceId, restApiId = restApiId)
  
    __obj.asInstanceOf[GetIntegrationRequest]
  }
}

