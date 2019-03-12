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
    acquire: () => scala.Unit,
    getControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    getFirstVisibleColumn: () => scala.Double,
    getFirstVisibleRow: () => scala.Double,
    getReferredCells: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getVisibleRange: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFirstVisibleColumn: scala.Double => scala.Unit,
    setFirstVisibleRow: scala.Double => scala.Unit
  ): SpreadsheetViewPane = {
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn, FirstVisibleRow = FirstVisibleRow, ReferredCells = ReferredCells, VisibleRange = VisibleRange, acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction1(getControl), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getReferredCells = js.Any.fromFunction0(getReferredCells), getVisibleRange = js.Any.fromFunction0(getVisibleRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow))
  
    __obj.asInstanceOf[SpreadsheetViewPane]
  }
}

