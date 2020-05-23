package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by a view or window that supports drop operations.
  *
  * Differently to Java, the association between view and interface is fixed and cannot be changed. Otherwise, the AWT messaging would have to be
  * implemented for any window supporting Drag and Drop operations, which would be a performance issue.
  */
trait XDropTarget extends XInterface {
  /**
    * Determine the actions supported by a drop target.
    * @returns The current action or actions supported by this drop target.  By default this will include all drag and drop actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DefaultActions: Double
  /**
    * Add a DropTargetListener.
    *
    * The listener will be queried for the {@link XAutoscroll} interface to see if it supports autoscrolling.
    * @param dtl The listener to add to the notification list.
    */
  def addDropTargetListener(dtl: XDropTargetListener): Unit
  /**
    * Determine the actions supported by a drop target.
    * @returns The current action or actions supported by this drop target.  By default this will include all drag and drop actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  def getDefaultActions(): Double
  /**
    * Indicates either a drop target object is active or not.
    * @returns A boolean indicating whether or not this drop target object is currently active, that is ready to accept drops.
    */
  def isActive(): Boolean
  /**
    * Remove a drop target listener.
    * @param dtl The listener to remove from notification list.
    */
  def removeDropTargetListener(dtl: XDropTargetListener): Unit
  /**
    * Sets the drop target object active or inactive.
    * @param active A value of `TRUE` sets the drop target object active. A value of `FALSE` sets the drop target object inactive.
    */
  def setActive(active: Boolean): Unit
  /**
    * Sets the default acceptable actions for this drop target.
    *
    * This method is a way to reduce the number of Drag and Drop events by blocking events for actions not supported by this target.
    *
    * By default the listener will receive notifications for all actions.
    * @param actions The actions.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  def setDefaultActions(actions: Double): Unit
}

object XDropTarget {
  @scala.inline
  def apply(
    DefaultActions: Double,
    acquire: () => Unit,
    addDropTargetListener: XDropTargetListener => Unit,
    getDefaultActions: () => Double,
    isActive: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDropTargetListener: XDropTargetListener => Unit,
    setActive: Boolean => Unit,
    setDefaultActions: Double => Unit
  ): XDropTarget = {
    val __obj = js.Dynamic.literal(DefaultActions = DefaultActions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDropTargetListener = js.Any.fromFunction1(addDropTargetListener), getDefaultActions = js.Any.fromFunction0(getDefaultActions), isActive = js.Any.fromFunction0(isActive), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDropTargetListener = js.Any.fromFunction1(removeDropTargetListener), setActive = js.Any.fromFunction1(setActive), setDefaultActions = js.Any.fromFunction1(setDefaultActions))
    __obj.asInstanceOf[XDropTarget]
  }
}

