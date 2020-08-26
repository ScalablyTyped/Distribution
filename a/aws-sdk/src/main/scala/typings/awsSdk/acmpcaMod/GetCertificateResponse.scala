package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateResponse extends js.Object {
  /**
    * The base64 PEM-encoded certificate specified by the CertificateArn parameter.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.native
  /**
    * The base64 PEM-encoded certificate chain that chains up to the on-premises root CA certificate that you used to sign your private CA certificate. 
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateChain] = js.native
}

object GetCertificateResponse {
  @scala.inline
  def apply(): GetCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateResponse]
  }
  @scala.inline
  implicit class GetCertificateResponseOps[Self <: GetCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificate(value: CertificateBody): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("Certificate", js.undefined)
    @scala.inline
    def setCertificateChain(value: CertificateChain): Self = this.set("CertificateChain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateChain: Self = this.set("CertificateChain", js.undefined)
  }
  
}

