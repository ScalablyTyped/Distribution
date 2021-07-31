package typings.activexLibreoffice.com_.sun.star.document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an event binding for a document or a document content
  * @see Events
  * @see XEventsSupplier
  */
trait EventDescriptor extends StObject {
  
  /**
    * specifies the type of the event handler
    *
    * Usually this is one of the following: "None""StarBasic""JavaScript""Presentation" This list is extensible.
    */
  var EventType: String
  
  /** specifies the script source code */
  var Script: String
}
object EventDescriptor {
  
  @scala.inline
  def apply(EventType: String, Script: String): EventDescriptor = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], Script = Script.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDescriptor]
  }
  
  @scala.inline
  implicit class EventDescriptorMutableBuilder[Self <: EventDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "Script", value.asInstanceOf[js.Any])
  }
}
