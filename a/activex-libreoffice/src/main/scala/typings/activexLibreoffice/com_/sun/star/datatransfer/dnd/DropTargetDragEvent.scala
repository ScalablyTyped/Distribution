package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link DropTargetDragEvent} is delivered from the drop target to the currently registered drop target listener.
  *
  * It contains information regarding the current state of the operation to enable the operations initiator to provide the end user with the appropriate
  * drag over feedback.
  * @see com.sun.star.datatransfer.dnd.XDropTargetListener
  */
trait DropTargetDragEvent
  extends StObject
     with DropTargetEvent {
  
  /**
    * The drop target context of the current drag operation.
    * @see com.sun.star.datatransfer.dnd.XDropTargetDragContext
    */
  var Context: XDropTargetDragContext
  
  /**
    * This value represents the currently selected drop action.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var DropAction: Double
  
  /** The cursor's current x location within the window's coordinates. */
  var LocationX: Double
  
  /** The cursor's current y location within the window's coordinates. */
  var LocationY: Double
  
  /**
    * This value represents the action or actions supported by the source. This may be a combination of arbitrary source actions except ACTION_DEFAULT.
    *
    * To combine different actions use a logical OR.
    * @see com.sun.star.datatransfer.dnd.DNDConstants
    */
  var SourceActions: Double
}
object DropTargetDragEvent {
  
  inline def apply(
    Context: XDropTargetDragContext,
    DropAction: Double,
    Dummy: Double,
    LocationX: Double,
    LocationY: Double,
    Source: XInterface,
    SourceActions: Double
  ): DropTargetDragEvent = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DropAction = DropAction.asInstanceOf[js.Any], Dummy = Dummy.asInstanceOf[js.Any], LocationX = LocationX.asInstanceOf[js.Any], LocationY = LocationY.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], SourceActions = SourceActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetDragEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropTargetDragEvent] (val x: Self) extends AnyVal {
    
    inline def setContext(value: XDropTargetDragContext): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setDropAction(value: Double): Self = StObject.set(x, "DropAction", value.asInstanceOf[js.Any])
    
    inline def setLocationX(value: Double): Self = StObject.set(x, "LocationX", value.asInstanceOf[js.Any])
    
    inline def setLocationY(value: Double): Self = StObject.set(x, "LocationY", value.asInstanceOf[js.Any])
    
    inline def setSourceActions(value: Double): Self = StObject.set(x, "SourceActions", value.asInstanceOf[js.Any])
  }
}
