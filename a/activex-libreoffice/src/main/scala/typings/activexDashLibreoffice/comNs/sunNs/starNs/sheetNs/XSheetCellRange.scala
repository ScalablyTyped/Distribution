package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCell
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCellRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the spreadsheet that contains a cell range.
  * @see com.sun.star.sheet.SheetCellRange
  */
trait XSheetCellRange extends XCellRange {
  /**
    * returns the spreadsheet interface which contains the cell range.
    * @returns a {@link Spreadsheet} object.
    * @see com.sun.star.sheet.SheetCellRange
    * @see com.sun.star.sheet.SheetCellRanges
    */
  val Spreadsheet: XSpreadsheet
  /**
    * returns the spreadsheet interface which contains the cell range.
    * @returns a {@link Spreadsheet} object.
    * @see com.sun.star.sheet.SheetCellRange
    * @see com.sun.star.sheet.SheetCellRanges
    */
  def getSpreadsheet(): XSpreadsheet
}

object XSheetCellRange {
  @scala.inline
  def apply(
    Spreadsheet: XSpreadsheet,
    acquire: () => Unit,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getSpreadsheet: () => XSpreadsheet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetCellRange = {
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet, acquire = js.Any.fromFunction0(acquire), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetCellRange]
  }
}

