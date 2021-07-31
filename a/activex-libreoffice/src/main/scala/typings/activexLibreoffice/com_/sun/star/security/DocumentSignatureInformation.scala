package typings.activexLibreoffice.com_.sun.star.security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Status of digital signatures in a document.
  *
  * This structure has the information about a digital signature in a document, and the status if the signature is valid.
  */
trait DocumentSignatureInformation extends StObject {
  
  var CertificateStatus: Double
  
  var PartialDocumentSignature: Boolean
  
  var SignatureDate: Double
  
  var SignatureIsValid: Boolean
  
  var SignatureTime: Double
  
  var Signer: XCertificate
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
  implicit class DocumentSignatureInformationMutableBuilder[Self <: DocumentSignatureInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateStatus(value: Double): Self = StObject.set(x, "CertificateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialDocumentSignature(value: Boolean): Self = StObject.set(x, "PartialDocumentSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureDate(value: Double): Self = StObject.set(x, "SignatureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureIsValid(value: Boolean): Self = StObject.set(x, "SignatureIsValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureTime(value: Double): Self = StObject.set(x, "SignatureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigner(value: XCertificate): Self = StObject.set(x, "Signer", value.asInstanceOf[js.Any])
  }
}
