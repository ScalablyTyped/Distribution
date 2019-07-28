package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCertificateFromCsrRequest extends js.Object {
  /**
    * The certificate signing request (CSR).
    */
  var certificateSigningRequest: CertificateSigningRequest
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.undefined
}

object CreateCertificateFromCsrRequest {
  @scala.inline
  def apply(
    certificateSigningRequest: CertificateSigningRequest,
    setAsActive: js.UndefOr[SetAsActive] = js.undefined
  ): CreateCertificateFromCsrRequest = {
    val __obj = js.Dynamic.literal(certificateSigningRequest = certificateSigningRequest)
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive)
    __obj.asInstanceOf[CreateCertificateFromCsrRequest]
  }
}

