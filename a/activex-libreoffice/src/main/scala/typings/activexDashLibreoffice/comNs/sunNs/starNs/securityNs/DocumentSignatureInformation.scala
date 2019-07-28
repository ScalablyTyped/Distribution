package typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status of digital signatures in a document.
  *
  * This structure has the information about a digital signature in a document, and the status if the signature is valid.
  */
trait DocumentSignatureInformation extends js.Object {
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
    val __obj = js.Dynamic.literal(CertificateStatus = CertificateStatus, PartialDocumentSignature = PartialDocumentSignature, SignatureDate = SignatureDate, SignatureIsValid = SignatureIsValid, SignatureTime = SignatureTime, Signer = Signer)
  
    __obj.asInstanceOf[DocumentSignatureInformation]
  }
}

