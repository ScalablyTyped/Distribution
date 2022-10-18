package typings.atom.srcOtherTypesMod

import typings.atom.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorChangedEvent extends StObject {
  
  /** A Point representing the replacement extent. */
  var newExtent: Point
  
  /** A Point representing the replaced extent. */
  var oldExtent: Point
  
  /** A Point representing where the change started. */
  var start: Point
}
object EditorChangedEvent {
  
  inline def apply(newExtent: Point, oldExtent: Point, start: Point): EditorChangedEvent = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangedEvent]
  }
  
  extension [Self <: EditorChangedEvent](x: Self) {
    
    inline def setNewExtent(value: Point): Self = StObject.set(x, "newExtent", value.asInstanceOf[js.Any])
    
    inline def setOldExtent(value: Point): Self = StObject.set(x, "oldExtent", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
