package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentVerificationResults extends js.Object

@JSGlobal("Office.ContentVerificationResults")
@js.native
object ContentVerificationResults extends js.Object {
  @js.native
  sealed trait contverresError
    extends activexDashOfficeLib.OfficeNs.ContentVerificationResults
  
  @js.native
  sealed trait contverresModified
    extends activexDashOfficeLib.OfficeNs.ContentVerificationResults
  
  @js.native
  sealed trait contverresUnverified
    extends activexDashOfficeLib.OfficeNs.ContentVerificationResults
  
  @js.native
  sealed trait contverresValid
    extends activexDashOfficeLib.OfficeNs.ContentVerificationResults
  
  @js.native
  sealed trait contverresVerifying
    extends activexDashOfficeLib.OfficeNs.ContentVerificationResults
  
  /* 0 */ val contverresError: contverresError with scala.Double = js.native
  /* 4 */ val contverresModified: contverresModified with scala.Double = js.native
  /* 2 */ val contverresUnverified: contverresUnverified with scala.Double = js.native
  /* 3 */ val contverresValid: contverresValid with scala.Double = js.native
  /* 1 */ val contverresVerifying: contverresVerifying with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.ContentVerificationResults with scala.Double] = js.native
}

