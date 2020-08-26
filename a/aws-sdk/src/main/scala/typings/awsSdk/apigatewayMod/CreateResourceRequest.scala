package typings.awsSdk.apigatewayMod

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
  @scala.inline
  implicit class CreateResourceRequestOps[Self <: CreateResourceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathPart(value: String): Self = this.set("pathPart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
  }
  
}

