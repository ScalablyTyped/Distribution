package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.security.XCertificate
import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error specifying an invalid certificate. */
@js.native
trait CertificateValidationRequest extends ClassifiedInteractionRequest {
  
  /** The certificate itself. */
  var Certificate: XCertificate = js.native
  
  /** This value describes the validity of the certificate. */
  var CertificateValidity: Double = js.native
  
  /** The host name. */
  var HostName: String = js.native
}
object CertificateValidationRequest {
  
  @scala.inline
  def apply(
    Certificate: XCertificate,
    CertificateValidity: Double,
    Classification: InteractionClassification,
    Context: XInterface,
    HostName: String,
    Message: String
  ): CertificateValidationRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], CertificateValidity = CertificateValidity.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], HostName = HostName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateValidationRequest]
  }
  
  @scala.inline
  implicit class CertificateValidationRequestOps[Self <: CertificateValidationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificate(value: XCertificate): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateValidity(value: Double): Self = this.set("CertificateValidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostName(value: String): Self = this.set("HostName", value.asInstanceOf[js.Any])
  }
}
