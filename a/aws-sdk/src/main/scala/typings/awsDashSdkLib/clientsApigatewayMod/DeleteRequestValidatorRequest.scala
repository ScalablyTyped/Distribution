package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRequestValidatorRequest extends js.Object {
  /**
    * [Required] The identifier of the RequestValidator to be deleted.
    */
  var requestValidatorId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object DeleteRequestValidatorRequest {
  @scala.inline
  def apply(requestValidatorId: String, restApiId: String): DeleteRequestValidatorRequest = {
    val __obj = js.Dynamic.literal(requestValidatorId = requestValidatorId, restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteRequestValidatorRequest]
  }
}

