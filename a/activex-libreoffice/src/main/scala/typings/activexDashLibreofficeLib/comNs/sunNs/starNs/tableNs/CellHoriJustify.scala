package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellHoriJustify extends js.Object

/** specifies how cell contents are aligned horizontally. */
@JSGlobal("com.sun.star.table.CellHoriJustify")
@js.native
object CellHoriJustify extends js.Object {
  /** contents are justified to the cell width. */
  @js.native
  sealed trait BLOCK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify
  
  /**
    * contents are horizontally centered.
    *
    * contents are aligned to the vertical middle of the cell.
    */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify
  
  /** contents are aligned to the left edge of the cell. */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify
  
  /** contents are repeated to fill the cell. */
  @js.native
  sealed trait REPEAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify
  
  /** contents are aligned to the right edge of the cell. */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify
  
  /**
    * default alignment is used (left for numbers, right for text).
    *
    * contents are printed from left to right.
    *
    * default alignment is used.
    */
  @js.native
  sealed trait STANDARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify
  
  /* 4 */ val BLOCK: BLOCK with scala.Double = js.native
  /* 2 */ val CENTER: CENTER with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 5 */ val REPEAT: REPEAT with scala.Double = js.native
  /* 3 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 0 */ val STANDARD: STANDARD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify with scala.Double
  ] = js.native
}

