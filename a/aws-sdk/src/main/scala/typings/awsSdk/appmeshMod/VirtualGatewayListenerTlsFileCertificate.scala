package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualGatewayListenerTlsFileCertificate extends js.Object {
  /**
    * The certificate chain for the certificate.
    */
  var certificateChain: FilePath = js.native
  /**
    * The private key for a certificate stored on the file system of the mesh endpoint that
    the proxy is running on.
    */
  var privateKey: FilePath = js.native
}

object VirtualGatewayListenerTlsFileCertificate {
  @scala.inline
  def apply(certificateChain: FilePath, privateKey: FilePath): VirtualGatewayListenerTlsFileCertificate = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListenerTlsFileCertificate]
  }
  @scala.inline
  implicit class VirtualGatewayListenerTlsFileCertificateOps[Self <: VirtualGatewayListenerTlsFileCertificate] (val x: Self) extends AnyVal {
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
    def setCertificateChain(value: FilePath): Self = this.set("certificateChain", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKey(value: FilePath): Self = this.set("privateKey", value.asInstanceOf[js.Any])
  }
  
}

