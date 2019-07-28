package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XConditionalFormats extends XInterface {
  val ConditionalFormats: SafeArray[XConditionalFormat]
  val Length: Double
  /** adds a conditional format to the existing list returns the id of the inserted conditional format */
  def createByRange(range: XSheetCellRanges): Double
  def getConditionalFormats(): SafeArray[XConditionalFormat]
  def getLength(): Double
  def removeByID(ID: Double): Unit
}

object XConditionalFormats {
  @scala.inline
  def apply(
    ConditionalFormats: SafeArray[XConditionalFormat],
    Length: Double,
    acquire: () => Unit,
    createByRange: XSheetCellRanges => Double,
    getConditionalFormats: () => SafeArray[XConditionalFormat],
    getLength: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByID: Double => Unit
  ): XConditionalFormats = {
    val __obj = js.Dynamic.literal(ConditionalFormats = ConditionalFormats, Length = Length, acquire = js.Any.fromFunction0(acquire), createByRange = js.Any.fromFunction1(createByRange), getConditionalFormats = js.Any.fromFunction0(getConditionalFormats), getLength = js.Any.fromFunction0(getLength), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByID = js.Any.fromFunction1(removeByID))
  
    __obj.asInstanceOf[XConditionalFormats]
  }
}

