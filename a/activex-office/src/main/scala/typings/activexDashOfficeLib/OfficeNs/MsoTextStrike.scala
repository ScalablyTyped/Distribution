package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoTextStrike extends js.Object

@JSGlobal("Office.MsoTextStrike")
@js.native
object MsoTextStrike extends js.Object {
  @js.native
  sealed trait msoDoubleStrike
    extends activexDashOfficeLib.OfficeNs.MsoTextStrike
  
  @js.native
  sealed trait msoNoStrike
    extends activexDashOfficeLib.OfficeNs.MsoTextStrike
  
  @js.native
  sealed trait msoSingleStrike
    extends activexDashOfficeLib.OfficeNs.MsoTextStrike
  
  @js.native
  sealed trait msoStrikeMixed
    extends activexDashOfficeLib.OfficeNs.MsoTextStrike
  
  /* 2 */ val msoDoubleStrike: msoDoubleStrike with scala.Double = js.native
  /* 0 */ val msoNoStrike: msoNoStrike with scala.Double = js.native
  /* 1 */ val msoSingleStrike: msoSingleStrike with scala.Double = js.native
  /* -2 */ val msoStrikeMixed: msoStrikeMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoTextStrike with scala.Double] = js.native
}

