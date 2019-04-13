package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStageRequest extends js.Object {
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] The name of the Stage resource to change information about.
    */
  var stageName: String
}

object UpdateStageRequest {
  @scala.inline
  def apply(restApiId: String, stageName: String, patchOperations: ListOfPatchOperation = null): UpdateStageRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId, stageName = stageName)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateStageRequest]
  }
}

