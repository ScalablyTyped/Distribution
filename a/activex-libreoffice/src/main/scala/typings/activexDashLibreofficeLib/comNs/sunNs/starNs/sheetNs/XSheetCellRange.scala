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

object XSheetCellRange {
  @scala.inline
  def apply(
    Spreadsheet: XSpreadsheet,
    acquire: js.Function0[scala.Unit],
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
  ): XSheetCellRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Spreadsheet")(Spreadsheet)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getCellByPosition")(getCellByPosition)
    __obj.updateDynamic("getCellRangeByName")(getCellRangeByName)
    __obj.updateDynamic("getCellRangeByPosition")(getCellRangeByPosition)
    __obj.updateDynamic("getSpreadsheet")(getSpreadsheet)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSheetCellRange]
  }
}

