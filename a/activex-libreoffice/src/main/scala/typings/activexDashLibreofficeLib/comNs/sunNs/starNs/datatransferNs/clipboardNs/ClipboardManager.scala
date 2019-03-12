package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The clipboard manager is a one-instance service that holds a list of all known clipboard instances.
  * @see XClipboardManager
  */
trait ClipboardManager
  extends XClipboardManager
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object ClipboardManager {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addClipboard: XClipboard => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    getClipboard: java.lang.String => XClipboard,
    listClipboardNames: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeClipboard: java.lang.String => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): ClipboardManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addClipboard = js.Any.fromFunction1(addClipboard), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getClipboard = js.Any.fromFunction1(getClipboard), listClipboardNames = js.Any.fromFunction0(listClipboardNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboard = js.Any.fromFunction1(removeClipboard), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[ClipboardManager]
  }
}

