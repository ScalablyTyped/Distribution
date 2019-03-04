package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error specifying an invalid certificate. */
trait CertificateValidationRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.ClassifiedInteractionRequest {
  /** The certificate himself. */
  var Certificate: activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate
  /** This value describes the validity of the certificate. */
  var CertificateValidity: scala.Double
  /** The host name. */
  var HostName: java.lang.String
}

object CertificateValidationRequest {
  @scala.inline
  def apply(
    Certificate: activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate,
    CertificateValidity: scala.Double,
    Classification: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.InteractionClassification,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    HostName: java.lang.String,
    Message: java.lang.String
  ): CertificateValidationRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate, CertificateValidity = CertificateValidity, Classification = Classification, Context = Context, HostName = HostName, Message = Message)
  
    __obj.asInstanceOf[CertificateValidationRequest]
  }
}

