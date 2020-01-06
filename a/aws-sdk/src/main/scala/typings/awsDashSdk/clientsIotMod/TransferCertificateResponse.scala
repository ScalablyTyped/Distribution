package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferCertificateResponse extends js.Object {
  /**
    * The ARN of the certificate.
    */
  var transferredCertificateArn: js.UndefOr[CertificateArn] = js.native
}

object TransferCertificateResponse {
  @scala.inline
  def apply(transferredCertificateArn: CertificateArn = null): TransferCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (transferredCertificateArn != null) __obj.updateDynamic("transferredCertificateArn")(transferredCertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferCertificateResponse]
  }
}

