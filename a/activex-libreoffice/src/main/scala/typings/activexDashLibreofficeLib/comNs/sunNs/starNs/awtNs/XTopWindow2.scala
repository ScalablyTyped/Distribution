package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

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
  var Display: scala.Double
  /** controls whether the window is currently maximized */
  var IsMaximized: scala.Boolean
  /** controls whether the window is currently minimized */
  var IsMinimized: scala.Boolean
}

