package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorationPropsChangedEvent extends StObject {
  
  /** Object the new parameters the decoration now has */
  var newProperties: DecorationOptions
  
  /** Object the old parameters the decoration used to have. */
  var oldProperties: DecorationOptions
}
object DecorationPropsChangedEvent {
  
  @scala.inline
  def apply(newProperties: DecorationOptions, oldProperties: DecorationOptions): DecorationPropsChangedEvent = {
    val __obj = js.Dynamic.literal(newProperties = newProperties.asInstanceOf[js.Any], oldProperties = oldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationPropsChangedEvent]
  }
  
  @scala.inline
  implicit class DecorationPropsChangedEventMutableBuilder[Self <: DecorationPropsChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewProperties(value: DecorationOptions): Self = StObject.set(x, "newProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldProperties(value: DecorationOptions): Self = StObject.set(x, "oldProperties", value.asInstanceOf[js.Any])
  }
}
