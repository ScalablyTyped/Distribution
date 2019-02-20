package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XConditionalFormat
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * Creates a new conditional format entry and insert its at the position.
    * @param Type a com.sun.star.sheet.ConditionFormatEntryType specifying the type of the new entry
    * @param Position the position in the conditional format
    */
  def createEntry(Type: scala.Double, Position: scala.Double): scala.Unit
  def removeByIndex(Index: scala.Double): scala.Unit
}

