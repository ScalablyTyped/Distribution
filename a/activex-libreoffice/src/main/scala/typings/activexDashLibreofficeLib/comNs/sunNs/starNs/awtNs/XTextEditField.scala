package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for password fields. */
trait XTextEditField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** sets the character to display as a substitute on user input. */
  def setEchoChar(cEcho: java.lang.String): scala.Unit
}

object XTextEditField {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setEchoChar: js.Function1[java.lang.String, scala.Unit]
  ): XTextEditField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setEchoChar")(setEchoChar)
    __obj.asInstanceOf[XTextEditField]
  }
}

