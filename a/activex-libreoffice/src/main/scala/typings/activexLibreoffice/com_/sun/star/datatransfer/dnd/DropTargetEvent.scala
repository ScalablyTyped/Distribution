package typings.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is the base class for {@link DropTargetDragEvent} and {@link DropTargetDropEvent} .
  *
  * To access the {@link XDropTarget} that originated this event, use the {@link com.sun.star.lang.EventObject.Source} member of this object.
  */
trait DropTargetEvent
  extends StObject
     with EventObject {
  
  /** UNO specification does not allow empty struct definitions. */
  var Dummy: Double
}
object DropTargetEvent {
  
  inline def apply(Dummy: Double, Source: XInterface): DropTargetEvent = {
    val __obj = js.Dynamic.literal(Dummy = Dummy.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetEvent]
  }
  
  extension [Self <: DropTargetEvent](x: Self) {
    
    inline def setDummy(value: Double): Self = StObject.set(x, "Dummy", value.asInstanceOf[js.Any])
  }
}
