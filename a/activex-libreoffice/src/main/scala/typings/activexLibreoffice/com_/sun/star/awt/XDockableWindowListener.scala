package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive docking events. */
trait XDockableWindowListener extends XEventListener {
  /** is invoked when the window was actively closed */
  def closed(e: EventObject): Unit
  /**
    * is invoked during the docking procedure when the window has been moved.
    *
    * on return the {@link DockingData} must contain either the old tracking rectangle or a changed rectangle if required, additionally it must indicate if
    * the window should be docked or floating
    *
    * Note: the tracking rectangle indicates to the user where the window would be placed if they release the mouse.
    */
  def docking(e: DockingEvent): DockingData
  /** is invoked when the docking procedure ends. aWindowRect contains the new position and size of the window */
  def endDocking(e: EndDockingEvent): Unit
  /** is invoked when the window currently is in pop-up mode and wants to be undocked or closed */
  def endPopupMode(e: EndPopupModeEvent): Unit
  /**
    * is invoked when the floating mode is about to be changed between floating and docked or vice versa
    *
    * if returned FALSE the floating mode will not be changed
    */
  def prepareToggleFloatingMode(e: EventObject): Boolean
  /** is invoked when the docking procedure starts. */
  def startDocking(e: DockingEvent): Unit
  /** is invoked when the floating mode is changed between floating and docked or vice versa */
  def toggleFloatingMode(e: EventObject): Unit
}

object XDockableWindowListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    closed: EventObject => Unit,
    disposing: EventObject => Unit,
    docking: DockingEvent => DockingData,
    endDocking: EndDockingEvent => Unit,
    endPopupMode: EndPopupModeEvent => Unit,
    prepareToggleFloatingMode: EventObject => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startDocking: DockingEvent => Unit,
    toggleFloatingMode: EventObject => Unit
  ): XDockableWindowListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closed = js.Any.fromFunction1(closed), disposing = js.Any.fromFunction1(disposing), docking = js.Any.fromFunction1(docking), endDocking = js.Any.fromFunction1(endDocking), endPopupMode = js.Any.fromFunction1(endPopupMode), prepareToggleFloatingMode = js.Any.fromFunction1(prepareToggleFloatingMode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startDocking = js.Any.fromFunction1(startDocking), toggleFloatingMode = js.Any.fromFunction1(toggleFloatingMode))
    __obj.asInstanceOf[XDockableWindowListener]
  }
}

