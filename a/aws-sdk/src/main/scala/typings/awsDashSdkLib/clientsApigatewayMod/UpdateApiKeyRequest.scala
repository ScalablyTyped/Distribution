package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApiKeyRequest extends js.Object {
  /**
    * [Required] The identifier of the ApiKey resource to be updated.
    */
  var apiKey: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
}

object UpdateApiKeyRequest {
  @scala.inline
  def apply(apiKey: String, patchOperations: ListOfPatchOperation = null): UpdateApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateApiKeyRequest]
  }
}

