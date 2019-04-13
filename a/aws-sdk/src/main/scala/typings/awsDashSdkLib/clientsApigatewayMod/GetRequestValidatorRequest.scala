package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRequestValidatorRequest extends js.Object {
  /**
    * [Required] The identifier of the RequestValidator to be retrieved.
    */
  var requestValidatorId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetRequestValidatorRequest {
  @scala.inline
  def apply(requestValidatorId: String, restApiId: String): GetRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(requestValidatorId = requestValidatorId, restApiId = restApiId)
  
    __obj.asInstanceOf[GetRequestValidatorRequest]
  }
}

