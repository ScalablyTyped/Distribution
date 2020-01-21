package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentationPartRequest extends js.Object {
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var documentationPartId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object GetDocumentationPartRequest {
  @scala.inline
  def apply(documentationPartId: String, restApiId: String): GetDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(documentationPartId = documentationPartId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDocumentationPartRequest]
  }
}

