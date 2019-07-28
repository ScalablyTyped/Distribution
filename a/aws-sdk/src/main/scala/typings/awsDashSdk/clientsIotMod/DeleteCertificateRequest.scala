package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCertificateRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId
  /**
    * Forces a certificate request to be deleted.
    */
  var forceDelete: js.UndefOr[ForceDelete] = js.undefined
}

object DeleteCertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId, forceDelete: js.UndefOr[ForceDelete] = js.undefined): DeleteCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId)
    if (!js.isUndefined(forceDelete)) __obj.updateDynamic("forceDelete")(forceDelete)
    __obj.asInstanceOf[DeleteCertificateRequest]
  }
}

