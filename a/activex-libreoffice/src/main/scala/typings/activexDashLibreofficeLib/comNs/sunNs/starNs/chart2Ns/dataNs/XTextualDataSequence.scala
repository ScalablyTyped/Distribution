package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows access to a one-dimensional sequence of strings. */
trait XTextualDataSequence
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieves the data as strings */
  val TextualData: stdLib.SafeArray[java.lang.String]
  /** retrieves the data as strings */
  def getTextualData(): stdLib.SafeArray[java.lang.String]
}

object XTextualDataSequence {
  @scala.inline
  def apply(
    TextualData: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getTextualData: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTextualDataSequence = {
    val __obj = js.Dynamic.literal(TextualData = TextualData, acquire = js.Any.fromFunction0(acquire), getTextualData = js.Any.fromFunction0(getTextualData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextualDataSequence]
  }
}

