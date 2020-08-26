package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of a PKI Certificate
  *
  * This interface represents a x509 certificate.
  */
@js.native
trait XCertificateExtension extends XInterface {
  /** Get the extension object identifier in string. */
  var ExtensionId: SafeArray[Double] = js.native
  /** Get the extension value */
  var ExtensionValue: SafeArray[Double] = js.native
  /** Check whether it is a critical extension */
  def isCritical(): Boolean = js.native
}

object XCertificateExtension {
  @scala.inline
  def apply(
    ExtensionId: SafeArray[Double],
    ExtensionValue: SafeArray[Double],
    acquire: () => Unit,
    isCritical: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCertificateExtension = {
    val __obj = js.Dynamic.literal(ExtensionId = ExtensionId.asInstanceOf[js.Any], ExtensionValue = ExtensionValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), isCritical = js.Any.fromFunction0(isCritical), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCertificateExtension]
  }
  @scala.inline
  implicit class XCertificateExtensionOps[Self <: XCertificateExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtensionId(value: SafeArray[Double]): Self = this.set("ExtensionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionValue(value: SafeArray[Double]): Self = this.set("ExtensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCritical(value: () => Boolean): Self = this.set("isCritical", js.Any.fromFunction0(value))
  }
  
}

