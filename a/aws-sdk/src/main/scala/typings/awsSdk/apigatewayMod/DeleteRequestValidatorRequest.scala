package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRequestValidatorRequest extends js.Object {
  /**
    * [Required] The identifier of the RequestValidator to be deleted.
    */
  var requestValidatorId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object DeleteRequestValidatorRequest {
  @scala.inline
  def apply(requestValidatorId: String, restApiId: String): DeleteRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(requestValidatorId = requestValidatorId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRequestValidatorRequest]
  }
}

