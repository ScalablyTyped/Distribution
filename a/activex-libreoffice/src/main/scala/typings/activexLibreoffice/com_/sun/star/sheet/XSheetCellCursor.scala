package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.XCell
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides advanced methods to control the position of a cursor in a spreadsheet.
  * @see com.sun.star.sheet.SheetCellCursor
  */
trait XSheetCellCursor
  extends StObject
     with XSheetCellRange {
  
  /**
    * collapses the cursor into the range of the array formula to which it is currently pointing.
    *
    * To get the correct result, the top left cell of the original cursor must point to any cell containing an array formula. If not, the cursor is left
    * unchanged.
    */
  def collapseToCurrentArray(): Unit
  
  /**
    * expands the cursor into the region containing the cells to which it currently points.
    *
    * A region is a cell range bounded by empty cells.
    */
  def collapseToCurrentRegion(): Unit
  
  /**
    * expands the cursor to merged cell ranges.
    *
    * Expands the current cursor range in a way so that all merged cell ranges intersecting the current range will fit completely. If the cursor does not
    * point to any range with merged cells, it is left unchanged.
    */
  def collapseToMergedArea(): Unit
  
  /**
    * changes the size of a cursor range.
    *
    * The top left cell of the cursor keeps unmodified.
    * @param nColumns the number of columns of the new cursor range.
    * @param nRows the number of rows of the new cursor range.
    */
  def collapseToSize(nColumns: Double, nRows: Double): Unit
  
  /** expands the cursor to include the entire columns of the cells to which it is currently pointing. */
  def expandToEntireColumns(): Unit
  
  /** expands the cursor to include the entire rows of the cells to which it is currently pointing. */
  def expandToEntireRows(): Unit
}
object XSheetCellCursor {
  
  inline def apply(
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
  
  extension [Self <: XSheetCellCursor](x: Self) {
    
    inline def setCollapseToCurrentArray(value: () => Unit): Self = StObject.set(x, "collapseToCurrentArray", js.Any.fromFunction0(value))
    
    inline def setCollapseToCurrentRegion(value: () => Unit): Self = StObject.set(x, "collapseToCurrentRegion", js.Any.fromFunction0(value))
    
    inline def setCollapseToMergedArea(value: () => Unit): Self = StObject.set(x, "collapseToMergedArea", js.Any.fromFunction0(value))
    
    inline def setCollapseToSize(value: (Double, Double) => Unit): Self = StObject.set(x, "collapseToSize", js.Any.fromFunction2(value))
    
    inline def setExpandToEntireColumns(value: () => Unit): Self = StObject.set(x, "expandToEntireColumns", js.Any.fromFunction0(value))
    
    inline def setExpandToEntireRows(value: () => Unit): Self = StObject.set(x, "expandToEntireRows", js.Any.fromFunction0(value))
  }
}
