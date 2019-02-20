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

