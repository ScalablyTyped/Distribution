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
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setEchoChar: java.lang.String => scala.Unit
  ): XTextEditField = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEchoChar = js.Any.fromFunction1(setEchoChar))
  
    __obj.asInstanceOf[XTextEditField]
  }
}

