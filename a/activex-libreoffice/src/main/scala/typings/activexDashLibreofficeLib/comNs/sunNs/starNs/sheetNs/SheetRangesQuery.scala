package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides interfaces to find cells with specific properties. */
trait SheetRangesQuery
  extends XCellRangesQuery
     with XFormulaQuery

object SheetRangesQuery {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryColumnDifferences: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => XSheetCellRanges,
    queryContentCells: scala.Double => XSheetCellRanges,
    queryDependents: scala.Boolean => XSheetCellRanges,
    queryEmptyCells: () => XSheetCellRanges,
    queryFormulaCells: scala.Double => XSheetCellRanges,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    queryIntersection: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => XSheetCellRanges,
    queryPrecedents: scala.Boolean => XSheetCellRanges,
    queryRowDifferences: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => XSheetCellRanges,
    queryVisibleCells: () => XSheetCellRanges,
    release: () => scala.Unit
  ): SheetRangesQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryColumnDifferences = js.Any.fromFunction1(queryColumnDifferences), queryContentCells = js.Any.fromFunction1(queryContentCells), queryDependents = js.Any.fromFunction1(queryDependents), queryEmptyCells = js.Any.fromFunction0(queryEmptyCells), queryFormulaCells = js.Any.fromFunction1(queryFormulaCells), queryInterface = js.Any.fromFunction1(queryInterface), queryIntersection = js.Any.fromFunction1(queryIntersection), queryPrecedents = js.Any.fromFunction1(queryPrecedents), queryRowDifferences = js.Any.fromFunction1(queryRowDifferences), queryVisibleCells = js.Any.fromFunction0(queryVisibleCells), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[SheetRangesQuery]
  }
}

