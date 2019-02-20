package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CertificateContainerStatus extends js.Object

/** Constant definition of a certificate container status. */
@JSGlobal("com.sun.star.security.CertificateContainerStatus")
@js.native
object CertificateContainerStatus extends js.Object {
  /** The certificate was not found. */
  @js.native
  sealed trait NOCERT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateContainerStatus
  
  /** The certificate was found and is trusted. */
  @js.native
  sealed trait TRUSTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateContainerStatus
  
  /** The certificate was found but is untrusted. */
  @js.native
  sealed trait UNTRUSTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateContainerStatus
  
  /* 0 */ val NOCERT: NOCERT with scala.Double = js.native
  /* 1 */ val TRUSTED: TRUSTED with scala.Double = js.native
  /* 2 */ val UNTRUSTED: UNTRUSTED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.CertificateContainerStatus with scala.Double
  ] = js.native
}

