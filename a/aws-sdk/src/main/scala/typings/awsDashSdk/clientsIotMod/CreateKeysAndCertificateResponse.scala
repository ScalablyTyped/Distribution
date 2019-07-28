package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeysAndCertificateResponse extends js.Object {
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  /**
    * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT Certificate).
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  /**
    * The generated key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.undefined
}

object CreateKeysAndCertificateResponse {
  @scala.inline
  def apply(
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    certificatePem: CertificatePem = null,
    keyPair: KeyPair = null
  ): CreateKeysAndCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId)
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem)
    if (keyPair != null) __obj.updateDynamic("keyPair")(keyPair)
    __obj.asInstanceOf[CreateKeysAndCertificateResponse]
  }
}

