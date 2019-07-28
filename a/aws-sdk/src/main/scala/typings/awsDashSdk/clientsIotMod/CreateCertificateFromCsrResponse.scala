package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCertificateFromCsrResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificate. You can use the ARN as a principal for policy operations.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  /**
    * The ID of the certificate. Certificate management operations only take a certificateId.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
}

object CreateCertificateFromCsrResponse {
  @scala.inline
  def apply(
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    certificatePem: CertificatePem = null
  ): CreateCertificateFromCsrResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId)
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem)
    __obj.asInstanceOf[CreateCertificateFromCsrResponse]
  }
}

