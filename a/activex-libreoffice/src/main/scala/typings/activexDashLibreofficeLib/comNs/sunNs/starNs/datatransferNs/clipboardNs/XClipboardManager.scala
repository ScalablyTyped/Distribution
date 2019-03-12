package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is used to retrieve, add, or remove clipboard instances.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
trait XClipboardManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Add a clipboard instance to the manager's list.
    * @param xClipboard The clipboard to add.
    * @throws com::sun::star::IllegalArgumentException if xClipboard is not a valid clipboard.
    * @throws com::sun::star::container::ElementExistsException if a clipboard with the name of xClipboard already exists.
    */
  def addClipboard(xClipboard: XClipboard): scala.Unit
  /**
    * Get a clipboard instance by name.
    * @param aName The name of clipboard to return. To retrieve the default (system) clipboard, pass an empty string.
    * @returns The clipboard object with the specified name.
    * @throws com::sun::star::container::NoSuchElementException if no clipboard with the specified name exists.
    */
  def getClipboard(aName: java.lang.String): XClipboard
  /**
    * Get a list of a managed clipboards.
    * @returns A sequence of the names of all available clipboards.
    */
  def listClipboardNames(): stdLib.SafeArray[java.lang.String]
  /**
    * Removes the clipboard with the specified name from the list.
    * @param aName The name of the clipboard to remove.
    */
  def removeClipboard(aName: java.lang.String): scala.Unit
}

object XClipboardManager {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addClipboard: XClipboard => scala.Unit,
    getClipboard: java.lang.String => XClipboard,
    listClipboardNames: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeClipboard: java.lang.String => scala.Unit
  ): XClipboardManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addClipboard = js.Any.fromFunction1(addClipboard), getClipboard = js.Any.fromFunction1(getClipboard), listClipboardNames = js.Any.fromFunction0(listClipboardNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboard = js.Any.fromFunction1(removeClipboard))
  
    __obj.asInstanceOf[XClipboardManager]
  }
}

