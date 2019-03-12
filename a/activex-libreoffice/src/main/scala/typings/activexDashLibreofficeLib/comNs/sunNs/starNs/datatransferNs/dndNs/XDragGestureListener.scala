package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface will be used by a {@link XDragGestureRecognizer} when it detects a drag initiating gesture.
  *
  * The implementor of this interface is responsible for starting the drag as a result of receiving such notification.
  */
trait XDragGestureListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * A {@link XDragGestureRecognizer} has detected a platform-dependent drag initiating gesture and is notifying this listener in order for it to initiate
    * the action for the user.
    * @param dge The {@link DragGestureEvent} describing the gesture that has just occurred.
    */
  def dragGestureRecognized(dge: DragGestureEvent): scala.Unit
}

object XDragGestureListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    dragGestureRecognized: DragGestureEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDragGestureListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), dragGestureRecognized = js.Any.fromFunction1(dragGestureRecognized), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDragGestureListener]
  }
}

