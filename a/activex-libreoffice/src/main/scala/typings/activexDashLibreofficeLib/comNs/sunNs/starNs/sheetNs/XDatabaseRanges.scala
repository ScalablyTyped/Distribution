package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functions to manage a collection of database ranges.
  * @see com.sun.star.sheet.DatabaseRanges
  */
trait XDatabaseRanges
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /** adds a new database range to the collection. */
  def addNewByName(
    aName: java.lang.String,
    aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  ): scala.Unit
  /** removes a database range from the collection. */
  def removeByName(aName: java.lang.String): scala.Unit
}

