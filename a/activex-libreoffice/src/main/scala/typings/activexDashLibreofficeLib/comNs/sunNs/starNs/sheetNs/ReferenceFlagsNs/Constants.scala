package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.ReferenceFlags.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait COLUMN_DELETED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs.Constants
  
  @js.native
  sealed trait COLUMN_RELATIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs.Constants
  
  @js.native
  sealed trait RELATIVE_NAME
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs.Constants
  
  @js.native
  sealed trait ROW_DELETED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs.Constants
  
  @js.native
  sealed trait ROW_RELATIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs.Constants
  
  @js.native
  sealed trait SHEET_3D
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs.Constants
  
  @js.native
  sealed trait SHEET_DELETED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs.Constants
  
  @js.native
  sealed trait SHEET_RELATIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs.Constants
  
  /* 2 */ val COLUMN_DELETED: COLUMN_DELETED with scala.Double = js.native
  /* 1 */ val COLUMN_RELATIVE: COLUMN_RELATIVE with scala.Double = js.native
  /* 128 */ val RELATIVE_NAME: RELATIVE_NAME with scala.Double = js.native
  /* 8 */ val ROW_DELETED: ROW_DELETED with scala.Double = js.native
  /* 4 */ val ROW_RELATIVE: ROW_RELATIVE with scala.Double = js.native
  /* 64 */ val SHEET_3D: SHEET_3D with scala.Double = js.native
  /* 32 */ val SHEET_DELETED: SHEET_DELETED with scala.Double = js.native
  /* 16 */ val SHEET_RELATIVE: SHEET_RELATIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.ReferenceFlagsNs.Constants with scala.Double
  ] = js.native
}

