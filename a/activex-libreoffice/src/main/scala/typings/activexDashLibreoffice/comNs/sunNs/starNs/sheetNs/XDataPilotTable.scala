package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to control a data pilot table which has already been created.
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotTable extends XInterface {
  /** returns the address of the cell range that contains the data pilot table. */
  val OutputRange: CellRangeAddress
  /** returns the address of the cell range that contains the data pilot table. */
  def getOutputRange(): CellRangeAddress
  /** recreates the data pilot table with current data from the source cell range. */
  def refresh(): Unit
}

object XDataPilotTable {
  @scala.inline
  def apply(
    OutputRange: CellRangeAddress,
    acquire: () => Unit,
    getOutputRange: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit
  ): XDataPilotTable = {
    val __obj = js.Dynamic.literal(OutputRange = OutputRange, acquire = js.Any.fromFunction0(acquire), getOutputRange = js.Any.fromFunction0(getOutputRange), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataPilotTable]
  }
}

