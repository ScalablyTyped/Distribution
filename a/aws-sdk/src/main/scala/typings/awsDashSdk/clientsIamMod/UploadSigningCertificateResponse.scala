package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSigningCertificateResponse extends js.Object {
  /**
    * Information about the certificate.
    */
  var Certificate: SigningCertificate = js.native
}

object UploadSigningCertificateResponse {
  @scala.inline
  def apply(Certificate: SigningCertificate): UploadSigningCertificateResponse = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadSigningCertificateResponse]
  }
}

