package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CertificateVerificationResults extends js.Object

@JSGlobal("Office.CertificateVerificationResults")
@js.native
object CertificateVerificationResults extends js.Object {
  @js.native
  sealed trait certverresError
    extends activexDashOfficeLib.OfficeNs.CertificateVerificationResults
  
  @js.native
  sealed trait certverresExpired
    extends activexDashOfficeLib.OfficeNs.CertificateVerificationResults
  
  @js.native
  sealed trait certverresInvalid
    extends activexDashOfficeLib.OfficeNs.CertificateVerificationResults
  
  @js.native
  sealed trait certverresRevoked
    extends activexDashOfficeLib.OfficeNs.CertificateVerificationResults
  
  @js.native
  sealed trait certverresUntrusted
    extends activexDashOfficeLib.OfficeNs.CertificateVerificationResults
  
  @js.native
  sealed trait certverresUnverified
    extends activexDashOfficeLib.OfficeNs.CertificateVerificationResults
  
  @js.native
  sealed trait certverresValid
    extends activexDashOfficeLib.OfficeNs.CertificateVerificationResults
  
  @js.native
  sealed trait certverresVerifying
    extends activexDashOfficeLib.OfficeNs.CertificateVerificationResults
  
  /* 0 */ val certverresError: certverresError with scala.Double = js.native
  /* 5 */ val certverresExpired: certverresExpired with scala.Double = js.native
  /* 4 */ val certverresInvalid: certverresInvalid with scala.Double = js.native
  /* 6 */ val certverresRevoked: certverresRevoked with scala.Double = js.native
  /* 7 */ val certverresUntrusted: certverresUntrusted with scala.Double = js.native
  /* 2 */ val certverresUnverified: certverresUnverified with scala.Double = js.native
  /* 3 */ val certverresValid: certverresValid with scala.Double = js.native
  /* 1 */ val certverresVerifying: certverresVerifying with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.CertificateVerificationResults with scala.Double] = js.native
}

