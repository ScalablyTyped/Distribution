package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoArrowheadWidth extends js.Object

@JSGlobal("Office.MsoArrowheadWidth")
@js.native
object MsoArrowheadWidth extends js.Object {
  @js.native
  sealed trait msoArrowheadNarrow
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadWidth
  
  @js.native
  sealed trait msoArrowheadWide
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadWidth
  
  @js.native
  sealed trait msoArrowheadWidthMedium
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadWidth
  
  @js.native
  sealed trait msoArrowheadWidthMixed
    extends activexDashOfficeLib.OfficeNs.MsoArrowheadWidth
  
  /* 1 */ val msoArrowheadNarrow: msoArrowheadNarrow with scala.Double = js.native
  /* 3 */ val msoArrowheadWide: msoArrowheadWide with scala.Double = js.native
  /* 2 */ val msoArrowheadWidthMedium: msoArrowheadWidthMedium with scala.Double = js.native
  /* -2 */ val msoArrowheadWidthMixed: msoArrowheadWidthMixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoArrowheadWidth with scala.Double] = js.native
}

