package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to control a data pilot table which has already been created.
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotTable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the address of the cell range that contains the data pilot table. */
  val OutputRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns the address of the cell range that contains the data pilot table. */
  def getOutputRange(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** recreates the data pilot table with current data from the source cell range. */
  def refresh(): scala.Unit
}

object XDataPilotTable {
  @scala.inline
  def apply(
    OutputRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    acquire: js.Function0[scala.Unit],
    getOutputRange: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit]
  ): XDataPilotTable = {
    val __obj = js.Dynamic.literal(OutputRange = OutputRange, acquire = acquire, getOutputRange = getOutputRange, queryInterface = queryInterface, refresh = refresh, release = release)
  
    __obj.asInstanceOf[XDataPilotTable]
  }
}

