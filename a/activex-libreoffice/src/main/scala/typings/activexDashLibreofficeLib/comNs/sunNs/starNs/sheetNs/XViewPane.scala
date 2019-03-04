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
    acquire: js.Function0[scala.Unit],
    getFirstVisibleColumn: js.Function0[scala.Double],
    getFirstVisibleRow: js.Function0[scala.Double],
    getVisibleRange: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFirstVisibleColumn: js.Function1[scala.Double, scala.Unit],
    setFirstVisibleRow: js.Function1[scala.Double, scala.Unit]
  ): XViewPane = {
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn, FirstVisibleRow = FirstVisibleRow, VisibleRange = VisibleRange, acquire = acquire, getFirstVisibleColumn = getFirstVisibleColumn, getFirstVisibleRow = getFirstVisibleRow, getVisibleRange = getVisibleRange, queryInterface = queryInterface, release = release, setFirstVisibleColumn = setFirstVisibleColumn, setFirstVisibleRow = setFirstVisibleRow)
  
    __obj.asInstanceOf[XViewPane]
  }
}

