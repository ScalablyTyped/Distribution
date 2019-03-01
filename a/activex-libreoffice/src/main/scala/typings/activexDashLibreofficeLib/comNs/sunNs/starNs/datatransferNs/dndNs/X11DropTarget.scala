package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service connects the Java-like UNO Drag and Drop protocol to the X Drag and Drop protocol used on X-Servers to transfer data between application
  * via Drag and Drop operations.
  * @see XDragSource
  * @see XDropTarget
  */
trait X11DropTarget
  extends XDropTarget
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object X11DropTarget {
  @scala.inline
  def apply(
    DefaultActions: scala.Double,
    acquire: js.Function0[scala.Unit],
    addDropTargetListener: js.Function1[XDropTargetListener, scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getDefaultActions: js.Function0[scala.Double],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    isActive: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDropTargetListener: js.Function1[XDropTargetListener, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setActive: js.Function1[scala.Boolean, scala.Unit],
    setDefaultActions: js.Function1[scala.Double, scala.Unit]
  ): X11DropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultActions")(DefaultActions)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDropTargetListener")(addDropTargetListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getDefaultActions")(getDefaultActions)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDropTargetListener")(removeDropTargetListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setActive")(setActive)
    __obj.updateDynamic("setDefaultActions")(setDefaultActions)
    __obj.asInstanceOf[X11DropTarget]
  }
}

