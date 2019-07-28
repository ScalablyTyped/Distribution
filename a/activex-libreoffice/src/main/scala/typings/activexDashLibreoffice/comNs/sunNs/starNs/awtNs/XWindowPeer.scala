package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the actual window implementation on the device. */
trait XWindowPeer extends XComponent {
  /** returns the toolkit which created this object. */
  val Toolkit: XToolkit
  /** returns the toolkit which created this object. */
  def getToolkit(): XToolkit
  /**
    * invalidates the whole window with the specified {@link InvalidateStyle} .
    * @param Flags see {@link com.sun.star.awt.InvalidateStyle}
    */
  def invalidate(Flags: Double): Unit
  /**
    * invalidates a rectangular area of the window with the specified {@link InvalidateStyle} .
    * @param Rect the area to invalidate.
    * @param Flags see {@link com.sun.star.awt.InvalidateStyle}
    */
  def invalidateRect(Rect: Rectangle, Flags: Double): Unit
  /** sets the background color. */
  def setBackground(Color: Color): Unit
  /** sets the mouse pointer. */
  def setPointer(Pointer: XPointer): Unit
}

object XWindowPeer {
  @scala.inline
  def apply(
    Toolkit: XToolkit,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getToolkit: () => XToolkit,
    invalidate: Double => Unit,
    invalidateRect: (Rectangle, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setBackground: Color => Unit,
    setPointer: XPointer => Unit
  ): XWindowPeer = {
    val __obj = js.Dynamic.literal(Toolkit = Toolkit, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getToolkit = js.Any.fromFunction0(getToolkit), invalidate = js.Any.fromFunction1(invalidate), invalidateRect = js.Any.fromFunction2(invalidateRect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setBackground = js.Any.fromFunction1(setBackground), setPointer = js.Any.fromFunction1(setPointer))
  
    __obj.asInstanceOf[XWindowPeer]
  }
}

