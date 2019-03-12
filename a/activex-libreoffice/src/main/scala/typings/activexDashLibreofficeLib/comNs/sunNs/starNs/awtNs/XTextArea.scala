package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the text in a control. */
trait XTextArea
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the text lines as a single string with line separators. */
  val TextLines: java.lang.String
  /** returns the text lines as a single string with line separators. */
  def getTextLines(): java.lang.String
}

object XTextArea {
  @scala.inline
  def apply(
    TextLines: java.lang.String,
    acquire: () => scala.Unit,
    getTextLines: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTextArea = {
    val __obj = js.Dynamic.literal(TextLines = TextLines, acquire = js.Any.fromFunction0(acquire), getTextLines = js.Any.fromFunction0(getTextLines), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextArea]
  }
}

