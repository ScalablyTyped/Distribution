package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Work in progress, don't use unless you know what you are doing. */
trait XToolkitExperimental extends XToolkit2 {
  /** Get the number of OpenGL buffer swaps. */
  val OpenGLBufferSwapCounter: scala.Double
  /** Get the number of OpenGL buffer swaps. */
  def getOpenGLBufferSwapCounter(): scala.Double
  /** Pause the main thread of LibreOffice for the requested amount of time. */
  def pause(nMilliseconds: scala.Double): scala.Unit
  /** Process all pending idle events */
  def processEventsToIdle(): scala.Unit
  /** Turn on or off deterministic scheduling (off is the default). */
  def setDeterministicScheduling(bDeterministicMode: scala.Boolean): scala.Unit
}

object XToolkitExperimental {
  @scala.inline
  def apply(
    ActiveTopWindow: XTopWindow,
    DesktopWindow: XWindowPeer,
    OpenGLBufferSwapCounter: scala.Double,
    TopWindowCount: scala.Double,
    WorkArea: Rectangle,
    acquire: () => scala.Unit,
    addFocusListener: XFocusListener => scala.Unit,
    addKeyHandler: XKeyHandler => scala.Unit,
    addTopWindowListener: XTopWindowListener => scala.Unit,
    createMessageBox: (XWindowPeer, MessageBoxType, scala.Double, java.lang.String, java.lang.String) => XMessageBox,
    createRegion: () => XRegion,
    createScreenCompatibleDevice: (scala.Double, scala.Double) => XDevice,
    createSystemChild: (js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double) => XWindowPeer,
    createWindow: WindowDescriptor => XWindowPeer,
    createWindows: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[WindowDescriptor] => stdLib.SafeArray[XWindowPeer],
    fireFocusGained: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    fireFocusLost: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    getActiveTopWindow: () => XTopWindow,
    getClipboard: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs.XClipboard,
    getDesktopWindow: () => XWindowPeer,
    getDragGestureRecognizer: XWindow => activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragGestureRecognizer,
    getDragSource: XWindow => activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDragSource,
    getDropTarget: XWindow => activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs.XDropTarget,
    getOpenGLBufferSwapCounter: () => scala.Double,
    getTopWindow: scala.Double => XTopWindow,
    getTopWindowCount: () => scala.Double,
    getWorkArea: () => Rectangle,
    pause: scala.Double => scala.Unit,
    processEventsToIdle: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeFocusListener: XFocusListener => scala.Unit,
    removeKeyHandler: XKeyHandler => scala.Unit,
    removeTopWindowListener: XTopWindowListener => scala.Unit,
    reschedule: () => scala.Unit,
    setDeterministicScheduling: scala.Boolean => scala.Unit
  ): XToolkitExperimental = {
    val __obj = js.Dynamic.literal(ActiveTopWindow = ActiveTopWindow, DesktopWindow = DesktopWindow, OpenGLBufferSwapCounter = OpenGLBufferSwapCounter, TopWindowCount = TopWindowCount, WorkArea = WorkArea, acquire = js.Any.fromFunction0(acquire), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), createMessageBox = js.Any.fromFunction5(createMessageBox), createRegion = js.Any.fromFunction0(createRegion), createScreenCompatibleDevice = js.Any.fromFunction2(createScreenCompatibleDevice), createSystemChild = js.Any.fromFunction3(createSystemChild), createWindow = js.Any.fromFunction1(createWindow), createWindows = js.Any.fromFunction1(createWindows), fireFocusGained = js.Any.fromFunction1(fireFocusGained), fireFocusLost = js.Any.fromFunction1(fireFocusLost), getActiveTopWindow = js.Any.fromFunction0(getActiveTopWindow), getClipboard = js.Any.fromFunction1(getClipboard), getDesktopWindow = js.Any.fromFunction0(getDesktopWindow), getDragGestureRecognizer = js.Any.fromFunction1(getDragGestureRecognizer), getDragSource = js.Any.fromFunction1(getDragSource), getDropTarget = js.Any.fromFunction1(getDropTarget), getOpenGLBufferSwapCounter = js.Any.fromFunction0(getOpenGLBufferSwapCounter), getTopWindow = js.Any.fromFunction1(getTopWindow), getTopWindowCount = js.Any.fromFunction0(getTopWindowCount), getWorkArea = js.Any.fromFunction0(getWorkArea), pause = js.Any.fromFunction1(pause), processEventsToIdle = js.Any.fromFunction0(processEventsToIdle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), reschedule = js.Any.fromFunction0(reschedule), setDeterministicScheduling = js.Any.fromFunction1(setDeterministicScheduling))
  
    __obj.asInstanceOf[XToolkitExperimental]
  }
}

