package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.datatransfer.clipboard.XClipboard
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDragGestureRecognizer
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDragSource
import typings.activexLibreoffice.com_.sun.star.datatransfer.dnd.XDropTarget
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Work in progress, don't use unless you know what you are doing. */
trait XToolkitExperimental
  extends StObject
     with XToolkit2 {
  
  /** Get the number of OpenGL buffer swaps. */
  val OpenGLBufferSwapCounter: Double
  
  /** Get the number of OpenGL buffer swaps. */
  def getOpenGLBufferSwapCounter(): Double
  
  /** Pause the main thread of LibreOffice for the requested amount of time. */
  def pause(nMilliseconds: Double): Unit
  
  /** Process all pending idle events */
  def processEventsToIdle(): Unit
  
  /** Turn on or off deterministic scheduling (off is the default). */
  def setDeterministicScheduling(bDeterministicMode: Boolean): Unit
}
object XToolkitExperimental {
  
  inline def apply(
    ActiveTopWindow: XTopWindow,
    DesktopWindow: XWindowPeer,
    OpenGLBufferSwapCounter: Double,
    TopWindowCount: Double,
    WorkArea: Rectangle,
    acquire: () => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyHandler: XKeyHandler => Unit,
    addTopWindowListener: XTopWindowListener => Unit,
    createMessageBox: (XWindowPeer, MessageBoxType, Double, String, String) => XMessageBox,
    createRegion: () => XRegion,
    createScreenCompatibleDevice: (Double, Double) => XDevice,
    createSystemChild: (Any, SeqEquiv[Double], Double) => XWindowPeer,
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
    getOpenGLBufferSwapCounter: () => Double,
    getTopWindow: Double => XTopWindow,
    getTopWindowCount: () => Double,
    getWorkArea: () => Rectangle,
    pause: Double => Unit,
    processEventsToIdle: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyHandler: XKeyHandler => Unit,
    removeTopWindowListener: XTopWindowListener => Unit,
    reschedule: () => Unit,
    setDeterministicScheduling: Boolean => Unit
  ): XToolkitExperimental = {
    val __obj = js.Dynamic.literal(ActiveTopWindow = ActiveTopWindow.asInstanceOf[js.Any], DesktopWindow = DesktopWindow.asInstanceOf[js.Any], OpenGLBufferSwapCounter = OpenGLBufferSwapCounter.asInstanceOf[js.Any], TopWindowCount = TopWindowCount.asInstanceOf[js.Any], WorkArea = WorkArea.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), createMessageBox = js.Any.fromFunction5(createMessageBox), createRegion = js.Any.fromFunction0(createRegion), createScreenCompatibleDevice = js.Any.fromFunction2(createScreenCompatibleDevice), createSystemChild = js.Any.fromFunction3(createSystemChild), createWindow = js.Any.fromFunction1(createWindow), createWindows = js.Any.fromFunction1(createWindows), fireFocusGained = js.Any.fromFunction1(fireFocusGained), fireFocusLost = js.Any.fromFunction1(fireFocusLost), getActiveTopWindow = js.Any.fromFunction0(getActiveTopWindow), getClipboard = js.Any.fromFunction1(getClipboard), getDesktopWindow = js.Any.fromFunction0(getDesktopWindow), getDragGestureRecognizer = js.Any.fromFunction1(getDragGestureRecognizer), getDragSource = js.Any.fromFunction1(getDragSource), getDropTarget = js.Any.fromFunction1(getDropTarget), getOpenGLBufferSwapCounter = js.Any.fromFunction0(getOpenGLBufferSwapCounter), getTopWindow = js.Any.fromFunction1(getTopWindow), getTopWindowCount = js.Any.fromFunction0(getTopWindowCount), getWorkArea = js.Any.fromFunction0(getWorkArea), pause = js.Any.fromFunction1(pause), processEventsToIdle = js.Any.fromFunction0(processEventsToIdle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), reschedule = js.Any.fromFunction0(reschedule), setDeterministicScheduling = js.Any.fromFunction1(setDeterministicScheduling))
    __obj.asInstanceOf[XToolkitExperimental]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XToolkitExperimental] (val x: Self) extends AnyVal {
    
    inline def setGetOpenGLBufferSwapCounter(value: () => Double): Self = StObject.set(x, "getOpenGLBufferSwapCounter", js.Any.fromFunction0(value))
    
    inline def setOpenGLBufferSwapCounter(value: Double): Self = StObject.set(x, "OpenGLBufferSwapCounter", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Double => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    inline def setProcessEventsToIdle(value: () => Unit): Self = StObject.set(x, "processEventsToIdle", js.Any.fromFunction0(value))
    
    inline def setSetDeterministicScheduling(value: Boolean => Unit): Self = StObject.set(x, "setDeterministicScheduling", js.Any.fromFunction1(value))
  }
}
