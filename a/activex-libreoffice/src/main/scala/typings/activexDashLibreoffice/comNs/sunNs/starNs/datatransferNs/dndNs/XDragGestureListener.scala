package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.dndNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface will be used by a {@link XDragGestureRecognizer} when it detects a drag initiating gesture.
  *
  * The implementor of this interface is responsible for starting the drag as a result of receiving such notification.
  */
trait XDragGestureListener extends XEventListener {
  /**
    * A {@link XDragGestureRecognizer} has detected a platform-dependent drag initiating gesture and is notifying this listener in order for it to initiate
    * the action for the user.
    * @param dge The {@link DragGestureEvent} describing the gesture that has just occurred.
    */
  def dragGestureRecognized(dge: DragGestureEvent): Unit
}

object XDragGestureListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    dragGestureRecognized: DragGestureEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDragGestureListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), dragGestureRecognized = js.Any.fromFunction1(dragGestureRecognized), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDragGestureListener]
  }
}

