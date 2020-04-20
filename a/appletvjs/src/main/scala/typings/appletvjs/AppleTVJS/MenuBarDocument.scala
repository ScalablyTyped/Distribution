package typings.appletvjs.AppleTVJS

import typings.std.Document_
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuBarDocument extends js.Object {
  /**
  		 * Retrieves the document associated with the specified menu item.
  		 * */
  def getDocument(menuItem: Element): Document_
  /**
  		 * Associates a document with a menu item.
  		 * */
  def setDocument(document: Document_, menuItem: Element): Unit
  /**
  		 * Sets the focus in a menu bar to the specified menu item.
  		 * */
  def setSelectedItem(menuItem: Element): Unit
}

object MenuBarDocument {
  @scala.inline
  def apply(
    getDocument: Element => Document_,
    setDocument: (Document_, Element) => Unit,
    setSelectedItem: Element => Unit
  ): MenuBarDocument = {
    val __obj = js.Dynamic.literal(getDocument = js.Any.fromFunction1(getDocument), setDocument = js.Any.fromFunction2(setDocument), setSelectedItem = js.Any.fromFunction1(setSelectedItem))
    __obj.asInstanceOf[MenuBarDocument]
  }
}

