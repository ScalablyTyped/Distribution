package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to a control that displays a tabular data.
  * @see UnoControlGrid
  * @since OOo 3.3
  */
trait XGridControl extends js.Object {
  /**
    * returns the column index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  val CurrentColumn: scala.Double
  /**
    * returns the row index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  val CurrentRow: scala.Double
  /**
    * retrieves the column which a given point belongs to
    * @param X the ordinate of the point, in pixel coordinates.
    * @param Y the abscissa of the point, in pixel coordinates.
    * @returns the index of the column which the point lies in, or -1 if no column is under the given point.
    */
  def getColumnAtPoint(X: scala.Double, Y: scala.Double): scala.Double
  /**
    * returns the column index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  def getCurrentColumn(): scala.Double
  /**
    * returns the row index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  def getCurrentRow(): scala.Double
  /**
    * retrieves the row which a given point belongs to
    * @param X the ordinate of the point, in pixel coordinates.
    * @param Y the abscissa of the point, in pixel coordinates.
    * @returns the index of the row which the point lies in, or -1 if no row is under the given point.
    */
  def getRowAtPoint(X: scala.Double, Y: scala.Double): scala.Double
  /**
    * moves the cursor to the given cell
    * @param ColumnIndex the column index of the cell to activate.
    * @param RowIndex the row index of the cell to activate.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if either `ColumnIndex` or `RowIndex` are out of range.
    * @throws com::sun::star::util::VetoException if moving the cursor to another cell is vetoed.
    */
  def goToCell(ColumnIndex: scala.Double, RowIndex: scala.Double): scala.Unit
}

object XGridControl {
  @scala.inline
  def apply(
    CurrentColumn: scala.Double,
    CurrentRow: scala.Double,
    getColumnAtPoint: js.Function2[scala.Double, scala.Double, scala.Double],
    getCurrentColumn: js.Function0[scala.Double],
    getCurrentRow: js.Function0[scala.Double],
    getRowAtPoint: js.Function2[scala.Double, scala.Double, scala.Double],
    goToCell: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): XGridControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentColumn")(CurrentColumn)
    __obj.updateDynamic("CurrentRow")(CurrentRow)
    __obj.updateDynamic("getColumnAtPoint")(getColumnAtPoint)
    __obj.updateDynamic("getCurrentColumn")(getCurrentColumn)
    __obj.updateDynamic("getCurrentRow")(getCurrentRow)
    __obj.updateDynamic("getRowAtPoint")(getRowAtPoint)
    __obj.updateDynamic("goToCell")(goToCell)
    __obj.asInstanceOf[XGridControl]
  }
}

