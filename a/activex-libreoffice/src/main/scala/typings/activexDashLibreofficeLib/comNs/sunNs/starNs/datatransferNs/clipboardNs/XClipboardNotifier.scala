package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XClipboardNotifier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Requests notifications on clipboard content changes.
    * @param listener The object receiving the notifications.
    */
  def addClipboardListener(listener: XClipboardListener): scala.Unit
  /**
    * Removes listener from notification list.
    * @param listener The object to remove from notification list.
    */
  def removeClipboardListener(listener: XClipboardListener): scala.Unit
}

object XClipboardNotifier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addClipboardListener: js.Function1[XClipboardListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeClipboardListener: js.Function1[XClipboardListener, scala.Unit]
  ): XClipboardNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire, addClipboardListener = addClipboardListener, queryInterface = queryInterface, release = release, removeClipboardListener = removeClipboardListener)
  
    __obj.asInstanceOf[XClipboardNotifier]
  }
}

