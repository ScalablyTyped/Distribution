package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a single pane in a view of a spreadsheet document. */
trait SpreadsheetViewPane
  extends XViewPane
     with XCellRangeReferrer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XControlAccess

object SpreadsheetViewPane {
  @scala.inline
  def apply(
    FirstVisibleColumn: scala.Double,
    FirstVisibleRow: scala.Double,
    ReferredCells: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    VisibleRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    acquire: js.Function0[scala.Unit],
    getControl: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
    ],
    getFirstVisibleColumn: js.Function0[scala.Double],
    getFirstVisibleRow: js.Function0[scala.Double],
    getReferredCells: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange],
    getVisibleRange: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFirstVisibleColumn: js.Function1[scala.Double, scala.Unit],
    setFirstVisibleRow: js.Function1[scala.Double, scala.Unit]
  ): SpreadsheetViewPane = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FirstVisibleColumn")(FirstVisibleColumn)
    __obj.updateDynamic("FirstVisibleRow")(FirstVisibleRow)
    __obj.updateDynamic("ReferredCells")(ReferredCells)
    __obj.updateDynamic("VisibleRange")(VisibleRange)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getControl")(getControl)
    __obj.updateDynamic("getFirstVisibleColumn")(getFirstVisibleColumn)
    __obj.updateDynamic("getFirstVisibleRow")(getFirstVisibleRow)
    __obj.updateDynamic("getReferredCells")(getReferredCells)
    __obj.updateDynamic("getVisibleRange")(getVisibleRange)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFirstVisibleColumn")(setFirstVisibleColumn)
    __obj.updateDynamic("setFirstVisibleRow")(setFirstVisibleRow)
    __obj.asInstanceOf[SpreadsheetViewPane]
  }
}

