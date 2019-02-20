package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRangeFlagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.NamedRangeFlag.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait COLUMN_HEADER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRangeFlagNs.Constants
  
  @js.native
  sealed trait FILTER_CRITERIA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRangeFlagNs.Constants
  
  @js.native
  sealed trait PRINT_AREA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRangeFlagNs.Constants
  
  @js.native
  sealed trait ROW_HEADER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRangeFlagNs.Constants
  
  /* 4 */ val COLUMN_HEADER: COLUMN_HEADER with scala.Double = js.native
  /* 1 */ val FILTER_CRITERIA: FILTER_CRITERIA with scala.Double = js.native
  /* 2 */ val PRINT_AREA: PRINT_AREA with scala.Double = js.native
  /* 8 */ val ROW_HEADER: ROW_HEADER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.NamedRangeFlagNs.Constants with scala.Double
  ] = js.native
}

