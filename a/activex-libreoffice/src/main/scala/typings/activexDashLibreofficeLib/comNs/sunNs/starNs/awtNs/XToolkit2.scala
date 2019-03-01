package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the new-style service {@link Toolkit} to implement.
  * @since LibreOffice 4.0
  */
trait XToolkit2
  extends XToolkit
     with XDataTransferProviderAccess
     with XSystemChildFactory
     with XMessageBoxFactory
     with XExtendedToolkit
     with XReschedule

object XToolkit2 {
  @scala.inline
  def apply(
    ActiveTopWindow: XTopWindow,
    DesktopWindow: XWindowPeer,
    TopWindowCount: scala.Double,
    WorkArea: Rectangle,
    acquire: js.Function0[scala.Unit],
    addFocusListener: js.Function1[XFocusListener, scala.Unit],
    addKeyHandler: js.Function1[XKeyHandler, scala.Unit],
    addTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    createMessageBox: js.Function5[XWindowPeer, MessageBoxType, scala.Double, java.lang.String, java.lang.String, XMessageBox],
    createRegion: js.Function0[XRegion],
    createScreenCompatibleDevice: js.Function2[scala.Double, scala.Double, XDevice],
    createSystemChild: js.Function3[
      js.Any, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Double, 
      XWindowPeer
    ],
    createWindow: js.Function1[WindowDescriptor, XWindowPeer],
    createWindows: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[WindowDescriptor], 
      activexDashInteropLib.SafeArray[XWindowPeer]
    ],
    fireFocusGained: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    fireFocusLost: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    getActiveTopWindow: js.Function0[XTopWindow],
    getClipboard: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.XClipboard
    ],
    getDesktopWindow: js.Function0[XWindowPeer],
    getDragGestureRecognizer: js.Function1[
      XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragGestureRecognizer
    ],
    getDragSource: js.Function1[
      XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragSource
    ],
    getDropTarget: js.Function1[
      XWindow, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDropTarget
    ],
    getTopWindow: js.Function1[scala.Double, XTopWindow],
    getTopWindowCount: js.Function0[scala.Double],
    getWorkArea: js.Function0[Rectangle],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeFocusListener: js.Function1[XFocusListener, scala.Unit],
    removeKeyHandler: js.Function1[XKeyHandler, scala.Unit],
    removeTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    reschedule: js.Function0[scala.Unit]
  ): XToolkit2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveTopWindow")(ActiveTopWindow)
    __obj.updateDynamic("DesktopWindow")(DesktopWindow)
    __obj.updateDynamic("TopWindowCount")(TopWindowCount)
    __obj.updateDynamic("WorkArea")(WorkArea)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addFocusListener")(addFocusListener)
    __obj.updateDynamic("addKeyHandler")(addKeyHandler)
    __obj.updateDynamic("addTopWindowListener")(addTopWindowListener)
    __obj.updateDynamic("createMessageBox")(createMessageBox)
    __obj.updateDynamic("createRegion")(createRegion)
    __obj.updateDynamic("createScreenCompatibleDevice")(createScreenCompatibleDevice)
    __obj.updateDynamic("createSystemChild")(createSystemChild)
    __obj.updateDynamic("createWindow")(createWindow)
    __obj.updateDynamic("createWindows")(createWindows)
    __obj.updateDynamic("fireFocusGained")(fireFocusGained)
    __obj.updateDynamic("fireFocusLost")(fireFocusLost)
    __obj.updateDynamic("getActiveTopWindow")(getActiveTopWindow)
    __obj.updateDynamic("getClipboard")(getClipboard)
    __obj.updateDynamic("getDesktopWindow")(getDesktopWindow)
    __obj.updateDynamic("getDragGestureRecognizer")(getDragGestureRecognizer)
    __obj.updateDynamic("getDragSource")(getDragSource)
    __obj.updateDynamic("getDropTarget")(getDropTarget)
    __obj.updateDynamic("getTopWindow")(getTopWindow)
    __obj.updateDynamic("getTopWindowCount")(getTopWindowCount)
    __obj.updateDynamic("getWorkArea")(getWorkArea)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeFocusListener")(removeFocusListener)
    __obj.updateDynamic("removeKeyHandler")(removeKeyHandler)
    __obj.updateDynamic("removeTopWindowListener")(removeTopWindowListener)
    __obj.updateDynamic("reschedule")(reschedule)
    __obj.asInstanceOf[XToolkit2]
  }
}

