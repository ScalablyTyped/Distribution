package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the cells or to sub-ranges of a cell range.
  * @see com.sun.star.table.CellRange
  */
trait XCellRange
  extends StObject
     with XInterface {
  
  /**
    * Returns a single cell within the range.
    * @param nColumn is the column index of the cell inside the range.
    * @param nRow is the row index of the cell inside the range.
    * @returns the specified cell.
    * @see com.sun.star.table.Cell
    * @throws com::sun::star::lang::IndexOutOfBoundsException if an index is outside the dimensions of this range.
    */
  def getCellByPosition(nColumn: Double, nRow: Double): XCell
  
  /**
    * Returns a sub-range of cells within the range.
    *
    * The sub-range is specified by its name. The format of the range name is dependent of the context of the table. In spreadsheets valid names may be
    * "A1:C5" or "$B$2" or even defined names for cell ranges such as "MySpecialCell".
    * @param aRange the name of the sub-range.
    * @returns the specified cell range.
    * @see com.sun.star.table.CellRange
    */
  def getCellRangeByName(aRange: String): XCellRange
  
  /**
    * Returns a sub-range of cells within the range.
    * @param nLeft is the column index of the first cell inside the range.
    * @param nTop is the row index of the first cell inside the range.
    * @param nRight is the column index of the last cell inside the range.
    * @param nBottom is the row index of the last cell inside the range.
    * @returns the specified cell range.
    * @see com.sun.star.table.CellRange
    * @throws com::sun::star::lang::IndexOutOfBoundsException if an index is outside the dimensions of this range.
    */
  def getCellRangeByPosition(nLeft: Double, nTop: Double, nRight: Double, nBottom: Double): XCellRange
}
object XCellRange {
  
  inline def apply(
    acquire: () => Unit,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellRange = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellRange]
  }
  
  extension [Self <: XCellRange](x: Self) {
    
    inline def setGetCellByPosition(value: (Double, Double) => XCell): Self = StObject.set(x, "getCellByPosition", js.Any.fromFunction2(value))
    
    inline def setGetCellRangeByName(value: String => XCellRange): Self = StObject.set(x, "getCellRangeByName", js.Any.fromFunction1(value))
    
    inline def setGetCellRangeByPosition(value: (Double, Double, Double, Double) => XCellRange): Self = StObject.set(x, "getCellRangeByPosition", js.Any.fromFunction4(value))
  }
}
