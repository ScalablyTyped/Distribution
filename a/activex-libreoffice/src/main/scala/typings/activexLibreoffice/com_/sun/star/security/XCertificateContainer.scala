package typings.activexLibreoffice.com_.sun.star.security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manage user certificate for temporary connections.
  * @see CertificateContainer
  * @since OOo 2.3.1
  */
@js.native
trait XCertificateContainer extends js.Object {
  /**
    * Store the certificate in memory.
    * @param url
    * @param cert
    * @param trust
    * @returns boolean
    */
  def addCertificate(url: String, cert: String, trust: Boolean): Boolean = js.native
  /**
    * Check if a certificate was stored earlier before.
    * @param url
    * @param cert
    * @returns CertificateContainerStatus
    */
  def hasCertificate(url: String, cert: String): CertificateContainerStatus = js.native
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
  @scala.inline
  implicit class XCertificateContainerOps[Self <: XCertificateContainer] (val x: Self) extends AnyVal {
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
    def setAddCertificate(value: (String, String, Boolean) => Boolean): Self = this.set("addCertificate", js.Any.fromFunction3(value))
    @scala.inline
    def setHasCertificate(value: (String, String) => CertificateContainerStatus): Self = this.set("hasCertificate", js.Any.fromFunction2(value))
  }
  
}

