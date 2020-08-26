package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods for moving ranges of cells in a sheet. */
@js.native
trait XCellRangeMovement extends XInterface {
  /**
    * copies a cell range to another position in the document.
    *
    * The source cell range keeps unchanged.
    * @param aDestination the address of the top left cell of the destination range.
    * @param aSource the cell range which will be copied.
    */
  def copyRange(aDestination: CellAddress, aSource: CellRangeAddress): Unit = js.native
  /**
    * inserts cells, moving other cells down or right.
    *
    * Non-empty cells cannot be moved off the sheet.
    * @param aRange the cell range in which empty cells will be inserted.
    * @param nMode describes how to move existing cells.
    */
  def insertCells(aRange: CellRangeAddress, nMode: CellInsertMode): Unit = js.native
  /**
    * moves a cell range to another position in the document.
    *
    * After copying the contents of the cell range, all cells will be cleared.
    * @param aDestination the address of the top left cell of the destination range.
    * @param aSource the cell range which will be copied.
    */
  def moveRange(aDestination: CellAddress, aSource: CellRangeAddress): Unit = js.native
  /**
    * deletes cells, moving other cells up or left.
    * @param aRange the cell range to remove.
    * @param nMode describes how to move following cells.
    */
  def removeRange(aRange: CellRangeAddress, nMode: CellDeleteMode): Unit = js.native
}

object XCellRangeMovement {
  @scala.inline
  def apply(
    acquire: () => Unit,
    copyRange: (CellAddress, CellRangeAddress) => Unit,
    insertCells: (CellRangeAddress, CellInsertMode) => Unit,
    moveRange: (CellAddress, CellRangeAddress) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRange: (CellRangeAddress, CellDeleteMode) => Unit
  ): XCellRangeMovement = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copyRange = js.Any.fromFunction2(copyRange), insertCells = js.Any.fromFunction2(insertCells), moveRange = js.Any.fromFunction2(moveRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRange = js.Any.fromFunction2(removeRange))
    __obj.asInstanceOf[XCellRangeMovement]
  }
  @scala.inline
  implicit class XCellRangeMovementOps[Self <: XCellRangeMovement] (val x: Self) extends AnyVal {
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
    def setCopyRange(value: (CellAddress, CellRangeAddress) => Unit): Self = this.set("copyRange", js.Any.fromFunction2(value))
    @scala.inline
    def setInsertCells(value: (CellRangeAddress, CellInsertMode) => Unit): Self = this.set("insertCells", js.Any.fromFunction2(value))
    @scala.inline
    def setMoveRange(value: (CellAddress, CellRangeAddress) => Unit): Self = this.set("moveRange", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveRange(value: (CellRangeAddress, CellDeleteMode) => Unit): Self = this.set("removeRange", js.Any.fromFunction2(value))
  }
  
}

