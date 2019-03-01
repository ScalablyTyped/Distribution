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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Contents")(Contents)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("RenderingCapabilities")(RenderingCapabilities)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addClipboardListener")(addClipboardListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("flushClipboard")(flushClipboard)
    __obj.updateDynamic("getContents")(getContents)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getRenderingCapabilities")(getRenderingCapabilities)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeClipboardListener")(removeClipboardListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setContents")(setContents)
    __obj.asInstanceOf[XSystemClipboard]
  }
}

