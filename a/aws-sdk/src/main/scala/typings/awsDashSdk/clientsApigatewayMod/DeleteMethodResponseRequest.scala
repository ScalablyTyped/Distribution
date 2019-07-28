package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMethodResponseRequest extends js.Object {
  /**
    * [Required] The HTTP verb of the Method resource.
    */
  var httpMethod: String
  /**
    * [Required] The Resource identifier for the MethodResponse resource.
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] The status code identifier for the MethodResponse resource.
    */
  var statusCode: StatusCode
}

object DeleteMethodResponseRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String, statusCode: StatusCode): DeleteMethodResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, resourceId = resourceId, restApiId = restApiId, statusCode = statusCode)
  
    __obj.asInstanceOf[DeleteMethodResponseRequest]
  }
}

