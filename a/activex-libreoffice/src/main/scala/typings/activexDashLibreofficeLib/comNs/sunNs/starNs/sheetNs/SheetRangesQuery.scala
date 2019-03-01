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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryColumnDifferences")(queryColumnDifferences)
    __obj.updateDynamic("queryContentCells")(queryContentCells)
    __obj.updateDynamic("queryDependents")(queryDependents)
    __obj.updateDynamic("queryEmptyCells")(queryEmptyCells)
    __obj.updateDynamic("queryFormulaCells")(queryFormulaCells)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("queryIntersection")(queryIntersection)
    __obj.updateDynamic("queryPrecedents")(queryPrecedents)
    __obj.updateDynamic("queryRowDifferences")(queryRowDifferences)
    __obj.updateDynamic("queryVisibleCells")(queryVisibleCells)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[SheetRangesQuery]
  }
}

