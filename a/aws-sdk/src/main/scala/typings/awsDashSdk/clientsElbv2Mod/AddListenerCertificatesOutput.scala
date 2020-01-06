package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddListenerCertificatesOutput extends js.Object {
  /**
    * Information about the certificates in the certificate list.
    */
  var Certificates: js.UndefOr[CertificateList] = js.native
}

object AddListenerCertificatesOutput {
  @scala.inline
  def apply(Certificates: CertificateList = null): AddListenerCertificatesOutput = {
    val __obj = js.Dynamic.literal()
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddListenerCertificatesOutput]
  }
}

