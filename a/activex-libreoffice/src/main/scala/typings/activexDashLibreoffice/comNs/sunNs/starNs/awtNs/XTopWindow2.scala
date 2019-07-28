package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends {@link XTopWindow} with additional functionality */
trait XTopWindow2 extends XTopWindow {
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
  @scala.inline
  def apply(
    Display: Double,
    IsMaximized: Boolean,
    IsMinimized: Boolean,
    acquire: () => Unit,
    addTopWindowListener: XTopWindowListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTopWindowListener: XTopWindowListener => Unit,
    setMenuBar: XMenuBar => Unit,
    toBack: () => Unit,
    toFront: () => Unit
  ): XTopWindow2 = {
    val __obj = js.Dynamic.literal(Display = Display, IsMaximized = IsMaximized, IsMinimized = IsMinimized, acquire = js.Any.fromFunction0(acquire), addTopWindowListener = js.Any.fromFunction1(addTopWindowListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTopWindowListener = js.Any.fromFunction1(removeTopWindowListener), setMenuBar = js.Any.fromFunction1(setMenuBar), toBack = js.Any.fromFunction0(toBack), toFront = js.Any.fromFunction0(toFront))
  
    __obj.asInstanceOf[XTopWindow2]
  }
}

