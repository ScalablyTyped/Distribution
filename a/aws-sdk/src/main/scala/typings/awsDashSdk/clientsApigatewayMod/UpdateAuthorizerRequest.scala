package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAuthorizerRequest extends js.Object {
  /**
    * [Required] The identifier of the Authorizer resource.
    */
  var authorizerId: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object UpdateAuthorizerRequest {
  @scala.inline
  def apply(authorizerId: String, restApiId: String, patchOperations: ListOfPatchOperation = null): UpdateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerId = authorizerId, restApiId = restApiId)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateAuthorizerRequest]
  }
}

