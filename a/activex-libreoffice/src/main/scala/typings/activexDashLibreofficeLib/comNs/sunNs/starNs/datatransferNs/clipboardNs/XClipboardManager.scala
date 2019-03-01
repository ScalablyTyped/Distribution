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
  def listClipboardNames(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Removes the clipboard with the specified name from the list.
    * @param aName The name of the clipboard to remove.
    */
  def removeClipboard(aName: java.lang.String): scala.Unit
}

object XClipboardManager {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addClipboard: js.Function1[XClipboard, scala.Unit],
    getClipboard: js.Function1[java.lang.String, XClipboard],
    listClipboardNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeClipboard: js.Function1[java.lang.String, scala.Unit]
  ): XClipboardManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addClipboard")(addClipboard)
    __obj.updateDynamic("getClipboard")(getClipboard)
    __obj.updateDynamic("listClipboardNames")(listClipboardNames)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeClipboard")(removeClipboard)
    __obj.asInstanceOf[XClipboardManager]
  }
}

