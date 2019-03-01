package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides advanced methods to control the position of a cursor in a spreadsheet.
  * @see com.sun.star.sheet.SheetCellCursor
  */
trait XSheetCellCursor extends XSheetCellRange {
  /**
    * collapses the cursor into the range of the array formula to which it is currently pointing.
    *
    * To get the correct result, the top left cell of the original cursor must point to any cell containing an array formula. If not, the cursor is left
    * unchanged.
    */
  def collapseToCurrentArray(): scala.Unit
  /**
    * expands the cursor into the region containing the cells to which it currently points.
    *
    * A region is a cell range bounded by empty cells.
    */
  def collapseToCurrentRegion(): scala.Unit
  /**
    * expands the cursor to merged cell ranges.
    *
    * Expands the current cursor range in a way so that all merged cell ranges intersecting the current range will fit completely. If the cursor does not
    * point to any range with merged cells, it is left unchanged.
    */
  def collapseToMergedArea(): scala.Unit
  /**
    * changes the size of a cursor range.
    *
    * The top left cell of the cursor keeps unmodified.
    * @param nColumns the number of columns of the new cursor range.
    * @param nRows the number of rows of the new cursor range.
    */
  def collapseToSize(nColumns: scala.Double, nRows: scala.Double): scala.Unit
  /** expands the cursor to include the entire columns of the cells to which it is currently pointing. */
  def expandToEntireColumns(): scala.Unit
  /** expands the cursor to include the entire rows of the cells to which it is currently pointing. */
  def expandToEntireRows(): scala.Unit
}

object XSheetCellCursor {
  @scala.inline
  def apply(
    Spreadsheet: XSpreadsheet,
    acquire: js.Function0[scala.Unit],
    collapseToCurrentArray: js.Function0[scala.Unit],
    collapseToCurrentRegion: js.Function0[scala.Unit],
    collapseToMergedArea: js.Function0[scala.Unit],
    collapseToSize: js.Function2[scala.Double, scala.Double, scala.Unit],
    expandToEntireColumns: js.Function0[scala.Unit],
    expandToEntireRows: js.Function0[scala.Unit],
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
  ): XSheetCellCursor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Spreadsheet")(Spreadsheet)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("collapseToCurrentArray")(collapseToCurrentArray)
    __obj.updateDynamic("collapseToCurrentRegion")(collapseToCurrentRegion)
    __obj.updateDynamic("collapseToMergedArea")(collapseToMergedArea)
    __obj.updateDynamic("collapseToSize")(collapseToSize)
    __obj.updateDynamic("expandToEntireColumns")(expandToEntireColumns)
    __obj.updateDynamic("expandToEntireRows")(expandToEntireRows)
    __obj.updateDynamic("getCellByPosition")(getCellByPosition)
    __obj.updateDynamic("getCellRangeByName")(getCellRangeByName)
    __obj.updateDynamic("getCellRangeByPosition")(getCellRangeByPosition)
    __obj.updateDynamic("getSpreadsheet")(getSpreadsheet)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSheetCellCursor]
  }
}

