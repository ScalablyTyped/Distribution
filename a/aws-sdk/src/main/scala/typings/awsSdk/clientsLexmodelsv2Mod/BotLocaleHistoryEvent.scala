package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotLocaleHistoryEvent extends StObject {
  
  /**
    * A description of the event that occurred.
    */
  var event: BotLocaleHistoryEventDescription
  
  /**
    * A timestamp of the date and time that the event occurred.
    */
  var eventDate: js.Date
}
object BotLocaleHistoryEvent {
  
  inline def apply(event: BotLocaleHistoryEventDescription, eventDate: js.Date): BotLocaleHistoryEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventDate = eventDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotLocaleHistoryEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BotLocaleHistoryEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: BotLocaleHistoryEventDescription): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventDate(value: js.Date): Self = StObject.set(x, "eventDate", value.asInstanceOf[js.Any])
  }
}
