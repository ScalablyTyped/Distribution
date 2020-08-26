package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.XCell
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods to create a cell range cursor. */
@js.native
trait XSpreadsheet extends XSheetCellRange {
  /**
    * creates a cell cursor including the whole spreadsheet.
    * @see com.sun.star.sheet.SheetCellCursor
    */
  def createCursor(): XSheetCellCursor = js.native
  /**
    * creates a cell cursor to travel in the given range context.
    * @param aRange the cell range for the cursor.
    * @see com.sun.star.sheet.SheetCellCursor
    */
  def createCursorByRange(aRange: XSheetCellRange): XSheetCellCursor = js.native
}

object XSpreadsheet {
  @scala.inline
  def apply(
    Spreadsheet: XSpreadsheet,
    acquire: () => Unit,
    createCursor: () => XSheetCellCursor,
    createCursorByRange: XSheetCellRange => XSheetCellCursor,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getSpreadsheet: () => XSpreadsheet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSpreadsheet = {
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createCursor = js.Any.fromFunction0(createCursor), createCursorByRange = js.Any.fromFunction1(createCursorByRange), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSpreadsheet]
  }
  @scala.inline
  implicit class XSpreadsheetOps[Self <: XSpreadsheet] (val x: Self) extends AnyVal {
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
    def setCreateCursor(value: () => XSheetCellCursor): Self = this.set("createCursor", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateCursorByRange(value: XSheetCellRange => XSheetCellCursor): Self = this.set("createCursorByRange", js.Any.fromFunction1(value))
  }
  
}

