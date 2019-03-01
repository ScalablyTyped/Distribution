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

object XCertificateExtension {
  @scala.inline
  def apply(
    ExtensionId: activexDashInteropLib.SafeArray[scala.Double],
    ExtensionValue: activexDashInteropLib.SafeArray[scala.Double],
    acquire: js.Function0[scala.Unit],
    isCritical: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCertificateExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ExtensionId")(ExtensionId)
    __obj.updateDynamic("ExtensionValue")(ExtensionValue)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("isCritical")(isCritical)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCertificateExtension]
  }
}

