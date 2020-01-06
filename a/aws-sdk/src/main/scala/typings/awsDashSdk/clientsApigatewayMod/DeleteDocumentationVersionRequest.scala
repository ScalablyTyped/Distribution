package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDocumentationVersionRequest extends js.Object {
  /**
    * [Required] The version identifier of a to-be-deleted documentation snapshot.
    */
  var documentationVersion: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object DeleteDocumentationVersionRequest {
  @scala.inline
  def apply(documentationVersion: String, restApiId: String): DeleteDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDocumentationVersionRequest]
  }
}

