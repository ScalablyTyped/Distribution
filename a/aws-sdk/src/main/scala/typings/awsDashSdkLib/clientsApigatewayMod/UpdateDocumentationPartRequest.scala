package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDocumentationPartRequest extends js.Object {
  /**
    * [Required] The identifier of the to-be-updated documentation part.
    */
  var documentationPartId: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object UpdateDocumentationPartRequest {
  @scala.inline
  def apply(documentationPartId: String, restApiId: String, patchOperations: ListOfPatchOperation = null): UpdateDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(documentationPartId = documentationPartId, restApiId = restApiId)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateDocumentationPartRequest]
  }
}

