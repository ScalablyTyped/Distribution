package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsTicketTicketEvent extends StObject {
  
  /**
    * Description of the event.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Entry time, which might be different from the event start time. e.g. the
    * event starts at 9am, but entry time is 8:30am.
    */
  var doorTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  
  /**
    * End time.
    */
  var endDate: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  
  /**
    * The characters related to this event. It can be directors or actors of a
    * movie event, or performers of a concert, etc.
    */
  var eventCharacters: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsTicketEventCharacter]] = js.undefined
  
  /**
    * The location where the event is happening, or an organization is located.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
  
  /**
    * Required: Name of the event. For example, if the event is a movie, this
    * should be the movie name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Start time.
    */
  var startDate: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  
  /**
    * Required: Type of the ticket event, e.g. movie, concert.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketTicketEventType] = js.undefined
  
  /**
    * Url to the event info.
    */
  var url: js.UndefOr[String] = js.undefined
}
object GoogleActionsOrdersV3VerticalsTicketTicketEvent {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsTicketTicketEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsTicketTicketEvent]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsTicketTicketEventMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsTicketTicketEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDoorTime(value: GoogleActionsOrdersV3Time): Self = StObject.set(x, "doorTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoorTimeUndefined: Self = StObject.set(x, "doorTime", js.undefined)
    
    @scala.inline
    def setEndDate(value: GoogleActionsOrdersV3Time): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setEventCharacters(value: js.Array[GoogleActionsOrdersV3VerticalsTicketEventCharacter]): Self = StObject.set(x, "eventCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCharactersUndefined: Self = StObject.set(x, "eventCharacters", js.undefined)
    
    @scala.inline
    def setEventCharactersVarargs(value: GoogleActionsOrdersV3VerticalsTicketEventCharacter*): Self = StObject.set(x, "eventCharacters", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: GoogleActionsV2Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStartDate(value: GoogleActionsOrdersV3Time): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsOrdersV3VerticalsTicketTicketEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
