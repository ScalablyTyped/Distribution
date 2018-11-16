package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CertificateDetail extends js.Object

@JSGlobal("Office.CertificateDetail")
@js.native
object CertificateDetail extends js.Object {
  @js.native
  sealed trait certdetAvailable
    extends activexDashOfficeLib.OfficeNs.CertificateDetail
  
  @js.native
  sealed trait certdetExpirationDate
    extends activexDashOfficeLib.OfficeNs.CertificateDetail
  
  @js.native
  sealed trait certdetIssuer
    extends activexDashOfficeLib.OfficeNs.CertificateDetail
  
  @js.native
  sealed trait certdetSubject
    extends activexDashOfficeLib.OfficeNs.CertificateDetail
  
  @js.native
  sealed trait certdetThumbprint
    extends activexDashOfficeLib.OfficeNs.CertificateDetail
  
  /* 0 */ val certdetAvailable: certdetAvailable with scala.Double = js.native
  /* 3 */ val certdetExpirationDate: certdetExpirationDate with scala.Double = js.native
  /* 2 */ val certdetIssuer: certdetIssuer with scala.Double = js.native
  /* 1 */ val certdetSubject: certdetSubject with scala.Double = js.native
  /* 4 */ val certdetThumbprint: certdetThumbprint with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.CertificateDetail with scala.Double] = js.native
}

