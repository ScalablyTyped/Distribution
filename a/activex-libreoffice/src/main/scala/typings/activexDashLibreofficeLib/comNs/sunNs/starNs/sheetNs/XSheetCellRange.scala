package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the spreadsheet that contains a cell range.
  * @see com.sun.star.sheet.SheetCellRange
  */
trait XSheetCellRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange {
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

