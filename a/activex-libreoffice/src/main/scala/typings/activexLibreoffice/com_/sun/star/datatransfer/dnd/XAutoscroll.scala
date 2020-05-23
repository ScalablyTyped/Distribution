package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for autoscroll support.
  *
  * During Drag and Drop operations it is possible that a user may wish to drop the subject of the operation on a region of a scrollable GUI control that
  * is not currently visible to the user.
  *
  * In such situations it is desirable that the GUI control detect this and institute a scroll operation in order to make obscured region(s) visible to
  * the user. This feature is known as autoscrolling.
  *
  * If a GUI control is both an active DropTarget and is also scrollable, it can receive notifications of autoscrolling gestures by the user from the Drag
  * and Drop system by implementing this interface.
  *
  * An autoscrolling gesture is initiated by the user by keeping the drag cursor motionless with a border region of the Component, referred to as the
  * "autoscrolling region", for a predefined period of time, this will result in repeated scroll requests to the Component until the drag Cursor resumes
  * its motion.
  */
trait XAutoscroll extends XInterface {
  /**
    * Returns the regions describing the autoscrolling region.
    * @returns The regions describing the autoscrolling region or border relative to the geometry of the implementing component.
    */
  val AutoscrollRegion: js.Any
  /**
    * Notify the component to autoscroll.
    * @param cursorLocationX X location of the cursor in pixel.
    * @param cursorLocationY Y location of the cursor in pixel.
    */
  def autoscroll(cursorLocationX: Double, cursorLocationY: Double): Unit
  /**
    * Returns the regions describing the autoscrolling region.
    * @returns The regions describing the autoscrolling region or border relative to the geometry of the implementing component.
    */
  def getAutoscrollRegion(): js.Any
}

object XAutoscroll {
  @scala.inline
  def apply(
    AutoscrollRegion: js.Any,
    acquire: () => Unit,
    autoscroll: (Double, Double) => Unit,
    getAutoscrollRegion: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAutoscroll = {
    val __obj = js.Dynamic.literal(AutoscrollRegion = AutoscrollRegion.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), autoscroll = js.Any.fromFunction2(autoscroll), getAutoscrollRegion = js.Any.fromFunction0(getAutoscrollRegion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAutoscroll]
  }
}

