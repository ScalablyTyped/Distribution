package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMethodResponseRequest extends js.Object {
  /**
    * [Required] The HTTP verb of the Method resource.
    */
  var httpMethod: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  /**
    * [Required] The Resource identifier for the MethodResponse resource.
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] The status code for the MethodResponse resource.
    */
  var statusCode: StatusCode
}

object UpdateMethodResponseRequest {
  @scala.inline
  def apply(
    httpMethod: String,
    resourceId: String,
    restApiId: String,
    statusCode: StatusCode,
    patchOperations: ListOfPatchOperation = null
  ): UpdateMethodResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, resourceId = resourceId, restApiId = restApiId, statusCode = statusCode)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateMethodResponseRequest]
  }
}

