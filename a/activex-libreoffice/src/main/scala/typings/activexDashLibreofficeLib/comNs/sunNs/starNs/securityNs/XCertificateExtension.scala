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
  var ExtensionId: stdLib.SafeArray[scala.Double]
  /** Get the extension value */
  var ExtensionValue: stdLib.SafeArray[scala.Double]
  /** Check whether it is a critical extension */
  def isCritical(): scala.Boolean
}

object XCertificateExtension {
  @scala.inline
  def apply(
    ExtensionId: stdLib.SafeArray[scala.Double],
    ExtensionValue: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    isCritical: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCertificateExtension = {
    val __obj = js.Dynamic.literal(ExtensionId = ExtensionId, ExtensionValue = ExtensionValue, acquire = js.Any.fromFunction0(acquire), isCritical = js.Any.fromFunction0(isCritical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCertificateExtension]
  }
}

