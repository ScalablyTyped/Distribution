package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a pane in a view of a spreadsheet document.
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
trait XViewPane extends XInterface {
  /** returns the first column that is visible in the pane. */
  var FirstVisibleColumn: Double
  /** returns the first row that is visible in the pane. */
  var FirstVisibleRow: Double
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  val VisibleRange: CellRangeAddress
  /** returns the first column that is visible in the pane. */
  def getFirstVisibleColumn(): Double
  /** returns the first row that is visible in the pane. */
  def getFirstVisibleRow(): Double
  /** returns the address of the cell range that consists of the cells which are visible in the pane. */
  def getVisibleRange(): CellRangeAddress
  /** sets the first column that is visible in the pane. */
  def setFirstVisibleColumn(nFirstVisibleColumn: Double): Unit
  /** sets the first row that is visible in the pane. */
  def setFirstVisibleRow(nFirstVisibleRow: Double): Unit
}

object XViewPane {
  @scala.inline
  def apply(
    FirstVisibleColumn: Double,
    FirstVisibleRow: Double,
    VisibleRange: CellRangeAddress,
    acquire: () => Unit,
    getFirstVisibleColumn: () => Double,
    getFirstVisibleRow: () => Double,
    getVisibleRange: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFirstVisibleColumn: Double => Unit,
    setFirstVisibleRow: Double => Unit
  ): XViewPane = {
    val __obj = js.Dynamic.literal(FirstVisibleColumn = FirstVisibleColumn, FirstVisibleRow = FirstVisibleRow, VisibleRange = VisibleRange, acquire = js.Any.fromFunction0(acquire), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getVisibleRange = js.Any.fromFunction0(getVisibleRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow))
  
    __obj.asInstanceOf[XViewPane]
  }
}

