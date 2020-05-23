package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for password fields. */
trait XTextEditField extends XInterface {
  /** sets the character to display as a substitute on user input. */
  def setEchoChar(cEcho: String): Unit
}

object XTextEditField {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setEchoChar: String => Unit
  ): XTextEditField = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEchoChar = js.Any.fromFunction1(setEchoChar))
    __obj.asInstanceOf[XTextEditField]
  }
}

