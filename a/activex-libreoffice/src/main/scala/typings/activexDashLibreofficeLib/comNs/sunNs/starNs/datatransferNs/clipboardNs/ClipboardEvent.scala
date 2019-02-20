package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A clipboard uses this object to notify its listeners of content changes.
  * @see com.sun.star.datatransfer.clipboard.XClipboardListener
  */
trait ClipboardEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** The current content of the clipboard. */
  var Contents: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
}

