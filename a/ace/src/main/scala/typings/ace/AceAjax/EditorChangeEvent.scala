package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorChangeEvent extends StObject {
  
  var action: String
  
  var end: Position
  
  // insert, remove
  var lines: js.Array[js.Any]
  
  var start: Position
}
object EditorChangeEvent {
  
  @scala.inline
  def apply(action: String, end: Position, lines: js.Array[js.Any], start: Position): EditorChangeEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangeEvent]
  }
  
  @scala.inline
  implicit class EditorChangeEventMutableBuilder[Self <: EditorChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: js.Array[js.Any]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: js.Any*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
