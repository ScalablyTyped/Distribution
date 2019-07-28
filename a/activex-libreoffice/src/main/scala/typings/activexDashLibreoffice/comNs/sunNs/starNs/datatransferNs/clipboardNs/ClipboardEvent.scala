package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.clipboardNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A clipboard uses this object to notify its listeners of content changes.
  * @see com.sun.star.datatransfer.clipboard.XClipboardListener
  */
trait ClipboardEvent extends EventObject {
  /** The current content of the clipboard. */
  var Contents: XTransferable
}

object ClipboardEvent {
  @scala.inline
  def apply(Contents: XTransferable, Source: XInterface): ClipboardEvent = {
    val __obj = js.Dynamic.literal(Contents = Contents, Source = Source)
  
    __obj.asInstanceOf[ClipboardEvent]
  }
}

