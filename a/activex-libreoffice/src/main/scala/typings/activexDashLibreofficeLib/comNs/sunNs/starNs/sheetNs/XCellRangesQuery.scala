package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to query for cell ranges with specific contents.
  *
  * All methods return a collection of cell ranges.
  * @see com.sun.star.sheet.SheetRangesQuery
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XCellRangesQuery
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * queries all cells with different values in a specified row.
    *
    * This method takes each column of the current cell range(s) and compares all cells with the cell in the specified row. All cells which are different to
    * this comparison cell will be returned.
    * @param aCompare contains a cell address with the row index used for comparison. Only this row index is of interest.
    * @returns all cells of the current cell range(s) which are different to the comparison cell of each column.
    */
  def queryColumnDifferences(aCompare: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): XSheetCellRanges
  /**
    * queries all cells with the specified content type(s).
    * @param nContentFlags a combination of {@link CellFlags} flags.  Attention: Despite the {@link CellFlags} flags are `long` values, this method expects a
    * @returns all cells of the current cell range(s) with the specified content type(s).
    */
  def queryContentCells(nContentFlags: scala.Double): XSheetCellRanges
  /**
    * queries all empty cells.
    * @returns the empty cells of the current cell range(s).
    */
  def queryEmptyCells(): XSheetCellRanges
  /**
    * queries all formula cells with the specified result type.
    * @param nResultFlags a combination of {@link FormulaResult} flags.
    * @returns all formula cells of the current cell range(s) with the specified result type(s).
    */
  def queryFormulaCells(nResultFlags: scala.Double): XSheetCellRanges
  /**
    * intersects the current cell range(s) with the specified cell range.
    * @param aRange contains the cell range for intersection.
    * @returns all cells of the current cell range(s) which are contained in the passed cell range.
    */
  def queryIntersection(aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): XSheetCellRanges
  /**
    * queries all cells with different values in a specified column.
    *
    * This method takes each row of the current cell range(s) and compares all cells with the cell in the specified column. All cells which are different to
    * this comparison cell will be returned.
    * @param aCompare contains a cell address with the column index used for comparison. Only this column index is of interest.
    * @returns all cells of the current cell range(s) which are different to the comparison cell of each row.
    */
  def queryRowDifferences(aCompare: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): XSheetCellRanges
  /**
    * queries all visible cells.
    * @returns the visible (not hidden) cells of the current cell range(s).
    */
  def queryVisibleCells(): XSheetCellRanges
}

object XCellRangesQuery {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryColumnDifferences: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, XSheetCellRanges],
    queryContentCells: js.Function1[scala.Double, XSheetCellRanges],
    queryEmptyCells: js.Function0[XSheetCellRanges],
    queryFormulaCells: js.Function1[scala.Double, XSheetCellRanges],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryIntersection: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
      XSheetCellRanges
    ],
    queryRowDifferences: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, XSheetCellRanges],
    queryVisibleCells: js.Function0[XSheetCellRanges],
    release: js.Function0[scala.Unit]
  ): XCellRangesQuery = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryColumnDifferences = queryColumnDifferences, queryContentCells = queryContentCells, queryEmptyCells = queryEmptyCells, queryFormulaCells = queryFormulaCells, queryInterface = queryInterface, queryIntersection = queryIntersection, queryRowDifferences = queryRowDifferences, queryVisibleCells = queryVisibleCells, release = release)
  
    __obj.asInstanceOf[XCellRangesQuery]
  }
}

