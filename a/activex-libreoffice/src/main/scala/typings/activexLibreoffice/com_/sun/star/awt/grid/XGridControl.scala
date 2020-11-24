package typings.activexLibreoffice.com_.sun.star.awt.grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface to a control that displays a tabular data.
  * @see UnoControlGrid
  * @since OOo 3.3
  */
@js.native
trait XGridControl extends js.Object {
  
  /**
    * returns the column index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  val CurrentColumn: Double = js.native
  
  /**
    * returns the row index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  val CurrentRow: Double = js.native
  
  /**
    * retrieves the column which a given point belongs to
    * @param X the ordinate of the point, in pixel coordinates.
    * @param Y the abscissa of the point, in pixel coordinates.
    * @returns the index of the column which the point lies in, or -1 if no column is under the given point.
    */
  def getColumnAtPoint(X: Double, Y: Double): Double = js.native
  
  /**
    * returns the column index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  def getCurrentColumn(): Double = js.native
  
  /**
    * returns the row index of the currently active cell
    *
    * If the grid control's does not contain any cells (which happens if the grid column model does not contain any columns, or if grid data model does not
    * contain any rows), then `-1` is returned.
    */
  def getCurrentRow(): Double = js.native
  
  /**
    * retrieves the row which a given point belongs to
    * @param X the ordinate of the point, in pixel coordinates.
    * @param Y the abscissa of the point, in pixel coordinates.
    * @returns the index of the row which the point lies in, or -1 if no row is under the given point.
    */
  def getRowAtPoint(X: Double, Y: Double): Double = js.native
  
  /**
    * moves the cursor to the given cell
    * @param ColumnIndex the column index of the cell to activate.
    * @param RowIndex the row index of the cell to activate.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if either `ColumnIndex` or `RowIndex` are out of range.
    * @throws com::sun::star::util::VetoException if moving the cursor to another cell is vetoed.
    */
  def goToCell(ColumnIndex: Double, RowIndex: Double): Unit = js.native
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
    val __obj = js.Dynamic.literal(CurrentColumn = CurrentColumn.asInstanceOf[js.Any], CurrentRow = CurrentRow.asInstanceOf[js.Any], getColumnAtPoint = js.Any.fromFunction2(getColumnAtPoint), getCurrentColumn = js.Any.fromFunction0(getCurrentColumn), getCurrentRow = js.Any.fromFunction0(getCurrentRow), getRowAtPoint = js.Any.fromFunction2(getRowAtPoint), goToCell = js.Any.fromFunction2(goToCell))
    __obj.asInstanceOf[XGridControl]
  }
  
  @scala.inline
  implicit class XGridControlOps[Self <: XGridControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentColumn(value: Double): Self = this.set("CurrentColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRow(value: Double): Self = this.set("CurrentRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetColumnAtPoint(value: (Double, Double) => Double): Self = this.set("getColumnAtPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCurrentColumn(value: () => Double): Self = this.set("getCurrentColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentRow(value: () => Double): Self = this.set("getCurrentRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRowAtPoint(value: (Double, Double) => Double): Self = this.set("getRowAtPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGoToCell(value: (Double, Double) => Unit): Self = this.set("goToCell", js.Any.fromFunction2(value))
  }
}
