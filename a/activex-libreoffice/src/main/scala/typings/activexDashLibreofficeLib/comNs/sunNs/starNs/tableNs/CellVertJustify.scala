package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellVertJustify extends js.Object

/** specifies how cell contents are aligned vertically. */
@JSGlobal("com.sun.star.table.CellVertJustify")
@js.native
object CellVertJustify extends js.Object {
  /** contents are aligned to the lower edge of the cell. */
  @js.native
  sealed trait BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellVertJustify
  
  /**
    * contents are horizontally centered.
    *
    * contents are aligned to the vertical middle of the cell.
    */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellVertJustify
  
  /**
    * default alignment is used (left for numbers, right for text).
    *
    * contents are printed from left to right.
    *
    * default alignment is used.
    */
  @js.native
  sealed trait STANDARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellVertJustify
  
  /** contents are aligned with the upper edge of the cell. */
  @js.native
  sealed trait TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellVertJustify
  
  /* 3 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 2 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val STANDARD: STANDARD with scala.Double = js.native
  /* 1 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellVertJustify with scala.Double
  ] = js.native
}

