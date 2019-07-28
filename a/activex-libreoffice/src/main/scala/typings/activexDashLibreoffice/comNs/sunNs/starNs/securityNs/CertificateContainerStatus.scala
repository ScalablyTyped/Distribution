package typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constant definition of a certificate container status. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait CertificateContainerStatus extends js.Object

object CertificateContainerStatus {
  /** The certificate was not found. */
  @scala.inline
  def NOCERT: `0` = this.cast(0)
  /** The certificate was found and is trusted. */
  @scala.inline
  def TRUSTED: `1` = this.cast(1)
  /** The certificate was found but is untrusted. */
  @scala.inline
  def UNTRUSTED: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

