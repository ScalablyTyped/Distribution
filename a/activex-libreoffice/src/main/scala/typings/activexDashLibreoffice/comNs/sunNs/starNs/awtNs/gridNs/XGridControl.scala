package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.gridNs

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
  val CurrentColumn: Double
  /**
    * returns the row index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  val CurrentRow: Double
  /**
    * retrieves the column which a given point belongs to
    * @param X the ordinate of the point, in pixel coordinates.
    * @param Y the abscissa of the point, in pixel coordinates.
    * @returns the index of the column which the point lies in, or -1 if no column is under the given point.
    */
  def getColumnAtPoint(X: Double, Y: Double): Double
  /**
    * returns the column index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  def getCurrentColumn(): Double
  /**
    * returns the row index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  def getCurrentRow(): Double
  /**
    * retrieves the row which a given point belongs to
    * @param X the ordinate of the point, in pixel coordinates.
    * @param Y the abscissa of the point, in pixel coordinates.
    * @returns the index of the row which the point lies in, or -1 if no row is under the given point.
    */
  def getRowAtPoint(X: Double, Y: Double): Double
  /**
    * moves the cursor to the given cell
    * @param ColumnIndex the column index of the cell to activate.
    * @param RowIndex the row index of the cell to activate.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if either `ColumnIndex` or `RowIndex` are out of range.
    * @throws com::sun::star::util::VetoException if moving the cursor to another cell is vetoed.
    */
  def goToCell(ColumnIndex: Double, RowIndex: Double): Unit
}

object XGridControl {
  @scala.inline
  def apply(
    CurrentColumn: Double,
    CurrentRow: Double,
    getColumnAtPoint: (Double, Double) => Double,
    getCurrentColumn: () => Double,
    getCurrentRow: () => Double,
    getRowAtPoint: (Double, Double) => Double,
    goToCell: (Double, Double) => Unit
  ): XGridControl = {
    val __obj = js.Dynamic.literal(CurrentColumn = CurrentColumn, CurrentRow = CurrentRow, getColumnAtPoint = js.Any.fromFunction2(getColumnAtPoint), getCurrentColumn = js.Any.fromFunction0(getCurrentColumn), getCurrentRow = js.Any.fromFunction0(getCurrentRow), getRowAtPoint = js.Any.fromFunction2(getRowAtPoint), goToCell = js.Any.fromFunction2(goToCell))
  
    __obj.asInstanceOf[XGridControl]
  }
}

