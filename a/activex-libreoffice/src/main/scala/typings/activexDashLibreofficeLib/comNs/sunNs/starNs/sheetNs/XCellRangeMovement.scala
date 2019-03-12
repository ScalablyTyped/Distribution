package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods for moving ranges of cells in a sheet. */
trait XCellRangeMovement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * copies a cell range to another position in the document.
    *
    * The source cell range keeps unchanged.
    * @param aDestination the address of the top left cell of the destination range.
    * @param aSource the cell range which will be copied.
    */
  def copyRange(
    aDestination: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    aSource: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  ): scala.Unit
  /**
    * inserts cells, moving other cells down or right.
    *
    * Non-empty cells cannot be moved off the sheet.
    * @param aRange the cell range in which empty cells will be inserted.
    * @param nMode describes how to move existing cells.
    */
  def insertCells(
    aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    nMode: CellInsertMode
  ): scala.Unit
  /**
    * moves a cell range to another position in the document.
    *
    * After copying the contents of the cell range, all cells will be cleared.
    * @param aDestination the address of the top left cell of the destination range.
    * @param aSource the cell range which will be copied.
    */
  def moveRange(
    aDestination: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    aSource: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  ): scala.Unit
  /**
    * deletes cells, moving other cells up or left.
    * @param aRange the cell range to remove.
    * @param nMode describes how to move following cells.
    */
  def removeRange(
    aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    nMode: CellDeleteMode
  ): scala.Unit
}

object XCellRangeMovement {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    copyRange: (activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress) => scala.Unit,
    insertCells: (activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, CellInsertMode) => scala.Unit,
    moveRange: (activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeRange: (activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, CellDeleteMode) => scala.Unit
  ): XCellRangeMovement = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copyRange = js.Any.fromFunction2(copyRange), insertCells = js.Any.fromFunction2(insertCells), moveRange = js.Any.fromFunction2(moveRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRange = js.Any.fromFunction2(removeRange))
  
    __obj.asInstanceOf[XCellRangeMovement]
  }
}

