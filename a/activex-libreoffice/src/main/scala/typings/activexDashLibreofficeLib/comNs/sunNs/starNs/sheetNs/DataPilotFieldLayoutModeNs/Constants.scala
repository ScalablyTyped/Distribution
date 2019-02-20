package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldLayoutModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.DataPilotFieldLayoutMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait OUTLINE_SUBTOTALS_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldLayoutModeNs.Constants
  
  @js.native
  sealed trait OUTLINE_SUBTOTALS_TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldLayoutModeNs.Constants
  
  @js.native
  sealed trait TABULAR_LAYOUT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldLayoutModeNs.Constants
  
  /* 2 */ val OUTLINE_SUBTOTALS_BOTTOM: OUTLINE_SUBTOTALS_BOTTOM with scala.Double = js.native
  /* 1 */ val OUTLINE_SUBTOTALS_TOP: OUTLINE_SUBTOTALS_TOP with scala.Double = js.native
  /* 0 */ val TABULAR_LAYOUT: TABULAR_LAYOUT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataPilotFieldLayoutModeNs.Constants with scala.Double
  ] = js.native
}

