package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMeetingWithAttendeesResponse extends StObject {
  
  /**
    * The attendee information, including attendees IDs and join tokens.
    */
  var Attendees: js.UndefOr[AttendeeList] = js.undefined
  
  /**
    * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[BatchCreateAttendeeErrorList] = js.undefined
  
  var Meeting: js.UndefOr[typings.awsSdk.chimeMod.Meeting] = js.undefined
}
object CreateMeetingWithAttendeesResponse {
  
  inline def apply(): CreateMeetingWithAttendeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingWithAttendeesResponse]
  }
  
  extension [Self <: CreateMeetingWithAttendeesResponse](x: Self) {
    
    inline def setAttendees(value: AttendeeList): Self = StObject.set(x, "Attendees", value.asInstanceOf[js.Any])
    
    inline def setAttendeesUndefined: Self = StObject.set(x, "Attendees", js.undefined)
    
    inline def setAttendeesVarargs(value: Attendee*): Self = StObject.set(x, "Attendees", js.Array(value*))
    
    inline def setErrors(value: BatchCreateAttendeeErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: CreateAttendeeError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setMeeting(value: Meeting): Self = StObject.set(x, "Meeting", value.asInstanceOf[js.Any])
    
    inline def setMeetingUndefined: Self = StObject.set(x, "Meeting", js.undefined)
  }
}
