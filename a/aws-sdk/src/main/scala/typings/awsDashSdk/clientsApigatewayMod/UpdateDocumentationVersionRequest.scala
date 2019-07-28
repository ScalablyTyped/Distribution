package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocumentationVersionRequest extends js.Object {
  /**
    * [Required] The version identifier of the to-be-updated documentation version.
    */
  var documentationVersion: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi..
    */
  var restApiId: String
}

object UpdateDocumentationVersionRequest {
  @scala.inline
  def apply(documentationVersion: String, restApiId: String, patchOperations: ListOfPatchOperation = null): UpdateDocumentationVersionRequest = {
    val __obj = js.Dynamic.literal(documentationVersion = documentationVersion, restApiId = restApiId)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateDocumentationVersionRequest]
  }
}

