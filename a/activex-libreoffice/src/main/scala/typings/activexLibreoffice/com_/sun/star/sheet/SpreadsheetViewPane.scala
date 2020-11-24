package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import typings.activexLibreoffice.com_.sun.star.view.XControlAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a single pane in a view of a spreadsheet document. */
@js.native
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
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn.asInstanceOf[js.Any], FirstVisibleRow = FirstVisibleRow.asInstanceOf[js.Any], ReferredCells = ReferredCells.asInstanceOf[js.Any], VisibleRange = VisibleRange.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction1(getControl), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getReferredCells = js.Any.fromFunction0(getReferredCells), getVisibleRange = js.Any.fromFunction0(getVisibleRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow))
    __obj.asInstanceOf[SpreadsheetViewPane]
  }
}
