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
    acquire: js.Function0[scala.Unit],
    createCursor: js.Function0[XSheetCellCursor],
    createCursorByRange: js.Function1[XSheetCellRange, XSheetCellCursor],
    getCellByPosition: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell
    ],
    getCellRangeByName: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange],
    getCellRangeByPosition: js.Function4[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange
    ],
    getSpreadsheet: js.Function0[XSpreadsheet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSpreadsheet = {
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet, acquire = acquire, createCursor = createCursor, createCursorByRange = createCursorByRange, getCellByPosition = getCellByPosition, getCellRangeByName = getCellRangeByName, getCellRangeByPosition = getCellRangeByPosition, getSpreadsheet = getSpreadsheet, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSpreadsheet]
  }
}

