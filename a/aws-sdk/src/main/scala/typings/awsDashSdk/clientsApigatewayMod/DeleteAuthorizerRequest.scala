package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAuthorizerRequest extends js.Object {
  /**
    * [Required] The identifier of the Authorizer resource.
    */
  var authorizerId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object DeleteAuthorizerRequest {
  @scala.inline
  def apply(authorizerId: String, restApiId: String): DeleteAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerId = authorizerId, restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteAuthorizerRequest]
  }
}

