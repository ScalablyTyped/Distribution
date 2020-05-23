package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to page through the document in steps of the displayed size. */
trait XScreenCursor extends XInterface {
  /** scrolls the view forward by one visible page. */
  def screenDown(): Boolean
  /** scrolls the view backward by one visible page. */
  def screenUp(): Boolean
}

object XScreenCursor {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    screenDown: () => Boolean,
    screenUp: () => Boolean
  ): XScreenCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), screenDown = js.Any.fromFunction0(screenDown), screenUp = js.Any.fromFunction0(screenUp))
    __obj.asInstanceOf[XScreenCursor]
  }
}

