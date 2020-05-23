package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
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
  var AlternativeNames: SafeArray[CertAltNameEntry]
}

object XSanExtension {
  @scala.inline
  def apply(
    AlternativeNames: SafeArray[CertAltNameEntry],
    ExtensionId: SafeArray[Double],
    ExtensionValue: SafeArray[Double],
    acquire: () => Unit,
    isCritical: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSanExtension = {
    val __obj = js.Dynamic.literal(AlternativeNames = AlternativeNames.asInstanceOf[js.Any], ExtensionId = ExtensionId.asInstanceOf[js.Any], ExtensionValue = ExtensionValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), isCritical = js.Any.fromFunction0(isCritical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSanExtension]
  }
}

