package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardEvent]
  }
}

