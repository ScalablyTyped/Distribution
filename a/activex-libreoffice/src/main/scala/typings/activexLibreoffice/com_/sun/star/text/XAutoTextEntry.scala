package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies an autotext entry.
  * @deprecated Deprecated
  */
trait XAutoTextEntry extends XInterface {
  /** inserts the contents represented by this auto text entry at the specified text range. */
  def applyTo(xRange: XTextRange): Unit
}

object XAutoTextEntry {
  @scala.inline
  def apply(
    acquire: () => Unit,
    applyTo: XTextRange => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAutoTextEntry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), applyTo = js.Any.fromFunction1(applyTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAutoTextEntry]
  }
}

