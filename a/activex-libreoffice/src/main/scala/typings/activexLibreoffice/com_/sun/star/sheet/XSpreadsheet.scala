package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.XCell
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods to create a cell range cursor. */
trait XSpreadsheet
  extends StObject
     with XSheetCellRange {
  
  /**
    * creates a cell cursor including the whole spreadsheet.
    * @see com.sun.star.sheet.SheetCellCursor
    */
  def createCursor(): XSheetCellCursor
  
  /**
    * creates a cell cursor to travel in the given range context.
    * @param aRange the cell range for the cursor.
    * @see com.sun.star.sheet.SheetCellCursor
    */
  def createCursorByRange(aRange: XSheetCellRange): XSheetCellCursor
}
object XSpreadsheet {
  
  inline def apply(
    Spreadsheet: XSpreadsheet,
    acquire: () => Unit,
    createCursor: () => XSheetCellCursor,
    createCursorByRange: XSheetCellRange => XSheetCellCursor,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getSpreadsheet: () => XSpreadsheet,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSpreadsheet = {
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createCursor = js.Any.fromFunction0(createCursor), createCursorByRange = js.Any.fromFunction1(createCursorByRange), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSpreadsheet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSpreadsheet] (val x: Self) extends AnyVal {
    
    inline def setCreateCursor(value: () => XSheetCellCursor): Self = StObject.set(x, "createCursor", js.Any.fromFunction0(value))
    
    inline def setCreateCursorByRange(value: XSheetCellRange => XSheetCellCursor): Self = StObject.set(x, "createCursorByRange", js.Any.fromFunction1(value))
  }
}
