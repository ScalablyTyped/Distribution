package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorPositionChangedEvent extends StObject {
  
  var cursor: Cursor = js.native
  
  var newBufferPosition: Point = js.native
  
  var newScreenPosition: Point = js.native
  
  var oldBufferPosition: Point = js.native
  
  var oldScreenPosition: Point = js.native
  
  var textChanged: Boolean = js.native
}
object CursorPositionChangedEvent {
  
  @scala.inline
  def apply(
    cursor: Cursor,
    newBufferPosition: Point,
    newScreenPosition: Point,
    oldBufferPosition: Point,
    oldScreenPosition: Point,
    textChanged: Boolean
  ): CursorPositionChangedEvent = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], newBufferPosition = newBufferPosition.asInstanceOf[js.Any], newScreenPosition = newScreenPosition.asInstanceOf[js.Any], oldBufferPosition = oldBufferPosition.asInstanceOf[js.Any], oldScreenPosition = oldScreenPosition.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorPositionChangedEvent]
  }
  
  @scala.inline
  implicit class CursorPositionChangedEventMutableBuilder[Self <: CursorPositionChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewBufferPosition(value: Point): Self = StObject.set(x, "newBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewScreenPosition(value: Point): Self = StObject.set(x, "newScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldBufferPosition(value: Point): Self = StObject.set(x, "oldBufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldScreenPosition(value: Point): Self = StObject.set(x, "oldScreenPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextChanged(value: Boolean): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
  }
}
