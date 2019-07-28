package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResourceRequest extends js.Object {
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  /**
    * [Required] The identifier of the Resource resource.
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object UpdateResourceRequest {
  @scala.inline
  def apply(resourceId: String, restApiId: String, patchOperations: ListOfPatchOperation = null): UpdateResourceRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId, restApiId = restApiId)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateResourceRequest]
  }
}

