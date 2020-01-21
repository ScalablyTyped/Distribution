package typings.appletvjs.AppleTVJS

import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationDocument extends js.Object {
  /** The documents currently on the stack. */
  var documents: js.Array[Document_] = js.native
  /**
  		 * Removes all documents currently on the stack.
  		 * */
  def clear(): Unit = js.native
  /** Dismisses the document displayed in modal view. */
  def dismissModal(): Unit = js.native
  /**
  		 * Inserts a new document directly before a document currently on the stack.
  		 * */
  def insertBeforeDocument(document: Document_): Unit = js.native
  def insertBeforeDocument(document: Document_, beforeDocument: Document_): Unit = js.native
  /**
  		 * Removes the top most document from the stack.
  		 * */
  def popDocument(): Unit = js.native
  /**
  		 * Removes all of the documents on the stack that are above the passed document.
  		 * */
  def popToDocument(document: Document_): Unit = js.native
  /**
  		 * Removes all documents from the stack except for the bottom most document.
  		 * */
  def popToRootDocument(): Unit = js.native
  /**
  		 * Displays the passed document on top of the current document.
  		 * */
  def presentModal(document: Document_): Unit = js.native
  /**
  		 * This function searches the stack for the first instance of the document
  		 * contained in the beforeDocument parameter and inserts the document contained
  		 * in the document parameter on top of it.
  		 * */
  def pushDocument(document: Document_): Unit = js.native
  /**
  		 * Removes the specified document from the stack.
  		 * */
  def removeDocument(document: Document_): Unit = js.native
  /**
  		 * Replaces a document on the stack with a new document.
  		 * */
  def replaceDocument(document: Document_): Unit = js.native
  def replaceDocument(document: Document_, beforeDocument: Document_): Unit = js.native
}

