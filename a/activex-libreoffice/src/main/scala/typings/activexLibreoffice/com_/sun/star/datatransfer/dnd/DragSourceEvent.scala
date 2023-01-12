package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is the base class for {@link DragSourceDragEvent} and {@link DragSourceDropEvent} .
  *
  * To access the {@link XDragSource} that originated this event, use the {@link com.sun.star.lang.EventObject.Source} member of this object.
  */
trait DragSourceEvent
  extends StObject
     with EventObject {
  
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
object DragSourceEvent {
  
  inline def apply(DragSource: XDragSource, DragSourceContext: XDragSourceContext, Source: XInterface): DragSourceEvent = {
    val __obj = js.Dynamic.literal(DragSource = DragSource.asInstanceOf[js.Any], DragSourceContext = DragSourceContext.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragSourceEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragSourceEvent] (val x: Self) extends AnyVal {
    
    inline def setDragSource(value: XDragSource): Self = StObject.set(x, "DragSource", value.asInstanceOf[js.Any])
    
    inline def setDragSourceContext(value: XDragSourceContext): Self = StObject.set(x, "DragSourceContext", value.asInstanceOf[js.Any])
  }
}
