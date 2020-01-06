package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentationVersionRequest extends js.Object {
  /**
    * [Required] The version identifier of the to-be-retrieved documentation snapshot.
    */
  var documentationVersion: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object GetDocumentationVersionRequest {
  @scala.inline
  def apply(documentationVersion: String, restApiId: String): GetDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDocumentationVersionRequest]
  }
}

