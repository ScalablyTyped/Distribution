package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a method to apply a Multiple Operations Table to the cell range. */
trait XMultipleOperation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a table of formulas (a "Multiple Operations Table").
    *
    * The specified formulas are repeated, with references to the specified cells replaced by references to values in the first column and/or row of the
    * range.
    * @param aFormulaRange the range that contains formula cells (modes TableOperationMode::ROW or TableOperationMode::COLUMN) or a single formula cell (mode
    * @param nMode specifies the calculation mode to fill the cells.
    * @param aColumnCell contains the address of the cell that is referenced by formulas in a row (mode TableOperationMode::ROW) or by the formula cell used f
    * @param aRowCell contains the address of the cell that is referenced by formulas in a column (mode TableOperationMode::COLUMN) or by the formula cell use
    */
  def setTableOperation(
    aFormulaRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    nMode: TableOperationMode,
    aColumnCell: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    aRowCell: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  ): scala.Unit
}

object XMultipleOperation {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTableOperation: (activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, TableOperationMode, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress) => scala.Unit
  ): XMultipleOperation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTableOperation = js.Any.fromFunction4(setTableOperation))
  
    __obj.asInstanceOf[XMultipleOperation]
  }
}

