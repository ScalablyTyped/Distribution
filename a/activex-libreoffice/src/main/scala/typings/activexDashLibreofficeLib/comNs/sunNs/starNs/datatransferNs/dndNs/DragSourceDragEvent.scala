package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link DragSourceDragEvent} is delivered from an object that implements the {@link XDragSourceContext} to the currently registered drag source
  * listener.
  *
  * It contains state regarding the current state of the operation to enable the operations initiator to provide the end user with the appropriate drag
  * over feedback.
  * @see com.sun.star.datatransfer.dnd.XDragSourceListener
  */
trait DragSourceDragEvent extends DragSourceEvent {
  /**
    * The drag action selected by the current drop target.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DropAction: scala.Double
  /**
    * The user's currently selected drop action.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var UserAction: scala.Double
}

