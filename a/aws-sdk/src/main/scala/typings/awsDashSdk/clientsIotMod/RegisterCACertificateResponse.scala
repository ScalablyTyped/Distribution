package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterCACertificateResponse extends js.Object {
  /**
    * The CA certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  /**
    * The CA certificate identifier.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
}

object RegisterCACertificateResponse {
  @scala.inline
  def apply(certificateArn: CertificateArn = null, certificateId: CertificateId = null): RegisterCACertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId)
    __obj.asInstanceOf[RegisterCACertificateResponse]
  }
}

