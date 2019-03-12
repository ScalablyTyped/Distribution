package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods to create a cell range cursor. */
trait XSpreadsheet extends XSheetCellRange {
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
  @scala.inline
  def apply(
    Spreadsheet: XSpreadsheet,
    acquire: () => scala.Unit,
    createCursor: () => XSheetCellCursor,
    createCursorByRange: XSheetCellRange => XSheetCellCursor,
    getCellByPosition: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell,
    getCellRangeByName: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getCellRangeByPosition: (scala.Double, scala.Double, scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getSpreadsheet: () => XSpreadsheet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSpreadsheet = {
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet, acquire = js.Any.fromFunction0(acquire), createCursor = js.Any.fromFunction0(createCursor), createCursorByRange = js.Any.fromFunction1(createCursorByRange), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSpreadsheet]
  }
}

