package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferChangingEvent extends StObject {
  
  /** Range of the old text. */
  var oldRange: Range
}
object BufferChangingEvent {
  
  @scala.inline
  def apply(oldRange: Range): BufferChangingEvent = {
    val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChangingEvent]
  }
  
  @scala.inline
  implicit class BufferChangingEventMutableBuilder[Self <: BufferChangingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
  }
}
