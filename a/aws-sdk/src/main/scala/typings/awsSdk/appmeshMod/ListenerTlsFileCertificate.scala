package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerTlsFileCertificate extends js.Object {
  /**
    * The certificate chain for the certificate.
    */
  var certificateChain: FilePath = js.native
  /**
    * The private key for a certificate stored on the file system of the virtual node that the
    proxy is running on.
    */
  var privateKey: FilePath = js.native
}

object ListenerTlsFileCertificate {
  @scala.inline
  def apply(certificateChain: FilePath, privateKey: FilePath): ListenerTlsFileCertificate = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTlsFileCertificate]
  }
}

