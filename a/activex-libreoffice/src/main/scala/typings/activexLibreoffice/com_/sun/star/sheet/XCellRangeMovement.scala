package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods for moving ranges of cells in a sheet. */
trait XCellRangeMovement
  extends StObject
     with XInterface {
  
  /**
    * copies a cell range to another position in the document.
    *
    * The source cell range keeps unchanged.
    * @param aDestination the address of the top left cell of the destination range.
    * @param aSource the cell range which will be copied.
    */
  def copyRange(aDestination: CellAddress, aSource: CellRangeAddress): Unit
  
  /**
    * inserts cells, moving other cells down or right.
    *
    * Non-empty cells cannot be moved off the sheet.
    * @param aRange the cell range in which empty cells will be inserted.
    * @param nMode describes how to move existing cells.
    */
  def insertCells(aRange: CellRangeAddress, nMode: CellInsertMode): Unit
  
  /**
    * moves a cell range to another position in the document.
    *
    * After copying the contents of the cell range, all cells will be cleared.
    * @param aDestination the address of the top left cell of the destination range.
    * @param aSource the cell range which will be copied.
    */
  def moveRange(aDestination: CellAddress, aSource: CellRangeAddress): Unit
  
  /**
    * deletes cells, moving other cells up or left.
    * @param aRange the cell range to remove.
    * @param nMode describes how to move following cells.
    */
  def removeRange(aRange: CellRangeAddress, nMode: CellDeleteMode): Unit
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
  implicit class XCellRangeMovementMutableBuilder[Self <: XCellRangeMovement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyRange(value: (CellAddress, CellRangeAddress) => Unit): Self = StObject.set(x, "copyRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertCells(value: (CellRangeAddress, CellInsertMode) => Unit): Self = StObject.set(x, "insertCells", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveRange(value: (CellAddress, CellRangeAddress) => Unit): Self = StObject.set(x, "moveRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveRange(value: (CellRangeAddress, CellDeleteMode) => Unit): Self = StObject.set(x, "removeRange", js.Any.fromFunction2(value))
  }
}
