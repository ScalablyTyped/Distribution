package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateIntegrationResponseRequest extends js.Object {
  /**
    * [Required] Specifies an update integration response request's HTTP method.
    */
  var httpMethod: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
  /**
    * [Required] Specifies an update integration response request's resource identifier.
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * [Required] Specifies an update integration response request's status code.
    */
  var statusCode: StatusCode
}

object UpdateIntegrationResponseRequest {
  @scala.inline
  def apply(
    httpMethod: String,
    resourceId: String,
    restApiId: String,
    statusCode: StatusCode,
    patchOperations: ListOfPatchOperation = null
  ): UpdateIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod, resourceId = resourceId, restApiId = restApiId, statusCode = statusCode)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateIntegrationResponseRequest]
  }
}

