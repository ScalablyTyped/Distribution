package typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for new-style service {@link SystemClipboard} .
  * @since LibreOffice 4.2
  */
trait XSystemClipboard
  extends XClipboardEx
     with XClipboardNotifier
     with XFlushableClipboard
     with XComponent

object XSystemClipboard {
  @scala.inline
  def apply(
    Contents: XTransferable,
    Name: String,
    RenderingCapabilities: Double,
    acquire: () => Unit,
    addClipboardListener: XClipboardListener => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    flushClipboard: () => Unit,
    getContents: () => XTransferable,
    getName: () => String,
    getRenderingCapabilities: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeClipboardListener: XClipboardListener => Unit,
    removeEventListener: XEventListener => Unit,
    setContents: (XTransferable, XClipboardOwner) => Unit
  ): XSystemClipboard = {
    val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RenderingCapabilities = RenderingCapabilities.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addClipboardListener = js.Any.fromFunction1(addClipboardListener), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), flushClipboard = js.Any.fromFunction0(flushClipboard), getContents = js.Any.fromFunction0(getContents), getName = js.Any.fromFunction0(getName), getRenderingCapabilities = js.Any.fromFunction0(getRenderingCapabilities), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboardListener = js.Any.fromFunction1(removeClipboardListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setContents = js.Any.fromFunction2(setContents))
    __obj.asInstanceOf[XSystemClipboard]
  }
}

