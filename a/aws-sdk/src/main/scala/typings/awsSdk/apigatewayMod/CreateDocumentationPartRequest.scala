package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDocumentationPartRequest extends js.Object {
  /**
    * [Required] The location of the targeted API entity of the to-be-created documentation part.
    */
  var location: DocumentationPartLocation = js.native
  /**
    * [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
    */
  var properties: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object CreateDocumentationPartRequest {
  @scala.inline
  def apply(location: DocumentationPartLocation, properties: String, restApiId: String): CreateDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDocumentationPartRequest]
  }
  @scala.inline
  implicit class CreateDocumentationPartRequestOps[Self <: CreateDocumentationPartRequest] (val x: Self) extends AnyVal {
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
    def setLocation(value: DocumentationPartLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: String): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
  }
  
}

