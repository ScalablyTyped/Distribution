package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

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
  def addCertificate(url: java.lang.String, cert: java.lang.String, trust: scala.Boolean): scala.Boolean
  /**
    * Check if a certificate was stored earlier before.
    * @param url
    * @param cert
    * @returns CertificateContainerStatus
    */
  def hasCertificate(url: java.lang.String, cert: java.lang.String): CertificateContainerStatus
}

object XCertificateContainer {
  @scala.inline
  def apply(
    addCertificate: js.Function3[java.lang.String, java.lang.String, scala.Boolean, scala.Boolean],
    hasCertificate: js.Function2[java.lang.String, java.lang.String, CertificateContainerStatus]
  ): XCertificateContainer = {
    val __obj = js.Dynamic.literal(addCertificate = addCertificate, hasCertificate = hasCertificate)
  
    __obj.asInstanceOf[XCertificateContainer]
  }
}

