package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a PKI Certificate
  *
  * This interface represents a x509 certificate.
  */
trait XCertificateExtension
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Get the extension object identifier in string. */
  var ExtensionId: activexDashInteropLib.SafeArray[scala.Double]
  /** Get the extension value */
  var ExtensionValue: activexDashInteropLib.SafeArray[scala.Double]
  /** Check whether it is a critical extension */
  def isCritical(): scala.Boolean
}

