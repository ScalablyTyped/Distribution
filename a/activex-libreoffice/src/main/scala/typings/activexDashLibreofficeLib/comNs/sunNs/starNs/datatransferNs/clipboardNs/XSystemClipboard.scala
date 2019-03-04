package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object XSystemClipboard {
  @scala.inline
  def apply(
    Contents: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    Name: java.lang.String,
    RenderingCapabilities: scala.Double,
    acquire: js.Function0[scala.Unit],
    addClipboardListener: js.Function1[XClipboardListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    flushClipboard: js.Function0[scala.Unit],
    getContents: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable],
    getName: js.Function0[java.lang.String],
    getRenderingCapabilities: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeClipboardListener: js.Function1[XClipboardListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setContents: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      XClipboardOwner, 
      scala.Unit
    ]
  ): XSystemClipboard = {
    val __obj = js.Dynamic.literal(Contents = Contents, Name = Name, RenderingCapabilities = RenderingCapabilities, acquire = acquire, addClipboardListener = addClipboardListener, addEventListener = addEventListener, dispose = dispose, flushClipboard = flushClipboard, getContents = getContents, getName = getName, getRenderingCapabilities = getRenderingCapabilities, queryInterface = queryInterface, release = release, removeClipboardListener = removeClipboardListener, removeEventListener = removeEventListener, setContents = setContents)
  
    __obj.asInstanceOf[XSystemClipboard]
  }
}

