package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive window events.
  *
  * Component events are provided **only** for notification purposes. Moves and resizes will be handled internally by the window component, so that GUI
  * layout works properly regardless of whether a program registers such a listener or not.
  */
@js.native
trait XWindowListener extends XEventListener {
  
  /** is invoked when the window has been hidden. */
  def windowHidden(e: EventObject): Unit = js.native
  
  /** is invoked when the window has been moved. */
  def windowMoved(e: WindowEvent): Unit = js.native
  
  /** is invoked when the window has been resized. */
  def windowResized(e: WindowEvent): Unit = js.native
  
  /** is invoked when the window has been shown. */
  def windowShown(e: EventObject): Unit = js.native
}
object XWindowListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowHidden: EventObject => Unit,
    windowMoved: WindowEvent => Unit,
    windowResized: WindowEvent => Unit,
    windowShown: EventObject => Unit
  ): XWindowListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowHidden = js.Any.fromFunction1(windowHidden), windowMoved = js.Any.fromFunction1(windowMoved), windowResized = js.Any.fromFunction1(windowResized), windowShown = js.Any.fromFunction1(windowShown))
    __obj.asInstanceOf[XWindowListener]
  }
  
  @scala.inline
  implicit class XWindowListenerMutableBuilder[Self <: XWindowListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowHidden(value: EventObject => Unit): Self = StObject.set(x, "windowHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindowMoved(value: WindowEvent => Unit): Self = StObject.set(x, "windowMoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindowResized(value: WindowEvent => Unit): Self = StObject.set(x, "windowResized", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindowShown(value: EventObject => Unit): Self = StObject.set(x, "windowShown", js.Any.fromFunction1(value))
  }
}
