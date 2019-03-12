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
  var AlternativeNames: stdLib.SafeArray[CertAltNameEntry]
}

object XSanExtension {
  @scala.inline
  def apply(
    AlternativeNames: stdLib.SafeArray[CertAltNameEntry],
    ExtensionId: stdLib.SafeArray[scala.Double],
    ExtensionValue: stdLib.SafeArray[scala.Double],
    acquire: () => scala.Unit,
    isCritical: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSanExtension = {
    val __obj = js.Dynamic.literal(AlternativeNames = AlternativeNames, ExtensionId = ExtensionId, ExtensionValue = ExtensionValue, acquire = js.Any.fromFunction0(acquire), isCritical = js.Any.fromFunction0(isCritical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSanExtension]
  }
}

