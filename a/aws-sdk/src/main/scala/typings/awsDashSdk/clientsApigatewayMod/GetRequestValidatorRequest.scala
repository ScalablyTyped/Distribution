package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRequestValidatorRequest extends js.Object {
  /**
    * [Required] The identifier of the RequestValidator to be retrieved.
    */
  var requestValidatorId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object GetRequestValidatorRequest {
  @scala.inline
  def apply(requestValidatorId: String, restApiId: String): GetRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(requestValidatorId = requestValidatorId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRequestValidatorRequest]
  }
}

