package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRestApiRequest extends js.Object {
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetRestApiRequest {
  @scala.inline
  def apply(restApiId: String): GetRestApiRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId)
  
    __obj.asInstanceOf[GetRestApiRequest]
  }
}

