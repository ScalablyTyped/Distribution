package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a method to apply a Multiple Operations Table to the cell range. */
trait XMultipleOperation
  extends StObject
     with XInterface {
  
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
    aFormulaRange: CellRangeAddress,
    nMode: TableOperationMode,
    aColumnCell: CellAddress,
    aRowCell: CellAddress
  ): Unit
}
object XMultipleOperation {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setTableOperation: (CellRangeAddress, TableOperationMode, CellAddress, CellAddress) => Unit
  ): XMultipleOperation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTableOperation = js.Any.fromFunction4(setTableOperation))
    __obj.asInstanceOf[XMultipleOperation]
  }
  
  extension [Self <: XMultipleOperation](x: Self) {
    
    inline def setSetTableOperation(value: (CellRangeAddress, TableOperationMode, CellAddress, CellAddress) => Unit): Self = StObject.set(x, "setTableOperation", js.Any.fromFunction4(value))
  }
}
