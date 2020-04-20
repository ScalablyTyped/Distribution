package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMethodRequest extends js.Object {
  /**
    * [Required] Specifies the method request's HTTP method type.
    */
  var httpMethod: String = js.native
  /**
    * [Required] The Resource identifier for the Method resource.
    */
  var resourceId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object GetMethodRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String): GetMethodRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMethodRequest]
  }
}

