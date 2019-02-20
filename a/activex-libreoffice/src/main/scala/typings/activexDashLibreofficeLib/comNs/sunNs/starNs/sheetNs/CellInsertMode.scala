package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellInsertMode extends js.Object

/** is used to specify how cells are moved when new cells are inserted. */
@JSGlobal("com.sun.star.sheet.CellInsertMode")
@js.native
object CellInsertMode extends js.Object {
  /**
    * entire columns to the right of the deleted cells are moved left.
    *
    * entire columns to the right of the inserted cells are moved right.
    */
  @js.native
  sealed trait COLUMNS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellInsertMode
  
  /** the cells below the inserted cells are moved down. */
  @js.native
  sealed trait DOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellInsertMode
  
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellInsertMode
  
  /**
    * selects the right border.
    *
    * the cells to the right of the inserted cells are moved right.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellInsertMode
  
  /**
    * entire rows below the deleted cells are moved up.
    *
    * entire rows below the inserted cells are moved down.
    */
  @js.native
  sealed trait ROWS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellInsertMode
  
  /* 4 */ val COLUMNS: COLUMNS with scala.Double = js.native
  /* 1 */ val DOWN: DOWN with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 3 */ val ROWS: ROWS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellInsertMode with scala.Double
  ] = js.native
}

