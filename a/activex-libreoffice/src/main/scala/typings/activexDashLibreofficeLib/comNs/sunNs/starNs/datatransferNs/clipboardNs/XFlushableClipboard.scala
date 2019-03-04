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
    acquire: js.Function0[scala.Unit],
    flushClipboard: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFlushableClipboard = {
    val __obj = js.Dynamic.literal(acquire = acquire, flushClipboard = flushClipboard, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFlushableClipboard]
  }
}

