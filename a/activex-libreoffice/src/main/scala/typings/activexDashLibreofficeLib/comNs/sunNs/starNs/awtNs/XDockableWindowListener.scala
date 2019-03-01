package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive docking events. */
trait XDockableWindowListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when the window was actively closed */
  def closed(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is invoked during the docking procedure when the window has been moved.
    *
    * on return the {@link DockingData} must contain either the old tracking rectangle or a changed rectangle if required, additionally it must indicate if
    * the window should be docked or floating
    *
    * Note: the tracking rectangle indicates to the user where the window would be placed if he releases the mouse.
    */
  def docking(e: DockingEvent): DockingData
  /** is invoked when the docking procedure ends. aWindowRect contains the new position and size of the window */
  def endDocking(e: EndDockingEvent): scala.Unit
  /** is invoked when the window currently is in pop-up mode and wants to be undocked or closed */
  def endPopupMode(e: EndPopupModeEvent): scala.Unit
  /**
    * is invoked when the floating mode is about to be changed between floating and docked or vice versa
    *
    * if returned FALSE the floating mode will not be changed
    */
  def prepareToggleFloatingMode(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Boolean
  /** is invoked when the docking procedure starts. */
  def startDocking(e: DockingEvent): scala.Unit
  /** is invoked when the floating mode is changed between floating and docked or vice versa */
  def toggleFloatingMode(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XDockableWindowListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    closed: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    docking: js.Function1[DockingEvent, DockingData],
    endDocking: js.Function1[EndDockingEvent, scala.Unit],
    endPopupMode: js.Function1[EndPopupModeEvent, scala.Unit],
    prepareToggleFloatingMode: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    startDocking: js.Function1[DockingEvent, scala.Unit],
    toggleFloatingMode: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit]
  ): XDockableWindowListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("docking")(docking)
    __obj.updateDynamic("endDocking")(endDocking)
    __obj.updateDynamic("endPopupMode")(endPopupMode)
    __obj.updateDynamic("prepareToggleFloatingMode")(prepareToggleFloatingMode)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("startDocking")(startDocking)
    __obj.updateDynamic("toggleFloatingMode")(toggleFloatingMode)
    __obj.asInstanceOf[XDockableWindowListener]
  }
}

