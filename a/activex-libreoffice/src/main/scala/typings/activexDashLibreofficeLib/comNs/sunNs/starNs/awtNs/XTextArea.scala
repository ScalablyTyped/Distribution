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
    acquire: js.Function0[scala.Unit],
    getTextLines: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextArea = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TextLines")(TextLines)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getTextLines")(getTextLines)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTextArea]
  }
}

