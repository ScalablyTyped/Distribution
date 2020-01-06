package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceRequest extends js.Object {
  /**
    * [Required] The parent resource's identifier.
    */
  var parentId: String = js.native
  /**
    * The last path segment for this resource.
    */
  var pathPart: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object CreateResourceRequest {
  @scala.inline
  def apply(parentId: String, pathPart: String, restApiId: String): CreateResourceRequest = {
    val __obj = js.Dynamic.literal(parentId = parentId.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateResourceRequest]
  }
}

