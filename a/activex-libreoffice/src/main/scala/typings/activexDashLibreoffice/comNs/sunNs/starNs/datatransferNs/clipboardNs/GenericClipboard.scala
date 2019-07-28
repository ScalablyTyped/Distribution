package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.clipboardNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A generic clipboard service is a simple container for transferable objects. */
trait GenericClipboard
  extends XClipboardEx
     with XClipboardNotifier
     with XInitialization
     with XComponent

object GenericClipboard {
  @scala.inline
  def apply(
    Contents: XTransferable,
    Name: String,
    RenderingCapabilities: Double,
    acquire: () => Unit,
    addClipboardListener: XClipboardListener => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getContents: () => XTransferable,
    getName: () => String,
    getRenderingCapabilities: () => Double,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeClipboardListener: XClipboardListener => Unit,
    removeEventListener: XEventListener => Unit,
    setContents: (XTransferable, XClipboardOwner) => Unit
  ): GenericClipboard = {
    val __obj = js.Dynamic.literal(Contents = Contents, Name = Name, RenderingCapabilities = RenderingCapabilities, acquire = js.Any.fromFunction0(acquire), addClipboardListener = js.Any.fromFunction1(addClipboardListener), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getContents = js.Any.fromFunction0(getContents), getName = js.Any.fromFunction0(getName), getRenderingCapabilities = js.Any.fromFunction0(getRenderingCapabilities), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboardListener = js.Any.fromFunction1(removeClipboardListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setContents = js.Any.fromFunction2(setContents))
  
    __obj.asInstanceOf[GenericClipboard]
  }
}

