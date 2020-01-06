package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityCsrResponse extends js.Object {
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  var Csr: js.UndefOr[CsrBody] = js.native
}

object GetCertificateAuthorityCsrResponse {
  @scala.inline
  def apply(Csr: CsrBody = null): GetCertificateAuthorityCsrResponse = {
    val __obj = js.Dynamic.literal()
    if (Csr != null) __obj.updateDynamic("Csr")(Csr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateAuthorityCsrResponse]
  }
}

