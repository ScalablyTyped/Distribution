package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentationPartRequest extends js.Object {
  /**
    * [Required] The identifier of the to-be-deleted documentation part.
    */
  var documentationPartId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object DeleteDocumentationPartRequest {
  @scala.inline
  def apply(documentationPartId: String, restApiId: String): DeleteDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(documentationPartId = documentationPartId, restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteDocumentationPartRequest]
  }
}

