package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterCertificateRequest extends js.Object {
  /**
    * The CA certificate used to sign the device certificate being registered.
    */
  var caCertificatePem: js.UndefOr[CertificatePem] = js.undefined
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: CertificatePem
  /**
    * A boolean value that specifies if the certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActiveFlag] = js.undefined
  /**
    * The status of the register certificate request.
    */
  var status: js.UndefOr[CertificateStatus] = js.undefined
}

object RegisterCertificateRequest {
  @scala.inline
  def apply(
    certificatePem: CertificatePem,
    caCertificatePem: CertificatePem = null,
    setAsActive: js.UndefOr[SetAsActiveFlag] = js.undefined,
    status: CertificateStatus = null
  ): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem)
    if (caCertificatePem != null) __obj.updateDynamic("caCertificatePem")(caCertificatePem)
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
}

