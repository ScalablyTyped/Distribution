package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferCertificateResponse extends js.Object {
  /**
    * The ARN of the certificate.
    */
  var transferredCertificateArn: js.UndefOr[CertificateArn] = js.undefined
}

object TransferCertificateResponse {
  @scala.inline
  def apply(transferredCertificateArn: CertificateArn = null): TransferCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (transferredCertificateArn != null) __obj.updateDynamic("transferredCertificateArn")(transferredCertificateArn)
    __obj.asInstanceOf[TransferCertificateResponse]
  }
}

