package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceRequest extends js.Object {
  /**
    * [Required] The parent resource's identifier.
    */
  var parentId: String
  /**
    * The last path segment for this resource.
    */
  var pathPart: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object CreateResourceRequest {
  @scala.inline
  def apply(parentId: String, pathPart: String, restApiId: String): CreateResourceRequest = {
    val __obj = js.Dynamic.literal(parentId = parentId, pathPart = pathPart, restApiId = restApiId)
  
    __obj.asInstanceOf[CreateResourceRequest]
  }
}

