package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * grants access to a collection of data pilot tables.
  * @see com.sun.star.sheet.Spreadsheet
  */
trait XDataPilotTablesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  val DataPilotTables: XDataPilotTables
  /**
    * Returns the collection of data pilot tables.
    * @see com.sun.star.sheet.DataPilotTables
    */
  def getDataPilotTables(): XDataPilotTables
}

object XDataPilotTablesSupplier {
  @scala.inline
  def apply(
    DataPilotTables: XDataPilotTables,
    acquire: js.Function0[scala.Unit],
    getDataPilotTables: js.Function0[XDataPilotTables],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataPilotTablesSupplier = {
    val __obj = js.Dynamic.literal(DataPilotTables = DataPilotTables, acquire = acquire, getDataPilotTables = getDataPilotTables, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDataPilotTablesSupplier]
  }
}

