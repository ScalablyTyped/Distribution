package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is used to retrieve, add, or remove clipboard instances.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
trait XClipboardManager extends XInterface {
  /**
    * Add a clipboard instance to the manager's list.
    * @param xClipboard The clipboard to add.
    * @throws com::sun::star::IllegalArgumentException if xClipboard is not a valid clipboard.
    * @throws com::sun::star::container::ElementExistsException if a clipboard with the name of xClipboard already exists.
    */
  def addClipboard(xClipboard: XClipboard): Unit
  /**
    * Get a clipboard instance by name.
    * @param aName The name of clipboard to return. To retrieve the default (system) clipboard, pass an empty string.
    * @returns The clipboard object with the specified name.
    * @throws com::sun::star::container::NoSuchElementException if no clipboard with the specified name exists.
    */
  def getClipboard(aName: String): XClipboard
  /**
    * Get a list of a managed clipboards.
    * @returns A sequence of the names of all available clipboards.
    */
  def listClipboardNames(): SafeArray[String]
  /**
    * Removes the clipboard with the specified name from the list.
    * @param aName The name of the clipboard to remove.
    */
  def removeClipboard(aName: String): Unit
}

object XClipboardManager {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addClipboard: XClipboard => Unit,
    getClipboard: String => XClipboard,
    listClipboardNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeClipboard: String => Unit
  ): XClipboardManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addClipboard = js.Any.fromFunction1(addClipboard), getClipboard = js.Any.fromFunction1(getClipboard), listClipboardNames = js.Any.fromFunction0(listClipboardNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboard = js.Any.fromFunction1(removeClipboard))
    __obj.asInstanceOf[XClipboardManager]
  }
}

