package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows access to a one-dimensional sequence of strings. */
trait XTextualDataSequence extends XInterface {
  /** retrieves the data as strings */
  val TextualData: SafeArray[String]
  /** retrieves the data as strings */
  def getTextualData(): SafeArray[String]
}

object XTextualDataSequence {
  @scala.inline
  def apply(
    TextualData: SafeArray[String],
    acquire: () => Unit,
    getTextualData: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextualDataSequence = {
    val __obj = js.Dynamic.literal(TextualData = TextualData, acquire = js.Any.fromFunction0(acquire), getTextualData = js.Any.fromFunction0(getTextualData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextualDataSequence]
  }
}

