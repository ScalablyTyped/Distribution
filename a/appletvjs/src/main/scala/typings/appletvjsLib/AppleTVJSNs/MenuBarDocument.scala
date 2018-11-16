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

