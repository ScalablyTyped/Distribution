package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferStoppedChangingEvent extends StObject {
  
  var changes: js.Array[TextChange]
}
object BufferStoppedChangingEvent {
  
  @scala.inline
  def apply(changes: js.Array[TextChange]): BufferStoppedChangingEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferStoppedChangingEvent]
  }
  
  @scala.inline
  implicit class BufferStoppedChangingEventMutableBuilder[Self <: BufferStoppedChangingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[TextChange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: TextChange*): Self = StObject.set(x, "changes", js.Array(value :_*))
  }
}
