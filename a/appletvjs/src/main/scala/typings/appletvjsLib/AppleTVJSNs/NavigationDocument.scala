package typings
package appletvjsLib.AppleTVJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationDocument extends js.Object {
  /** The documents currently on the stack. */
  var documents: js.Array[stdLib.Document] = js.native
  /**
  		 * Removes all documents currently on the stack.
  		 * */
  def clear(): scala.Unit = js.native
  /** Dismisses the document displayed in modal view. */
  def dismissModal(): scala.Unit = js.native
  /**
  		 * Inserts a new document directly before a document currently on the stack.
  		 * */
  def insertBeforeDocument(document: stdLib.Document): scala.Unit = js.native
  def insertBeforeDocument(document: stdLib.Document, beforeDocument: stdLib.Document): scala.Unit = js.native
  /**
  		 * Removes the top most document from the stack.
  		 * */
  def popDocument(): scala.Unit = js.native
  /**
  		 * Removes all of the documents on the stack that are above the passed document.
  		 * */
  def popToDocument(document: stdLib.Document): scala.Unit = js.native
  /**
  		 * Removes all documents from the stack except for the bottom most document.
  		 * */
  def popToRootDocument(): scala.Unit = js.native
  /**
  		 * Displays the passed document on top of the current document.
  		 * */
  def presentModal(document: stdLib.Document): scala.Unit = js.native
  /**
  		 * This function searches the stack for the first instance of the document
  		 * contained in the beforeDocument parameter and inserts the document contained
  		 * in the document parameter on top of it.
  		 * */
  def pushDocument(document: stdLib.Document): scala.Unit = js.native
  /**
  		 * Removes the specified document from the stack.
  		 * */
  def removeDocument(document: stdLib.Document): scala.Unit = js.native
  /**
  		 * Replaces a document on the stack with a new document.
  		 * */
  def replaceDocument(document: stdLib.Document): scala.Unit = js.native
  def replaceDocument(document: stdLib.Document, beforeDocument: stdLib.Document): scala.Unit = js.native
}

