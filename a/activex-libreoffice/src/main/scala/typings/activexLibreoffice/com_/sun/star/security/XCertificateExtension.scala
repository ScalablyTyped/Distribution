package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of a PKI Certificate
  *
  * This interface represents a x509 certificate.
  */
trait XCertificateExtension
  extends StObject
     with XInterface {
  
  /** Get the extension object identifier in string. */
  var ExtensionId: SafeArray[Double]
  
  /** Get the extension value */
  var ExtensionValue: SafeArray[Double]
  
  /** Check whether it is a critical extension */
  def isCritical(): Boolean
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
  implicit class XCertificateExtensionMutableBuilder[Self <: XCertificateExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionId(value: SafeArray[Double]): Self = StObject.set(x, "ExtensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionValue(value: SafeArray[Double]): Self = StObject.set(x, "ExtensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCritical(value: () => Boolean): Self = StObject.set(x, "isCritical", js.Any.fromFunction0(value))
  }
}
