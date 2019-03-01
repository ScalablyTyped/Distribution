package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the cells or to sub-ranges of all sheets.
  * @see com.sun.star.sheet.Spreadsheets
  */
trait XCellRangesAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns a single cell within the range.
    * @param nColumn is the column index of the cell inside the sheet.
    * @param nRow is the row index of the cell inside the sheet.
    * @param nSheet is the sheet index of the sheet inside the document.
    * @returns the specified cell.
    * @see com.sun.star.table.Cell
    * @throws com::sun::star::lang::IndexOutOfBoundsException if an index is outside the dimensions of this range.
    */
  def getCellByPosition(nColumn: scala.Double, nRow: scala.Double, nSheet: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell
  /**
    * Returns a sub-range of cells within the range.
    * @param nLeft is the column index of the first cell inside the range.
    * @param nTop is the row index of the first cell inside the range.
    * @param nRight is the column index of the last cell inside the range.
    * @param nBottom is the row index of the last cell inside the range.
    * @param nSheet is the sheet index of the sheet inside the document.
    * @returns the specified cell range.
    * @see com.sun.star.table.CellRange
    * @throws com::sun::star::lang::IndexOutOfBoundsException if an index is outside the dimensions of this range.
    */
  def getCellRangeByPosition(
    nLeft: scala.Double,
    nTop: scala.Double,
    nRight: scala.Double,
    nBottom: scala.Double,
    nSheet: scala.Double
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange
  /**
    * Returns a sub-range of cells within the range.
    *
    * The sub-range is specified by its name. The format of the range name is dependent of the context of the table. In spreadsheets valid names may be
    * "Sheet1.A1:C5" or "$Sheet1.$B$2" or even defined names for cell ranges such as "MySpecialCell".
    * @param aRange the name of the sub-range.
    * @returns the specified cell ranges.
    * @see com.sun.star.table.CellRange
    */
  def getCellRangesByName(aRange: java.lang.String): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange]
}

object XCellRangesAccess {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getCellByPosition: js.Function3[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell
    ],
    getCellRangeByPosition: js.Function5[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange
    ],
    getCellRangesByName: js.Function1[
      java.lang.String, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCellRangesAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getCellByPosition")(getCellByPosition)
    __obj.updateDynamic("getCellRangeByPosition")(getCellRangeByPosition)
    __obj.updateDynamic("getCellRangesByName")(getCellRangesByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCellRangesAccess]
  }
}

