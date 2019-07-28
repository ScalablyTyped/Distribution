package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterCertificateResponse extends js.Object {
  /**
    * The certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  /**
    * The certificate identifier.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
}

object RegisterCertificateResponse {
  @scala.inline
  def apply(certificateArn: CertificateArn = null, certificateId: CertificateId = null): RegisterCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId)
    __obj.asInstanceOf[RegisterCertificateResponse]
  }
}

