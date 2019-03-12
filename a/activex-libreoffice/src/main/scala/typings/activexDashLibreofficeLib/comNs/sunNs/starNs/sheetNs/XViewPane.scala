package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a pane in a view of a spreadsheet document.
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
trait XViewPane
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the first column that is visible in the pane. */
  var FirstVisibleColumn: scala.Double
  /** returns the first row that is visible in the pane. */
  var FirstVisibleRow: scala.Double
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  val VisibleRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns the first column that is visible in the pane. */
  def getFirstVisibleColumn(): scala.Double
  /** returns the first row that is visible in the pane. */
  def getFirstVisibleRow(): scala.Double
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  def getVisibleRange(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** sets the first column that is visible in the pane. */
  def setFirstVisibleColumn(nFirstVisibleColumn: scala.Double): scala.Unit
  /** sets the first row that is visible in the pane. */
  def setFirstVisibleRow(nFirstVisibleRow: scala.Double): scala.Unit
}

object XViewPane {
  @scala.inline
  def apply(
    FirstVisibleColumn: scala.Double,
    FirstVisibleRow: scala.Double,
    VisibleRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    acquire: () => scala.Unit,
    getFirstVisibleColumn: () => scala.Double,
    getFirstVisibleRow: () => scala.Double,
    getVisibleRange: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFirstVisibleColumn: scala.Double => scala.Unit,
    setFirstVisibleRow: scala.Double => scala.Unit
  ): XViewPane = {
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn, FirstVisibleRow = FirstVisibleRow, VisibleRange = VisibleRange, acquire = js.Any.fromFunction0(acquire), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getVisibleRange = js.Any.fromFunction0(getVisibleRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow))
  
    __obj.asInstanceOf[XViewPane]
  }
}

