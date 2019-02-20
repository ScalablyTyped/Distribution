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

