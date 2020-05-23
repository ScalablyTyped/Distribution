package typings.activexLibreoffice.com_.sun.star.security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manage user certificate for temporary connections.
  * @see CertificateContainer
  * @since OOo 2.3.1
  */
trait XCertificateContainer extends js.Object {
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
  @scala.inline
  def apply(
    addCertificate: (String, String, Boolean) => Boolean,
    hasCertificate: (String, String) => CertificateContainerStatus
  ): XCertificateContainer = {
    val __obj = js.Dynamic.literal(addCertificate = js.Any.fromFunction3(addCertificate), hasCertificate = js.Any.fromFunction2(hasCertificate))
    __obj.asInstanceOf[XCertificateContainer]
  }
}

