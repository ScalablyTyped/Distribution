package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.XCell
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the spreadsheet that contains a cell range.
  * @see com.sun.star.sheet.SheetCellRange
  */
@js.native
trait XSheetCellRange extends XCellRange {
  /**
    * returns the spreadsheet interface which contains the cell range.
    * @returns a {@link Spreadsheet} object.
    * @see com.sun.star.sheet.SheetCellRange
    * @see com.sun.star.sheet.SheetCellRanges
    */
  val Spreadsheet: XSpreadsheet = js.native
  /**
    * returns the spreadsheet interface which contains the cell range.
    * @returns a {@link Spreadsheet} object.
    * @see com.sun.star.sheet.SheetCellRange
    * @see com.sun.star.sheet.SheetCellRanges
    */
  def getSpreadsheet(): XSpreadsheet = js.native
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
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetCellRange]
  }
  @scala.inline
  implicit class XSheetCellRangeOps[Self <: XSheetCellRange] (val x: Self) extends AnyVal {
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
    def setSpreadsheet(value: XSpreadsheet): Self = this.set("Spreadsheet", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSpreadsheet(value: () => XSpreadsheet): Self = this.set("getSpreadsheet", js.Any.fromFunction0(value))
  }
  
}

