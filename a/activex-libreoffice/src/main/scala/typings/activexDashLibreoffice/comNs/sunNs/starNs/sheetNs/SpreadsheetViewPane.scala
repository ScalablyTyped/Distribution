package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCellRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XControlAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a single pane in a view of a spreadsheet document. */
trait SpreadsheetViewPane
  extends XViewPane
     with XCellRangeReferrer
     with XControlAccess

object SpreadsheetViewPane {
  @scala.inline
  def apply(
    FirstVisibleColumn: Double,
    FirstVisibleRow: Double,
    ReferredCells: XCellRange,
    VisibleRange: CellRangeAddress,
    acquire: () => Unit,
    getControl: XControlModel => XControl,
    getFirstVisibleColumn: () => Double,
    getFirstVisibleRow: () => Double,
    getReferredCells: () => XCellRange,
    getVisibleRange: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFirstVisibleColumn: Double => Unit,
    setFirstVisibleRow: Double => Unit
  ): SpreadsheetViewPane = {
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn, FirstVisibleRow = FirstVisibleRow, ReferredCells = ReferredCells, VisibleRange = VisibleRange, acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction1(getControl), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getReferredCells = js.Any.fromFunction0(getReferredCells), getVisibleRange = js.Any.fromFunction0(getVisibleRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow))
  
    __obj.asInstanceOf[SpreadsheetViewPane]
  }
}

