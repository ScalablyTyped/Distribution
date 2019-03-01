package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the docking interface for a window component.
  *
  * A window can either be docked where it resides as a child window in an application frame window or it can be floating where it will reside in its own
  * decorated top level window.
  */
trait XDockableWindow
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds a docking listener to the object. only a single listener may be registered at any time. */
  def addDockableWindowListener(xListener: XDockableWindowListener): scala.Unit
  /**
    * enable or disable docking, docking is disabled by default
    * @param bEnable `TRUE` specifies that docking is enabled `FALSE` specifies that docking is disabled and no {@link com.sun.star.awt.XDockableWindowListene
    */
  def enableDocking(bEnable: scala.Boolean): scala.Unit
  /**
    * queries the current window state
    * @returns `TRUE` if the window is floating `FALSE` if the window is docked
    */
  def isFloating(): scala.Boolean
  /**
    * queries the current pop-up mode
    * @returns `TRUE` if the window is in pop-up mode `FALSE` if the window is not in pop-up mode
    */
  def isInPopupMode(): scala.Boolean
  /**
    * queries the current locking state
    * @returns `TRUE` if the window is locked `FALSE` if the window is not locked
    */
  def isLocked(): scala.Boolean
  /** prevents the window from being undocked this has no effect if the window is floating */
  def lock(): scala.Unit
  /** removes the specified docking listener from the object. */
  def removeDockableWindowListener(xListener: XDockableWindowListener): scala.Unit
  /**
    * toggle between floating and docked state
    * @param bFloating specifies the new floating mode: `TRUE` means floating, `FALSE` means docked
    */
  def setFloatingMode(bFloating: scala.Boolean): scala.Unit
  /**
    * shows the window in a menu like style, i.e. without decoration a special indicator will allow for tearing off the window see {@link
    * com.sun.star.awt.XDockableWindowListener} for the corresponding events
    * @param WindowRect specifies the position and size of the pop-up window in frame coordinates
    */
  def startPopupMode(WindowRect: Rectangle): scala.Unit
  /** enables undocking this has no effect if the window is floating */
  def unlock(): scala.Unit
}

object XDockableWindow {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addDockableWindowListener: js.Function1[XDockableWindowListener, scala.Unit],
    enableDocking: js.Function1[scala.Boolean, scala.Unit],
    isFloating: js.Function0[scala.Boolean],
    isInPopupMode: js.Function0[scala.Boolean],
    isLocked: js.Function0[scala.Boolean],
    lock: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDockableWindowListener: js.Function1[XDockableWindowListener, scala.Unit],
    setFloatingMode: js.Function1[scala.Boolean, scala.Unit],
    startPopupMode: js.Function1[Rectangle, scala.Unit],
    unlock: js.Function0[scala.Unit]
  ): XDockableWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDockableWindowListener")(addDockableWindowListener)
    __obj.updateDynamic("enableDocking")(enableDocking)
    __obj.updateDynamic("isFloating")(isFloating)
    __obj.updateDynamic("isInPopupMode")(isInPopupMode)
    __obj.updateDynamic("isLocked")(isLocked)
    __obj.updateDynamic("lock")(lock)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDockableWindowListener")(removeDockableWindowListener)
    __obj.updateDynamic("setFloatingMode")(setFloatingMode)
    __obj.updateDynamic("startPopupMode")(startPopupMode)
    __obj.updateDynamic("unlock")(unlock)
    __obj.asInstanceOf[XDockableWindow]
  }
}

