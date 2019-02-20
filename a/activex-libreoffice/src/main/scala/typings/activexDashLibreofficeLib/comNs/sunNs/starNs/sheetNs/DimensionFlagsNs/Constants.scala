package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DimensionFlagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.DimensionFlags.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait NO_COLUMN_ORIENTATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DimensionFlagsNs.Constants
  
  @js.native
  sealed trait NO_DATA_ORIENTATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DimensionFlagsNs.Constants
  
  @js.native
  sealed trait NO_PAGE_ORIENTATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DimensionFlagsNs.Constants
  
  @js.native
  sealed trait NO_ROW_ORIENTATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DimensionFlagsNs.Constants
  
  /* 1 */ val NO_COLUMN_ORIENTATION: NO_COLUMN_ORIENTATION with scala.Double = js.native
  /* 8 */ val NO_DATA_ORIENTATION: NO_DATA_ORIENTATION with scala.Double = js.native
  /* 4 */ val NO_PAGE_ORIENTATION: NO_PAGE_ORIENTATION with scala.Double = js.native
  /* 2 */ val NO_ROW_ORIENTATION: NO_ROW_ORIENTATION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DimensionFlagsNs.Constants with scala.Double
  ] = js.native
}

