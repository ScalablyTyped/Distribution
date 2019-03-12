package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for flushable clipboards may optionally be implemented by a system clipboard service.
  * @see com.sun.star.datatransfer.clipboard.SystemClipboard
  */
trait XFlushableClipboard
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Renders the current content of the clipboard to the system so that it is available even if the source application no longer exist. */
  def flushClipboard(): scala.Unit
}

object XFlushableClipboard {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    flushClipboard: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFlushableClipboard = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), flushClipboard = js.Any.fromFunction0(flushClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFlushableClipboard]
  }
}

