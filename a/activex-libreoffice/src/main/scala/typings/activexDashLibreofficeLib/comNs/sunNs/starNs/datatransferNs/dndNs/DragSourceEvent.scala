package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.dndNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is the base class for {@link DragSourceDragEvent} and {@link DragSourceDropEvent} .
  *
  * To access the {@link XDragSource} that originated this event, use the {@link com.sun.star.lang.EventObject.Source} member of this object.
  */
trait DragSourceEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * The drag source on which the Drag and Drop operation was initiated.
    * @see com.sun.star.datatransfer.dnd.XDragSource
    */
  var DragSource: XDragSource
  /**
    * The drag source context of the current drag operation.
    * @see com.sun.star.datatransfer.dnd.XDragSourceContext
    */
  var DragSourceContext: XDragSourceContext
}

