package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functions to manage the sheet local databases
  * @since LibreOffice 3.5
  */
trait XUnnamedDatabaseRanges extends XInterface {
  def getByTable(nTab: Double): js.Any
  def hasByTable(nTab: Double): Boolean
  def setByTable(aRange: CellRangeAddress): Unit
}

object XUnnamedDatabaseRanges {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByTable: Double => js.Any,
    hasByTable: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setByTable: CellRangeAddress => Unit
  ): XUnnamedDatabaseRanges = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByTable = js.Any.fromFunction1(getByTable), hasByTable = js.Any.fromFunction1(hasByTable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setByTable = js.Any.fromFunction1(setByTable))
  
    __obj.asInstanceOf[XUnnamedDatabaseRanges]
  }
}

