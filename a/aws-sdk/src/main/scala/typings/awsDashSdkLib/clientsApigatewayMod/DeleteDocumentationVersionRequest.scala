package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentationVersionRequest extends js.Object {
  /**
    * [Required] The version identifier of a to-be-deleted documentation snapshot.
    */
  var documentationVersion: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object DeleteDocumentationVersionRequest {
  @scala.inline
  def apply(documentationVersion: String, restApiId: String): DeleteDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion, restApiId = restApiId)
  
    __obj.asInstanceOf[DeleteDocumentationVersionRequest]
  }
}

