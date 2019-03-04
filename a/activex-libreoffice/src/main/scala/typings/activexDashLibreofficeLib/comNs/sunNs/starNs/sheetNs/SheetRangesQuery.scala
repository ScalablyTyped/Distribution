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
    acquire: js.Function0[scala.Unit],
    queryColumnDifferences: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, XSheetCellRanges],
    queryContentCells: js.Function1[scala.Double, XSheetCellRanges],
    queryDependents: js.Function1[scala.Boolean, XSheetCellRanges],
    queryEmptyCells: js.Function0[XSheetCellRanges],
    queryFormulaCells: js.Function1[scala.Double, XSheetCellRanges],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryIntersection: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
      XSheetCellRanges
    ],
    queryPrecedents: js.Function1[scala.Boolean, XSheetCellRanges],
    queryRowDifferences: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, XSheetCellRanges],
    queryVisibleCells: js.Function0[XSheetCellRanges],
    release: js.Function0[scala.Unit]
  ): SheetRangesQuery = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryColumnDifferences = queryColumnDifferences, queryContentCells = queryContentCells, queryDependents = queryDependents, queryEmptyCells = queryEmptyCells, queryFormulaCells = queryFormulaCells, queryInterface = queryInterface, queryIntersection = queryIntersection, queryPrecedents = queryPrecedents, queryRowDifferences = queryRowDifferences, queryVisibleCells = queryVisibleCells, release = release)
  
    __obj.asInstanceOf[SheetRangesQuery]
  }
}

