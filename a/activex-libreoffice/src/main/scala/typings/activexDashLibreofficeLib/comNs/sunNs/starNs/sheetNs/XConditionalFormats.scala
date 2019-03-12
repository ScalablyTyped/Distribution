package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XConditionalFormats
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val ConditionalFormats: stdLib.SafeArray[XConditionalFormat]
  val Length: scala.Double
  /** adds a conditional format to the existing list returns the id of the inserted conditional format */
  def createByRange(range: XSheetCellRanges): scala.Double
  def getConditionalFormats(): stdLib.SafeArray[XConditionalFormat]
  def getLength(): scala.Double
  def removeByID(ID: scala.Double): scala.Unit
}

object XConditionalFormats {
  @scala.inline
  def apply(
    ConditionalFormats: stdLib.SafeArray[XConditionalFormat],
    Length: scala.Double,
    acquire: () => scala.Unit,
    createByRange: XSheetCellRanges => scala.Double,
    getConditionalFormats: () => stdLib.SafeArray[XConditionalFormat],
    getLength: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByID: scala.Double => scala.Unit
  ): XConditionalFormats = {
    val __obj = js.Dynamic.literal(ConditionalFormats = ConditionalFormats, Length = Length, acquire = js.Any.fromFunction0(acquire), createByRange = js.Any.fromFunction1(createByRange), getConditionalFormats = js.Any.fromFunction0(getConditionalFormats), getLength = js.Any.fromFunction0(getLength), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByID = js.Any.fromFunction1(removeByID))
  
    __obj.asInstanceOf[XConditionalFormats]
  }
}

