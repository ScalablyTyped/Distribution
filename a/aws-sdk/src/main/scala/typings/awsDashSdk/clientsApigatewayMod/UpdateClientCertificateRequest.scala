package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClientCertificateRequest extends js.Object {
  /**
    * [Required] The identifier of the ClientCertificate resource to be updated.
    */
  var clientCertificateId: String
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
}

object UpdateClientCertificateRequest {
  @scala.inline
  def apply(clientCertificateId: String, patchOperations: ListOfPatchOperation = null): UpdateClientCertificateRequest = {
    val __obj = js.Dynamic.literal(clientCertificateId = clientCertificateId)
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations)
    __obj.asInstanceOf[UpdateClientCertificateRequest]
  }
}

