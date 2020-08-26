package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMethodResponseRequest extends js.Object {
  /**
    * [Required] The HTTP verb of the Method resource.
    */
  var httpMethod: String = js.native
  /**
    * [Required] The Resource identifier for the MethodResponse resource.
    */
  var resourceId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * [Required] The status code identifier for the MethodResponse resource.
    */
  var statusCode: StatusCode = js.native
}

object DeleteMethodResponseRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String, statusCode: StatusCode): DeleteMethodResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMethodResponseRequest]
  }
  @scala.inline
  implicit class DeleteMethodResponseRequestOps[Self <: DeleteMethodResponseRequest] (val x: Self) extends AnyVal {
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
    def setHttpMethod(value: String): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: StatusCode): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

