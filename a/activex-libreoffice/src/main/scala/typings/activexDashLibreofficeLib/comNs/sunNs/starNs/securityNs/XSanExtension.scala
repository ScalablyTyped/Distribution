package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a X509 Subject Alternative Name Certificate Extension
  *
  * This interface represents a x509 certificate extension.
  */
trait XSanExtension extends XCertificateExtension {
  /** Contains the alternative names of a certificate */
  var AlternativeNames: activexDashInteropLib.SafeArray[CertAltNameEntry]
}

