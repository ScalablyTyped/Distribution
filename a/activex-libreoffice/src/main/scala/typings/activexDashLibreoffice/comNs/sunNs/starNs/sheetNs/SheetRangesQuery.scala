package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
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
    acquire: () => Unit,
    queryColumnDifferences: CellAddress => XSheetCellRanges,
    queryContentCells: Double => XSheetCellRanges,
    queryDependents: Boolean => XSheetCellRanges,
    queryEmptyCells: () => XSheetCellRanges,
    queryFormulaCells: Double => XSheetCellRanges,
    queryInterface: `type` => js.Any,
    queryIntersection: CellRangeAddress => XSheetCellRanges,
    queryPrecedents: Boolean => XSheetCellRanges,
    queryRowDifferences: CellAddress => XSheetCellRanges,
    queryVisibleCells: () => XSheetCellRanges,
    release: () => Unit
  ): SheetRangesQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryColumnDifferences = js.Any.fromFunction1(queryColumnDifferences), queryContentCells = js.Any.fromFunction1(queryContentCells), queryDependents = js.Any.fromFunction1(queryDependents), queryEmptyCells = js.Any.fromFunction0(queryEmptyCells), queryFormulaCells = js.Any.fromFunction1(queryFormulaCells), queryInterface = js.Any.fromFunction1(queryInterface), queryIntersection = js.Any.fromFunction1(queryIntersection), queryPrecedents = js.Any.fromFunction1(queryPrecedents), queryRowDifferences = js.Any.fromFunction1(queryRowDifferences), queryVisibleCells = js.Any.fromFunction0(queryVisibleCells), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[SheetRangesQuery]
  }
}

