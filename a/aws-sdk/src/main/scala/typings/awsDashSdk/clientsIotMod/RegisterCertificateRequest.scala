package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateRequest extends js.Object {
  /**
    * The CA certificate used to sign the device certificate being registered.
    */
  var caCertificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: CertificatePem = js.native
  /**
    * A boolean value that specifies if the certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActiveFlag] = js.native
  /**
    * The status of the register certificate request.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
}

object RegisterCertificateRequest {
  @scala.inline
  def apply(
    certificatePem: CertificatePem,
    caCertificatePem: CertificatePem = null,
    setAsActive: js.UndefOr[scala.Boolean] = js.undefined,
    status: CertificateStatus = null
  ): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem.asInstanceOf[js.Any])
    if (caCertificatePem != null) __obj.updateDynamic("caCertificatePem")(caCertificatePem.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
}

