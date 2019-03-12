package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functions to manage the sheet local databases
  * @since LibreOffice 3.5
  */
trait XUnnamedDatabaseRanges
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def getByTable(nTab: scala.Double): js.Any
  def hasByTable(nTab: scala.Double): scala.Boolean
  def setByTable(aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
}

object XUnnamedDatabaseRanges {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getByTable: scala.Double => js.Any,
    hasByTable: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setByTable: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => scala.Unit
  ): XUnnamedDatabaseRanges = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByTable = js.Any.fromFunction1(getByTable), hasByTable = js.Any.fromFunction1(hasByTable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setByTable = js.Any.fromFunction1(setByTable))
  
    __obj.asInstanceOf[XUnnamedDatabaseRanges]
  }
}

