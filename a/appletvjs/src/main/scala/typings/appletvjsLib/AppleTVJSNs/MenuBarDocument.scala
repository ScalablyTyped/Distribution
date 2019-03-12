package typings
package appletvjsLib.AppleTVJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuBarDocument extends js.Object {
  /**
  		 * Retrieves the document associated with the specified menu item.
  		 * */
  def getDocument(menuItem: stdLib.Element): stdLib.Document
  /**
  		 * Associates a document with a menu item.
  		 * */
  def setDocument(document: stdLib.Document, menuItem: stdLib.Element): scala.Unit
  /**
  		 * Sets the focus in a menu bar to the specified menu item.
  		 * */
  def setSelectedItem(menuItem: stdLib.Element): scala.Unit
}

object MenuBarDocument {
  @scala.inline
  def apply(
    getDocument: stdLib.Element => stdLib.Document,
    setDocument: (stdLib.Document, stdLib.Element) => scala.Unit,
    setSelectedItem: stdLib.Element => scala.Unit
  ): MenuBarDocument = {
    val __obj = js.Dynamic.literal(getDocument = js.Any.fromFunction1(getDocument), setDocument = js.Any.fromFunction2(setDocument), setSelectedItem = js.Any.fromFunction1(setSelectedItem))
  
    __obj.asInstanceOf[MenuBarDocument]
  }
}

