package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorPositionChangedEvent extends StObject {
  
  var cursor: Cursor
  
  var newBufferPosition: Point
  
  var newScreenPosition: Point
  
  var oldBufferPosition: Point
  
  var oldScreenPosition: Point
  
  var textChanged: Boolean
}
object CursorPositionChangedEvent {
  
  inline def apply(
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
  
  extension [Self <: CursorPositionChangedEvent](x: Self) {
    
    inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setNewBufferPosition(value: Point): Self = StObject.set(x, "newBufferPosition", value.asInstanceOf[js.Any])
    
    inline def setNewScreenPosition(value: Point): Self = StObject.set(x, "newScreenPosition", value.asInstanceOf[js.Any])
    
    inline def setOldBufferPosition(value: Point): Self = StObject.set(x, "oldBufferPosition", value.asInstanceOf[js.Any])
    
    inline def setOldScreenPosition(value: Point): Self = StObject.set(x, "oldScreenPosition", value.asInstanceOf[js.Any])
    
    inline def setTextChanged(value: Boolean): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
  }
}
