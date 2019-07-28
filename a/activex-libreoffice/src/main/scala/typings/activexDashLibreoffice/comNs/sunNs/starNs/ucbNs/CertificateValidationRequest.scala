package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs.XCertificate
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.InteractionClassification
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error specifying an invalid certificate. */
trait CertificateValidationRequest extends ClassifiedInteractionRequest {
  /** The certificate himself. */
  var Certificate: XCertificate
  /** This value describes the validity of the certificate. */
  var CertificateValidity: Double
  /** The host name. */
  var HostName: String
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
    val __obj = js.Dynamic.literal(Certificate = Certificate, CertificateValidity = CertificateValidity, Classification = Classification, Context = Context, HostName = HostName, Message = Message)
  
    __obj.asInstanceOf[CertificateValidationRequest]
  }
}

