package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XdCertificateStatus extends js.Object

@JSGlobal("InfoPath.XdCertificateStatus")
@js.native
object XdCertificateStatus extends js.Object {
  @js.native
  sealed trait xdCertificateStatusError
    extends activexDashInfopathLib.InfoPathNs.XdCertificateStatus
  
  @js.native
  sealed trait xdCertificateStatusExpired
    extends activexDashInfopathLib.InfoPathNs.XdCertificateStatus
  
  @js.native
  sealed trait xdCertificateStatusNotTrusted
    extends activexDashInfopathLib.InfoPathNs.XdCertificateStatus
  
  @js.native
  sealed trait xdCertificateStatusRevoked
    extends activexDashInfopathLib.InfoPathNs.XdCertificateStatus
  
  @js.native
  sealed trait xdCertificateStatusValid
    extends activexDashInfopathLib.InfoPathNs.XdCertificateStatus
  
  /* 0 */ val xdCertificateStatusError: xdCertificateStatusError with scala.Double = js.native
  /* 2 */ val xdCertificateStatusExpired: xdCertificateStatusExpired with scala.Double = js.native
  /* 3 */ val xdCertificateStatusNotTrusted: xdCertificateStatusNotTrusted with scala.Double = js.native
  /* 4 */ val xdCertificateStatusRevoked: xdCertificateStatusRevoked with scala.Double = js.native
  /* 1 */ val xdCertificateStatusValid: xdCertificateStatusValid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashInfopathLib.InfoPathNs.XdCertificateStatus with scala.Double] = js.native
}

