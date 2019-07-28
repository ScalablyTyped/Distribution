package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMethodRequest extends js.Object {
  /**
    * [Required] Specifies the method request's HTTP method type.
    */
  var httpMethod: String
  /**
    * [Required] The Resource identifier for the Method resource.
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetMethodRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String): GetMethodRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, resourceId = resourceId, restApiId = restApiId)
  
    __obj.asInstanceOf[GetMethodRequest]
  }
}

