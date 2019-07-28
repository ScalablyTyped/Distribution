package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.clipboardNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for flushable clipboards may optionally be implemented by a system clipboard service.
  * @see com.sun.star.datatransfer.clipboard.SystemClipboard
  */
trait XFlushableClipboard extends XInterface {
  /** Renders the current content of the clipboard to the system so that it is available even if the source application no longer exist. */
  def flushClipboard(): Unit
}

object XFlushableClipboard {
  @scala.inline
  def apply(
    acquire: () => Unit,
    flushClipboard: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFlushableClipboard = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), flushClipboard = js.Any.fromFunction0(flushClipboard), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFlushableClipboard]
  }
}

