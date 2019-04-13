package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMethodRequest extends js.Object {
  /**
    * [Required] The HTTP verb of the Method resource.
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

object DeleteMethodRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String): DeleteMethodRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, resourceId = resourceId, restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteMethodRequest]
  }
}

