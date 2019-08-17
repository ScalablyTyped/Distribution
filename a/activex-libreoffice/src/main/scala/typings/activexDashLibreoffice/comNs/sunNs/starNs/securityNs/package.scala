package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object securityNs {
  import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.SecurityException

  /**
    * This meta service supports the {@link XAccessController} interface for checking security permissions.
    *
    *  Also, it obviously has also to be ensured that the object is process-local to assure that permission checks are not corrupted via insecure
    * inter-process communication.
    * @since OOo 1.1.2
    */
  type AccessController = XAccessController
  /**
    * the service to be used for {@link XCertificateContainer} .
    * @since OOo 2.3.1
    */
  type CertificateContainer = XCertificateContainer
  type CertificateException = SecurityException
  type CryptographyException = SecurityException
  type EncryptionException = CryptographyException
  type KeyException = SecurityException
  type NoPasswordException = SecurityException
  /**
    * Service for getting sets of permissions reading from some persistent storage.
    * @since OOo 1.1.2
    */
  type Policy = XPolicy
  type SecurityInfrastructureException = SecurityException
  /**
    * provides conversion services for Serial Numbers.
    *
    * An implementation of this service enables the conversion of certificate serial number to and from a string
    * @since OOo 3.1
    */
  type SerialNumberAdapter = XSerialNumberAdapter
  type SignatureException = CryptographyException
}
