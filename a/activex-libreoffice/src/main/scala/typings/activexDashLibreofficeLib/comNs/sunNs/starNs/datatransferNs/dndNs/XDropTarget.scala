package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by a view or window that supports drop operations.
  *
  * Differently to Java, the association between view and interface is fixed and cannot be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a performance issue.
  */
trait XDropTarget
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Determine the actions supported by a drop target.
    * @returns The current action or actions supported by this drop target.  By default this will include all drag and drop actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DefaultActions: scala.Double
  /**
    * Add a DropTargetListener.
    *
    * The listener will be queried for the {@link XAutoscroll} interface to see if it supports autoscrolling.
    * @param dtl The listener to add to the notification list.
    */
  def addDropTargetListener(dtl: XDropTargetListener): scala.Unit
  /**
    * Determine the actions supported by a drop target.
    * @returns The current action or actions supported by this drop target.  By default this will include all drag and drop actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  def getDefaultActions(): scala.Double
  /**
    * Indicates either a drop target object is active or not.
    * @returns A boolean indicating whether or not this drop target object is currently active, that is ready to accept drops.
    */
  def isActive(): scala.Boolean
  /**
    * Remove a drop target listener.
    * @param dtl The listener to remove from notification list.
    */
  def removeDropTargetListener(dtl: XDropTargetListener): scala.Unit
  /**
    * Sets the drop target object active or inactive.
    * @param active A value of `TRUE` sets the drop target object active. A value of `FALSE` sets the drop target object inactive.
    */
  def setActive(active: scala.Boolean): scala.Unit
  /**
    * Sets the default acceptable actions for this drop target.
    *
    * This method is a way to reduce the number of Drag and Drop events by blocking events for actions not supported by this target.
    *
    * By default the listener will receive notifications for all actions.
    * @param actions The actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  def setDefaultActions(actions: scala.Double): scala.Unit
}

object XDropTarget {
  @scala.inline
  def apply(
    DefaultActions: scala.Double,
    acquire: js.Function0[scala.Unit],
    addDropTargetListener: js.Function1[XDropTargetListener, scala.Unit],
    getDefaultActions: js.Function0[scala.Double],
    isActive: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDropTargetListener: js.Function1[XDropTargetListener, scala.Unit],
    setActive: js.Function1[scala.Boolean, scala.Unit],
    setDefaultActions: js.Function1[scala.Double, scala.Unit]
  ): XDropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultActions")(DefaultActions)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDropTargetListener")(addDropTargetListener)
    __obj.updateDynamic("getDefaultActions")(getDefaultActions)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDropTargetListener")(removeDropTargetListener)
    __obj.updateDynamic("setActive")(setActive)
    __obj.updateDynamic("setDefaultActions")(setDefaultActions)
    __obj.asInstanceOf[XDropTarget]
  }
}

