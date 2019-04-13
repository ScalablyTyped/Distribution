package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadSigningCertificateResponse extends js.Object {
  /**
    * Information about the certificate.
    */
  var Certificate: SigningCertificate
}

object UploadSigningCertificateResponse {
  @scala.inline
  def apply(Certificate: SigningCertificate): UploadSigningCertificateResponse = {
    val __obj = js.Dynamic.literal(Certificate = Certificate)
  
    __obj.asInstanceOf[UploadSigningCertificateResponse]
  }
}

