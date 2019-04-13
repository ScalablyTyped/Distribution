package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResourceRequest extends js.Object {
  /**
    * [Required] The identifier of the Resource resource.
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object DeleteResourceRequest {
  @scala.inline
  def apply(resourceId: String, restApiId: String): DeleteResourceRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId, restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteResourceRequest]
  }
}

