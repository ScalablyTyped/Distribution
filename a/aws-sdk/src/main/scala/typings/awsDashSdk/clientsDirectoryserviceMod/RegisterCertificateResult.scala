package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateResult extends js.Object {
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.CertificateId] = js.native
}

object RegisterCertificateResult {
  @scala.inline
  def apply(CertificateId: CertificateId = null): RegisterCertificateResult = {
    val __obj = js.Dynamic.literal()
    if (CertificateId != null) __obj.updateDynamic("CertificateId")(CertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateResult]
  }
}

