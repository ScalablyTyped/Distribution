package typings.activexLibreoffice.com_.sun.star

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object security {
  
  /**
    * This meta service supports the {@link XAccessController} interface for checking security permissions.
    *
    *  Also, it obviously has also to be ensured that the object is process-local to assure that permission checks are not corrupted via insecure
    * inter-process communication.
    * @since OOo 1.1.2
    */
  type AccessController = typings.activexLibreoffice.com_.sun.star.security.XAccessController
  
  /**
    * the service to be used for {@link XCertificateContainer} .
    * @since OOo 2.3.1
    */
  type CertificateContainer = typings.activexLibreoffice.com_.sun.star.security.XCertificateContainer
  
  type CertificateException = typings.activexLibreoffice.com_.sun.star.uno.SecurityException
  
  type CryptographyException = typings.activexLibreoffice.com_.sun.star.uno.SecurityException
  
  type EncryptionException = typings.activexLibreoffice.com_.sun.star.security.CryptographyException
  
  type KeyException = typings.activexLibreoffice.com_.sun.star.uno.SecurityException
  
  type NoPasswordException = typings.activexLibreoffice.com_.sun.star.uno.SecurityException
  
  /**
    * Service for getting sets of permissions reading from some persistent storage.
    * @since OOo 1.1.2
    */
  type Policy = typings.activexLibreoffice.com_.sun.star.security.XPolicy
  
  type SecurityInfrastructureException = typings.activexLibreoffice.com_.sun.star.uno.SecurityException
  
  /**
    * provides conversion services for Serial Numbers.
    *
    * An implementation of this service enables the conversion of certificate serial number to and from a string
    * @since OOo 3.1
    */
  type SerialNumberAdapter = typings.activexLibreoffice.com_.sun.star.security.XSerialNumberAdapter
  
  type SignatureException = typings.activexLibreoffice.com_.sun.star.security.CryptographyException
}
