package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateModelRequest extends js.Object {
  /**
    * [Required] The name of the model to update.
    */
  var modelName: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object UpdateModelRequest {
  @scala.inline
  def apply(modelName: String, restApiId: String, patchOperations: ListOfPatchOperation = null): UpdateModelRequest = {
    val __obj = js.Dynamic.literal(modelName = modelName, restApiId = restApiId)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateModelRequest]
  }
}

