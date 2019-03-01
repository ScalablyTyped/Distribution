package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to be implemented to receive notifications on clipboard content changes. */
trait XClipboardListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * The content of the clipboard has changed.
    * @param event The event object containing the new clipboard content.
    * @see com.sun.star.datatransfer.clipboard.ClipboardEvent
    */
  def changedContents(event: ClipboardEvent): scala.Unit
}

object XClipboardListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    changedContents: js.Function1[ClipboardEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XClipboardListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("changedContents")(changedContents)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XClipboardListener]
  }
}

