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

object XTopWindow2 {
  @scala.inline
  def apply(
    Display: scala.Double,
    IsMaximized: scala.Boolean,
    IsMinimized: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    addTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTopWindowListener: js.Function1[XTopWindowListener, scala.Unit],
    setMenuBar: js.Function1[XMenuBar, scala.Unit],
    toBack: js.Function0[scala.Unit],
    toFront: js.Function0[scala.Unit]
  ): XTopWindow2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Display")(Display)
    __obj.updateDynamic("IsMaximized")(IsMaximized)
    __obj.updateDynamic("IsMinimized")(IsMinimized)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addTopWindowListener")(addTopWindowListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeTopWindowListener")(removeTopWindowListener)
    __obj.updateDynamic("setMenuBar")(setMenuBar)
    __obj.updateDynamic("toBack")(toBack)
    __obj.updateDynamic("toFront")(toFront)
    __obj.asInstanceOf[XTopWindow2]
  }
}

