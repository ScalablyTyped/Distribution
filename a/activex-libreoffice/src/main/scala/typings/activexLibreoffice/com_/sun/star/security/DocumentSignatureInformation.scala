package typings.activexLibreoffice.com_.sun.star.security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Status of digital signatures in a document.
  *
  * This structure has the information about a digital signature in a document, and the status if the signature is valid.
  */
@js.native
trait DocumentSignatureInformation extends js.Object {
  
  var CertificateStatus: Double = js.native
  
  var PartialDocumentSignature: Boolean = js.native
  
  var SignatureDate: Double = js.native
  
  var SignatureIsValid: Boolean = js.native
  
  var SignatureTime: Double = js.native
  
  var Signer: XCertificate = js.native
}
object DocumentSignatureInformation {
  
  @scala.inline
  def apply(
    CertificateStatus: Double,
    PartialDocumentSignature: Boolean,
    SignatureDate: Double,
    SignatureIsValid: Boolean,
    SignatureTime: Double,
    Signer: XCertificate
  ): DocumentSignatureInformation = {
    val __obj = js.Dynamic.literal(CertificateStatus = CertificateStatus.asInstanceOf[js.Any], PartialDocumentSignature = PartialDocumentSignature.asInstanceOf[js.Any], SignatureDate = SignatureDate.asInstanceOf[js.Any], SignatureIsValid = SignatureIsValid.asInstanceOf[js.Any], SignatureTime = SignatureTime.asInstanceOf[js.Any], Signer = Signer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSignatureInformation]
  }
  
  @scala.inline
  implicit class DocumentSignatureInformationOps[Self <: DocumentSignatureInformation] (val x: Self) extends AnyVal {
    
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
    def setCertificateStatus(value: Double): Self = this.set("CertificateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialDocumentSignature(value: Boolean): Self = this.set("PartialDocumentSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureDate(value: Double): Self = this.set("SignatureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureIsValid(value: Boolean): Self = this.set("SignatureIsValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureTime(value: Double): Self = this.set("SignatureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigner(value: XCertificate): Self = this.set("Signer", value.asInstanceOf[js.Any])
  }
}
