package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateModelRequest extends js.Object {
  /**
    * [Required] The name of the model to update.
    */
  var modelName: String = js.native
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
}

object UpdateModelRequest {
  @scala.inline
  def apply(modelName: String, restApiId: String, patchOperations: ListOfPatchOperation = null): UpdateModelRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelRequest]
  }
}

