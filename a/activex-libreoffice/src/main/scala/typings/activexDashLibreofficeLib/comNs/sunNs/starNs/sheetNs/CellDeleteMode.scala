package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CellDeleteMode extends js.Object

/** is used to specify how remaining cells are moved when cells are deleted. */
@JSGlobal("com.sun.star.sheet.CellDeleteMode")
@js.native
object CellDeleteMode extends js.Object {
  /**
    * entire columns to the right of the deleted cells are moved left.
    *
    * entire columns to the right of the inserted cells are moved right.
    */
  @js.native
  sealed trait COLUMNS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellDeleteMode
  
  /**
    * selects the left border.
    *
    * the cells to the right of the deleted cells are moved left.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellDeleteMode
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellDeleteMode
  
  /**
    * entire rows below the deleted cells are moved up.
    *
    * entire rows below the inserted cells are moved down.
    */
  @js.native
  sealed trait ROWS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellDeleteMode
  
  /** the cells below the deleted cells are moved up. */
  @js.native
  sealed trait UP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellDeleteMode
  
  /* 4 */ val COLUMNS: COLUMNS with scala.Double = js.native
  /* 2 */ val LEFT: LEFT with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 3 */ val ROWS: ROWS with scala.Double = js.native
  /* 1 */ val UP: UP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.CellDeleteMode with scala.Double
  ] = js.native
}

