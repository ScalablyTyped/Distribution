package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status of digital signatures in a document.
  *
  * This structure has the information about a digital signature in a document, and the status if the signature is valid.
  */
trait DocumentSignatureInformation extends js.Object {
  var CertificateStatus: scala.Double
  var PartialDocumentSignature: scala.Boolean
  var SignatureDate: scala.Double
  var SignatureIsValid: scala.Boolean
  var SignatureTime: scala.Double
  var Signer: XCertificate
}

object DocumentSignatureInformation {
  @scala.inline
  def apply(
    CertificateStatus: scala.Double,
    PartialDocumentSignature: scala.Boolean,
    SignatureDate: scala.Double,
    SignatureIsValid: scala.Boolean,
    SignatureTime: scala.Double,
    Signer: XCertificate
  ): DocumentSignatureInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CertificateStatus")(CertificateStatus)
    __obj.updateDynamic("PartialDocumentSignature")(PartialDocumentSignature)
    __obj.updateDynamic("SignatureDate")(SignatureDate)
    __obj.updateDynamic("SignatureIsValid")(SignatureIsValid)
    __obj.updateDynamic("SignatureTime")(SignatureTime)
    __obj.updateDynamic("Signer")(Signer)
    __obj.asInstanceOf[DocumentSignatureInformation]
  }
}

