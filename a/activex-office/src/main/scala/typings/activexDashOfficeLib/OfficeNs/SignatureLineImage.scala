package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureLineImage extends js.Object

@JSGlobal("Office.SignatureLineImage")
@js.native
object SignatureLineImage extends js.Object {
  @js.native
  sealed trait siglnimgSigned
    extends activexDashOfficeLib.OfficeNs.SignatureLineImage
  
  @js.native
  sealed trait siglnimgSignedInvalid
    extends activexDashOfficeLib.OfficeNs.SignatureLineImage
  
  @js.native
  sealed trait siglnimgSignedValid
    extends activexDashOfficeLib.OfficeNs.SignatureLineImage
  
  @js.native
  sealed trait siglnimgSoftwareRequired
    extends activexDashOfficeLib.OfficeNs.SignatureLineImage
  
  @js.native
  sealed trait siglnimgUnsigned
    extends activexDashOfficeLib.OfficeNs.SignatureLineImage
  
  /* 4 */ val siglnimgSigned: siglnimgSigned with scala.Double = js.native
  /* 3 */ val siglnimgSignedInvalid: siglnimgSignedInvalid with scala.Double = js.native
  /* 2 */ val siglnimgSignedValid: siglnimgSignedValid with scala.Double = js.native
  /* 0 */ val siglnimgSoftwareRequired: siglnimgSoftwareRequired with scala.Double = js.native
  /* 1 */ val siglnimgUnsigned: siglnimgUnsigned with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.SignatureLineImage with scala.Double] = js.native
}

