package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportClientVpnClientCertificateRevocationListResult extends js.Object {
  /**
    * Information about the client certificate revocation list.
    */
  var CertificateRevocationList: js.UndefOr[String] = js.native
  /**
    * The current state of the client certificate revocation list.
    */
  var Status: js.UndefOr[ClientCertificateRevocationListStatus] = js.native
}

object ExportClientVpnClientCertificateRevocationListResult {
  @scala.inline
  def apply(CertificateRevocationList: String = null, Status: ClientCertificateRevocationListStatus = null): ExportClientVpnClientCertificateRevocationListResult = {
    val __obj = js.Dynamic.literal()
    if (CertificateRevocationList != null) __obj.updateDynamic("CertificateRevocationList")(CertificateRevocationList.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportClientVpnClientCertificateRevocationListResult]
  }
}

