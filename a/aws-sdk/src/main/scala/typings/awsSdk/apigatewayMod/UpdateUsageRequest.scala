package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUsageRequest extends js.Object {
  /**
    * [Required] The identifier of the API key associated with the usage plan in which a temporary extension is granted to the remaining quota.
    */
  var keyId: String = js.native
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
  /**
    * [Required] The Id of the usage plan associated with the usage data.
    */
  var usagePlanId: String = js.native
}

object UpdateUsageRequest {
  @scala.inline
  def apply(keyId: String, usagePlanId: String, patchOperations: ListOfPatchOperation = null): UpdateUsageRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUsageRequest]
  }
}

