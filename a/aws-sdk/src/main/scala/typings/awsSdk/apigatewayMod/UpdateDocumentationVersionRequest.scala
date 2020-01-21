package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDocumentationVersionRequest extends js.Object {
  /**
    * [Required] The version identifier of the to-be-updated documentation version.
    */
  var documentationVersion: String = js.native
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
  /**
    * [Required] The string identifier of the associated RestApi..
    */
  var restApiId: String = js.native
}

object UpdateDocumentationVersionRequest {
  @scala.inline
  def apply(documentationVersion: String, restApiId: String, patchOperations: ListOfPatchOperation = null): UpdateDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDocumentationVersionRequest]
  }
}

