package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The owner of a transferable object may pass this interface to the clipboard instance.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
trait XClipboardOwner
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notifies the transferable object source that it is no longer the owner of the clipboard.
    * @param xClipboard The clipboard for which the ownership was lost.
    * @param xTrans The transferable object that has been the contents of the clipboard.
    * @see com.sun.star.datatransfer.clipboard.XClipboard
    * @see com.sun.star.datatransfer.XTransferable
    */
  def lostOwnership(
    xClipboard: XClipboard,
    xTrans: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable
  ): scala.Unit
}

object XClipboardOwner {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    lostOwnership: (XClipboard, activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XClipboardOwner = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), lostOwnership = js.Any.fromFunction2(lostOwnership), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XClipboardOwner]
  }
}

