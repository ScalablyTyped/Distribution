package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorChangedEvent extends StObject {
  
  /** A Point representing the replacement extent. */
  var newExtent: Point = js.native
  
  /** A Point representing the replaced extent. */
  var oldExtent: Point = js.native
  
  /** A Point representing where the change started. */
  var start: Point = js.native
}
object EditorChangedEvent {
  
  @scala.inline
  def apply(newExtent: Point, oldExtent: Point, start: Point): EditorChangedEvent = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangedEvent]
  }
  
  @scala.inline
  implicit class EditorChangedEventMutableBuilder[Self <: EditorChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewExtent(value: Point): Self = StObject.set(x, "newExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldExtent(value: Point): Self = StObject.set(x, "oldExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
