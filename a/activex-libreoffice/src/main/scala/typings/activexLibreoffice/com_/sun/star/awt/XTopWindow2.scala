package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends {@link XTopWindow} with additional functionality */
trait XTopWindow2
  extends StObject
     with XTopWindow {
  
  /**
    * controls on which display the window is shown.
    *
    * When retrieving this property, in case the window is positioned on multiple displays, the number returned will be of the display containing the upper
    * left pixel of the frame area (that is of the client area on system decorated windows, or the frame area of undecorated resp. owner decorated windows).
    * @see com.sun.star.awt.DisplayAccess
    * @see com.sun.star.awt.DisplayInfo
    * @throws com::sun::star::lang::IndexOutOfBoundsException if you attempt to set this property to a value which does not correspond to the number of an exis
    */
  var Display: Double
  
  /** controls whether the window is currently maximized */
  var IsMaximized: Boolean
  
  /** controls whether the window is currently minimized */
  var IsMinimized: Boolean
}
object XTopWindow2 {
  
  inline def apply(
    Display: Double,
    IsMaximized: Boolean,
    IsMinimized: Boolean,
    acquire: () => Unit,
    addTopWindowListener: XTopWindowListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeTopWindowListener: XTopWindowListener => Unit,
    setMenuBar: XMenuBar => Unit,
    toBack: () => Unit,
    toFront: () => Unit
  ): XTopWindow2 = {
    val __obj = js.Dynamic.literal(Display = Display.asInstanceOf[js.Any], IsMaximized = IsMaximized.asInstanceOf[js.Any], IsMinimized = IsMinimized.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), setMenuBar = js.Any.fromFunction1(setMenuBar), toBack = js.Any.fromFunction0(toBack), toFront = js.Any.fromFunction0(toFront))
    __obj.asInstanceOf[XTopWindow2]
  }
  
  extension [Self <: XTopWindow2](x: Self) {
    
    inline def setDisplay(value: Double): Self = StObject.set(x, "Display", value.asInstanceOf[js.Any])
    
    inline def setIsMaximized(value: Boolean): Self = StObject.set(x, "IsMaximized", value.asInstanceOf[js.Any])
    
    inline def setIsMinimized(value: Boolean): Self = StObject.set(x, "IsMinimized", value.asInstanceOf[js.Any])
  }
}
