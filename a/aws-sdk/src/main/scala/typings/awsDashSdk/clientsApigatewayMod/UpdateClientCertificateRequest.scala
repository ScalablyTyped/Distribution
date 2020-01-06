package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClientCertificateRequest extends js.Object {
  /**
    * [Required] The identifier of the ClientCertificate resource to be updated.
    */
  var clientCertificateId: String = js.native
  /**
    * A list of update operations to be applied to the specified resource and in the order specified in this list.
    */
  var patchOperations: js.UndefOr[ListOfPatchOperation] = js.native
}

object UpdateClientCertificateRequest {
  @scala.inline
  def apply(clientCertificateId: String, patchOperations: ListOfPatchOperation = null): UpdateClientCertificateRequest = {
    val __obj = js.Dynamic.literal(clientCertificateId = clientCertificateId.asInstanceOf[js.Any])
    if (patchOperations != null) __obj.updateDynamic("patchOperations")(patchOperations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClientCertificateRequest]
  }
}

