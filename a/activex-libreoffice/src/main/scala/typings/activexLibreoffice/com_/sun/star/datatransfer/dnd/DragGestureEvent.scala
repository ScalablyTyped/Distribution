package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link DragGestureEvent} is passed to the method {@link XDragGestureListener.dragGestureRecognized()} when a particular {@link
  * XDragGestureRecognizer} detects that a platform dependent drag initiating gesture has occurred on the component that it is tracking.
  */
trait DragGestureEvent
  extends StObject
     with EventObject {
  
  /**
    * The action selected by the user.
    *
    * Different constants may be combined using a logical OR.
    *
    * It's further possible to combine the ACTION_DEFAULT with one of the other actions defined in {@link com.sun.star.datatransfer.dnd.DNDConstants} . This
    * means the user did not press any key during the Drag and Drop operation and the action that was combined with ACTION_DEFAULT is the system default
    * action.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DragAction: Double
  
  /** The x coordinate where the drag originated in component coordinates. */
  var DragOriginX: Double
  
  /** The y coordinate where the drag originated in component coordinates. */
  var DragOriginY: Double
  
  /** The DragSource associated with this drag action. */
  var DragSource: XDragSource
  
  /**
    * The last event comprising the gesture.
    *
    * The initial trigger event will presumably be a {@link com.sun.star.awt.MouseEvent} event. If it is not, the implementation should either react
    * accordingly or presume that the left mouse button was clicked.
    */
  var Event: js.Any
}
object DragGestureEvent {
  
  inline def apply(
    DragAction: Double,
    DragOriginX: Double,
    DragOriginY: Double,
    DragSource: XDragSource,
    Event: js.Any,
    Source: XInterface
  ): DragGestureEvent = {
    val __obj = js.Dynamic.literal(DragAction = DragAction.asInstanceOf[js.Any], DragOriginX = DragOriginX.asInstanceOf[js.Any], DragOriginY = DragOriginY.asInstanceOf[js.Any], DragSource = DragSource.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragGestureEvent]
  }
  
  extension [Self <: DragGestureEvent](x: Self) {
    
    inline def setDragAction(value: Double): Self = StObject.set(x, "DragAction", value.asInstanceOf[js.Any])
    
    inline def setDragOriginX(value: Double): Self = StObject.set(x, "DragOriginX", value.asInstanceOf[js.Any])
    
    inline def setDragOriginY(value: Double): Self = StObject.set(x, "DragOriginY", value.asInstanceOf[js.Any])
    
    inline def setDragSource(value: XDragSource): Self = StObject.set(x, "DragSource", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: js.Any): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
  }
}
