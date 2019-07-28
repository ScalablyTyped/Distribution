package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.clipboardNs.XClipboard
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs.XDragGestureRecognizer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs.XDragSource
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs.XDropTarget
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
    TopWindowCount: Double,
    WorkArea: Rectangle,
    acquire: () => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyHandler: XKeyHandler => Unit,
    addTopWindowListener: XTopWindowListener => Unit,
    createMessageBox: (XWindowPeer, MessageBoxType, Double, String, String) => XMessageBox,
    createRegion: () => XRegion,
    createScreenCompatibleDevice: (Double, Double) => XDevice,
    createSystemChild: (js.Any, SeqEquiv[Double], Double) => XWindowPeer,
    createWindow: WindowDescriptor => XWindowPeer,
    createWindows: SeqEquiv[WindowDescriptor] => SafeArray[XWindowPeer],
    fireFocusGained: XInterface => Unit,
    fireFocusLost: XInterface => Unit,
    getActiveTopWindow: () => XTopWindow,
    getClipboard: String => XClipboard,
    getDesktopWindow: () => XWindowPeer,
    getDragGestureRecognizer: XWindow => XDragGestureRecognizer,
    getDragSource: XWindow => XDragSource,
    getDropTarget: XWindow => XDropTarget,
    getTopWindow: Double => XTopWindow,
    getTopWindowCount: () => Double,
    getWorkArea: () => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyHandler: XKeyHandler => Unit,
    removeTopWindowListener: XTopWindowListener => Unit,
    reschedule: () => Unit
  ): XToolkit2 = {
    val __obj = js.Dynamic.literal(ActiveTopWindow = ActiveTopWindow, DesktopWindow = DesktopWindow, TopWindowCount = TopWindowCount, WorkArea = WorkArea, acquire = js.Any.fromFunction0(acquire), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), createMessageBox = js.Any.fromFunction5(createMessageBox), createRegion = js.Any.fromFunction0(createRegion), createScreenCompatibleDevice = js.Any.fromFunction2(createScreenCompatibleDevice), createSystemChild = js.Any.fromFunction3(createSystemChild), createWindow = js.Any.fromFunction1(createWindow), createWindows = js.Any.fromFunction1(createWindows), fireFocusGained = js.Any.fromFunction1(fireFocusGained), fireFocusLost = js.Any.fromFunction1(fireFocusLost), getActiveTopWindow = js.Any.fromFunction0(getActiveTopWindow), getClipboard = js.Any.fromFunction1(getClipboard), getDesktopWindow = js.Any.fromFunction0(getDesktopWindow), getDragGestureRecognizer = js.Any.fromFunction1(getDragGestureRecognizer), getDragSource = js.Any.fromFunction1(getDragSource), getDropTarget = js.Any.fromFunction1(getDropTarget), getTopWindow = js.Any.fromFunction1(getTopWindow), getTopWindowCount = js.Any.fromFunction0(getTopWindowCount), getWorkArea = js.Any.fromFunction0(getWorkArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), reschedule = js.Any.fromFunction0(reschedule))
  
    __obj.asInstanceOf[XToolkit2]
  }
}

