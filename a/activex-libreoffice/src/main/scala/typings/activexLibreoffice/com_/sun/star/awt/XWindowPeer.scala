package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the actual window implementation on the device. */
@js.native
trait XWindowPeer extends XComponent {
  
  /** returns the toolkit which created this object. */
  val Toolkit: XToolkit = js.native
  
  /** returns the toolkit which created this object. */
  def getToolkit(): XToolkit = js.native
  
  /**
    * invalidates the whole window with the specified {@link InvalidateStyle} .
    * @param Flags see {@link com.sun.star.awt.InvalidateStyle}
    */
  def invalidate(Flags: Double): Unit = js.native
  
  /**
    * invalidates a rectangular area of the window with the specified {@link InvalidateStyle} .
    * @param Rect the area to invalidate.
    * @param Flags see {@link com.sun.star.awt.InvalidateStyle}
    */
  def invalidateRect(Rect: Rectangle, Flags: Double): Unit = js.native
  
  /** sets the background color. */
  def setBackground(Color: Color): Unit = js.native
  
  /** sets the mouse pointer. */
  def setPointer(Pointer: XPointer): Unit = js.native
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
    val __obj = js.Dynamic.literal(Toolkit = Toolkit.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getToolkit = js.Any.fromFunction0(getToolkit), invalidate = js.Any.fromFunction1(invalidate), invalidateRect = js.Any.fromFunction2(invalidateRect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setBackground = js.Any.fromFunction1(setBackground), setPointer = js.Any.fromFunction1(setPointer))
    __obj.asInstanceOf[XWindowPeer]
  }
  
  @scala.inline
  implicit class XWindowPeerMutableBuilder[Self <: XWindowPeer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetToolkit(value: () => XToolkit): Self = StObject.set(x, "getToolkit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvalidate(value: Double => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvalidateRect(value: (Rectangle, Double) => Unit): Self = StObject.set(x, "invalidateRect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetBackground(value: Color => Unit): Self = StObject.set(x, "setBackground", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPointer(value: XPointer => Unit): Self = StObject.set(x, "setPointer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToolkit(value: XToolkit): Self = StObject.set(x, "Toolkit", value.asInstanceOf[js.Any])
  }
}
