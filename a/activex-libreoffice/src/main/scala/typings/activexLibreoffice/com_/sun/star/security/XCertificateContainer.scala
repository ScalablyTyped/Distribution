package typings.activexLibreoffice.com_.sun.star.security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manage user certificate for temporary connections.
  * @see CertificateContainer
  * @since OOo 2.3.1
  */
trait XCertificateContainer extends StObject {
  
  /**
    * Store the certificate in memory.
    * @param url
    * @param cert
    * @param trust
    * @returns boolean
    */
  def addCertificate(url: String, cert: String, trust: Boolean): Boolean
  
  /**
    * Check if a certificate was stored earlier before.
    * @param url
    * @param cert
    * @returns CertificateContainerStatus
    */
  def hasCertificate(url: String, cert: String): CertificateContainerStatus
}
object XCertificateContainer {
  
  inline def apply(
    addCertificate: (String, String, Boolean) => Boolean,
    hasCertificate: (String, String) => CertificateContainerStatus
  ): XCertificateContainer = {
    val __obj = js.Dynamic.literal(addCertificate = js.Any.fromFunction3(addCertificate), hasCertificate = js.Any.fromFunction2(hasCertificate))
    __obj.asInstanceOf[XCertificateContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCertificateContainer] (val x: Self) extends AnyVal {
    
    inline def setAddCertificate(value: (String, String, Boolean) => Boolean): Self = StObject.set(x, "addCertificate", js.Any.fromFunction3(value))
    
    inline def setHasCertificate(value: (String, String) => CertificateContainerStatus): Self = StObject.set(x, "hasCertificate", js.Any.fromFunction2(value))
  }
}
