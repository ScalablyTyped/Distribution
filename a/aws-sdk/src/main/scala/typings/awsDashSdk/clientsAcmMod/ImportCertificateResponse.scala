package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportCertificateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the imported certificate.
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
}

object ImportCertificateResponse {
  @scala.inline
  def apply(CertificateArn: Arn = null): ImportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    __obj.asInstanceOf[ImportCertificateResponse]
  }
}

