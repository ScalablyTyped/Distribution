package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIntegrationRequest extends js.Object {
  /**
    * [Required] Specifies a delete integration request's HTTP method.
    */
  var httpMethod: String = js.native
  /**
    * [Required] Specifies a delete integration request's resource identifier.
    */
  var resourceId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object DeleteIntegrationRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String): DeleteIntegrationRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIntegrationRequest]
  }
}

