package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.XCell
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides advanced methods to control the position of a cursor in a spreadsheet.
  * @see com.sun.star.sheet.SheetCellCursor
  */
@js.native
trait XSheetCellCursor extends XSheetCellRange {
  /**
    * collapses the cursor into the range of the array formula to which it is currently pointing.
    *
    * To get the correct result, the top left cell of the original cursor must point to any cell containing an array formula. If not, the cursor is left
    * unchanged.
    */
  def collapseToCurrentArray(): Unit = js.native
  /**
    * expands the cursor into the region containing the cells to which it currently points.
    *
    * A region is a cell range bounded by empty cells.
    */
  def collapseToCurrentRegion(): Unit = js.native
  /**
    * expands the cursor to merged cell ranges.
    *
    * Expands the current cursor range in a way so that all merged cell ranges intersecting the current range will fit completely. If the cursor does not
    * point to any range with merged cells, it is left unchanged.
    */
  def collapseToMergedArea(): Unit = js.native
  /**
    * changes the size of a cursor range.
    *
    * The top left cell of the cursor keeps unmodified.
    * @param nColumns the number of columns of the new cursor range.
    * @param nRows the number of rows of the new cursor range.
    */
  def collapseToSize(nColumns: Double, nRows: Double): Unit = js.native
  /** expands the cursor to include the entire columns of the cells to which it is currently pointing. */
  def expandToEntireColumns(): Unit = js.native
  /** expands the cursor to include the entire rows of the cells to which it is currently pointing. */
  def expandToEntireRows(): Unit = js.native
}

object XSheetCellCursor {
  @scala.inline
  def apply(
    Spreadsheet: XSpreadsheet,
    acquire: () => Unit,
    collapseToCurrentArray: () => Unit,
    collapseToCurrentRegion: () => Unit,
    collapseToMergedArea: () => Unit,
    collapseToSize: (Double, Double) => Unit,
    expandToEntireColumns: () => Unit,
    expandToEntireRows: () => Unit,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getSpreadsheet: () => XSpreadsheet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetCellCursor = {
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), collapseToCurrentArray = js.Any.fromFunction0(collapseToCurrentArray), collapseToCurrentRegion = js.Any.fromFunction0(collapseToCurrentRegion), collapseToMergedArea = js.Any.fromFunction0(collapseToMergedArea), collapseToSize = js.Any.fromFunction2(collapseToSize), expandToEntireColumns = js.Any.fromFunction0(expandToEntireColumns), expandToEntireRows = js.Any.fromFunction0(expandToEntireRows), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetCellCursor]
  }
  @scala.inline
  implicit class XSheetCellCursorOps[Self <: XSheetCellCursor] (val x: Self) extends AnyVal {
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
    def setCollapseToCurrentArray(value: () => Unit): Self = this.set("collapseToCurrentArray", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapseToCurrentRegion(value: () => Unit): Self = this.set("collapseToCurrentRegion", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapseToMergedArea(value: () => Unit): Self = this.set("collapseToMergedArea", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapseToSize(value: (Double, Double) => Unit): Self = this.set("collapseToSize", js.Any.fromFunction2(value))
    @scala.inline
    def setExpandToEntireColumns(value: () => Unit): Self = this.set("expandToEntireColumns", js.Any.fromFunction0(value))
    @scala.inline
    def setExpandToEntireRows(value: () => Unit): Self = this.set("expandToEntireRows", js.Any.fromFunction0(value))
  }
  
}

