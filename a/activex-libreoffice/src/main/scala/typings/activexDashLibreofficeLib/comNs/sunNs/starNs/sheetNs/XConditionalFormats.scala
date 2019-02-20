package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XConditionalFormats
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val ConditionalFormats: activexDashInteropLib.SafeArray[XConditionalFormat]
  val Length: scala.Double
  /** adds a conditional format to the existing list returns the id of the inserted conditional format */
  def createByRange(range: XSheetCellRanges): scala.Double
  def getConditionalFormats(): activexDashInteropLib.SafeArray[XConditionalFormat]
  def getLength(): scala.Double
  def removeByID(ID: scala.Double): scala.Unit
}

