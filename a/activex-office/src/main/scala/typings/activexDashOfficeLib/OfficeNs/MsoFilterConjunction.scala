package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoFilterConjunction extends js.Object

@JSGlobal("Office.MsoFilterConjunction")
@js.native
object MsoFilterConjunction extends js.Object {
  @js.native
  sealed trait msoFilterConjunctionAnd
    extends activexDashOfficeLib.OfficeNs.MsoFilterConjunction
  
  @js.native
  sealed trait msoFilterConjunctionOr
    extends activexDashOfficeLib.OfficeNs.MsoFilterConjunction
  
  /* 0 */ val msoFilterConjunctionAnd: msoFilterConjunctionAnd with scala.Double = js.native
  /* 1 */ val msoFilterConjunctionOr: msoFilterConjunctionOr with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoFilterConjunction with scala.Double] = js.native
}

