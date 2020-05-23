package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.security.XCertificate
import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error specifying an invalid certificate. */
trait CertificateValidationRequest extends ClassifiedInteractionRequest {
  /** The certificate itself. */
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
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], CertificateValidity = CertificateValidity.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], HostName = HostName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateValidationRequest]
  }
}

