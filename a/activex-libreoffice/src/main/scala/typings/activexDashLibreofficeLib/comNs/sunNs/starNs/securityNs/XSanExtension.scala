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

object XSanExtension {
  @scala.inline
  def apply(
    AlternativeNames: activexDashInteropLib.SafeArray[CertAltNameEntry],
    ExtensionId: activexDashInteropLib.SafeArray[scala.Double],
    ExtensionValue: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    isCritical: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSanExtension = {
    val __obj = js.Dynamic.literal(AlternativeNames = AlternativeNames, ExtensionId = ExtensionId, ExtensionValue = ExtensionValue, acquire = acquire, isCritical = isCritical, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSanExtension]
  }
}

