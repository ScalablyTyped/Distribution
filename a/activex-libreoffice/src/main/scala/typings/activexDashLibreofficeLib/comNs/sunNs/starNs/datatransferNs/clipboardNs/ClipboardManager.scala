package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The clipboard manager is a one-instance service that holds a list of all known clipboard instances.
  * @see XClipboardManager
  */
trait ClipboardManager
  extends XClipboardManager
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object ClipboardManager {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addClipboard: js.Function1[XClipboard, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getClipboard: js.Function1[java.lang.String, XClipboard],
    listClipboardNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeClipboard: js.Function1[java.lang.String, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): ClipboardManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addClipboard")(addClipboard)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getClipboard")(getClipboard)
    __obj.updateDynamic("listClipboardNames")(listClipboardNames)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeClipboard")(removeClipboard)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[ClipboardManager]
  }
}

