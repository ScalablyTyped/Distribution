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
    acquire: js.Function0[scala.Unit],
    getByTable: js.Function1[scala.Double, js.Any],
    hasByTable: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setByTable: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit]
  ): XUnnamedDatabaseRanges = {
    val __obj = js.Dynamic.literal(acquire = acquire, getByTable = getByTable, hasByTable = hasByTable, queryInterface = queryInterface, release = release, setByTable = setByTable)
  
    __obj.asInstanceOf[XUnnamedDatabaseRanges]
  }
}

