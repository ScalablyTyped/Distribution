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

