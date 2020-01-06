package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCertificateFromCsrRequest extends js.Object {
  /**
    * The certificate signing request (CSR).
    */
  var certificateSigningRequest: CertificateSigningRequest = js.native
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
}

object CreateCertificateFromCsrRequest {
  @scala.inline
  def apply(
    certificateSigningRequest: CertificateSigningRequest,
    setAsActive: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateCertificateFromCsrRequest = {
    val __obj = js.Dynamic.literal(certificateSigningRequest = certificateSigningRequest.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateFromCsrRequest]
  }
}

