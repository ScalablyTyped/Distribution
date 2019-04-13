package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportClientVpnClientCertificateRevocationListResult extends js.Object {
  /**
    * Information about the client certificate revocation list.
    */
  var CertificateRevocationList: js.UndefOr[String] = js.undefined
  /**
    * The current state of the client certificate revocation list.
    */
  var Status: js.UndefOr[ClientCertificateRevocationListStatus] = js.undefined
}

object ExportClientVpnClientCertificateRevocationListResult {
  @scala.inline
  def apply(CertificateRevocationList: String = null, Status: ClientCertificateRevocationListStatus = null): ExportClientVpnClientCertificateRevocationListResult = {
    val __obj = js.Dynamic.literal()
    if (CertificateRevocationList != null) __obj.updateDynamic("CertificateRevocationList")(CertificateRevocationList)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ExportClientVpnClientCertificateRevocationListResult]
  }
}

