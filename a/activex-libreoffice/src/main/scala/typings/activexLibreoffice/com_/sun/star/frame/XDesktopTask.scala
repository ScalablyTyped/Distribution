package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XFrame} instead of this
  * @deprecated Deprecated
  */
trait XDesktopTask
  extends StObject
     with XComponent {
  
  /**
    * use {@link com.sun.star.util.XCloseable} or {@link com.sun.star.lang.XComponent.dispose()} instead.
    * @deprecated Deprecated
    */
  def close(): Boolean
  
  /**
    * use {@link com.sun.star.lang.XInitialization} instead.
    * @deprecated Deprecated
    */
  def initialize(TaskWindow: XWindow): Unit
}
object XDesktopTask {
  
  inline def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    close: () => Boolean,
    dispose: () => Unit,
    initialize: XWindow => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XDesktopTask = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XDesktopTask]
  }
  
  extension [Self <: XDesktopTask](x: Self) {
    
    inline def setClose(value: () => Boolean): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: XWindow => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
  }
}
