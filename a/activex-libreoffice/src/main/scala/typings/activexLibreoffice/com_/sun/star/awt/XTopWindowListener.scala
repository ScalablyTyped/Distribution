package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive window events.
  * @see XActivateListener
  */
trait XTopWindowListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a window is activated. */
  def windowActivated(e: EventObject): Unit
  
  /** is invoked when a window has been closed. */
  def windowClosed(e: EventObject): Unit
  
  /**
    * is invoked when a window is in the process of being closed.
    *
    * The close operation can be overridden at this point.
    */
  def windowClosing(e: EventObject): Unit
  
  /** is invoked when a window is deactivated. */
  def windowDeactivated(e: EventObject): Unit
  
  /** is invoked when a window is iconified. */
  def windowMinimized(e: EventObject): Unit
  
  /** is invoked when a window is deiconified. */
  def windowNormalized(e: EventObject): Unit
  
  /** is invoked when a window has been opened. */
  def windowOpened(e: EventObject): Unit
}
object XTopWindowListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowActivated: EventObject => Unit,
    windowClosed: EventObject => Unit,
    windowClosing: EventObject => Unit,
    windowDeactivated: EventObject => Unit,
    windowMinimized: EventObject => Unit,
    windowNormalized: EventObject => Unit,
    windowOpened: EventObject => Unit
  ): XTopWindowListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowActivated = js.Any.fromFunction1(windowActivated), windowClosed = js.Any.fromFunction1(windowClosed), windowClosing = js.Any.fromFunction1(windowClosing), windowDeactivated = js.Any.fromFunction1(windowDeactivated), windowMinimized = js.Any.fromFunction1(windowMinimized), windowNormalized = js.Any.fromFunction1(windowNormalized), windowOpened = js.Any.fromFunction1(windowOpened))
    __obj.asInstanceOf[XTopWindowListener]
  }
  
  extension [Self <: XTopWindowListener](x: Self) {
    
    inline def setWindowActivated(value: EventObject => Unit): Self = StObject.set(x, "windowActivated", js.Any.fromFunction1(value))
    
    inline def setWindowClosed(value: EventObject => Unit): Self = StObject.set(x, "windowClosed", js.Any.fromFunction1(value))
    
    inline def setWindowClosing(value: EventObject => Unit): Self = StObject.set(x, "windowClosing", js.Any.fromFunction1(value))
    
    inline def setWindowDeactivated(value: EventObject => Unit): Self = StObject.set(x, "windowDeactivated", js.Any.fromFunction1(value))
    
    inline def setWindowMinimized(value: EventObject => Unit): Self = StObject.set(x, "windowMinimized", js.Any.fromFunction1(value))
    
    inline def setWindowNormalized(value: EventObject => Unit): Self = StObject.set(x, "windowNormalized", js.Any.fromFunction1(value))
    
    inline def setWindowOpened(value: EventObject => Unit): Self = StObject.set(x, "windowOpened", js.Any.fromFunction1(value))
  }
}
