package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUsagePlanRequest extends js.Object {
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
  /**
    * [Required] The Id of the to-be-updated usage plan.
    */
  var usagePlanId: String = js.native
}

object UpdateUsagePlanRequest {
  @scala.inline
  def apply(usagePlanId: String, patchOperations: ListOfPatchOperation = null): UpdateUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUsagePlanRequest]
  }
}

