package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentationVersionRequest extends js.Object {
  /**
    * [Required] The version identifier of the to-be-retrieved documentation snapshot.
    */
  var documentationVersion: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetDocumentationVersionRequest {
  @scala.inline
  def apply(documentationVersion: String, restApiId: String): GetDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion, restApiId = restApiId)
  
    __obj.asInstanceOf[GetDocumentationVersionRequest]
  }
}

