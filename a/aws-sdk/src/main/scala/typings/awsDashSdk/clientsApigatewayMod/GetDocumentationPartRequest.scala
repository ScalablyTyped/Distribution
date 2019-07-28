package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentationPartRequest extends js.Object {
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var documentationPartId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetDocumentationPartRequest {
  @scala.inline
  def apply(documentationPartId: String, restApiId: String): GetDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(documentationPartId = documentationPartId, restApiId = restApiId)
  
    __obj.asInstanceOf[GetDocumentationPartRequest]
  }
}

