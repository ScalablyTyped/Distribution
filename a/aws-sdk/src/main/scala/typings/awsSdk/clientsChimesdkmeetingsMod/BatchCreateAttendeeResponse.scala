package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateAttendeeResponse extends StObject {
  
  /**
    * The attendee information, including attendees' IDs and join tokens.
    */
  var Attendees: js.UndefOr[AttendeeList] = js.undefined
  
  /**
    * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[BatchCreateAttendeeErrorList] = js.undefined
}
object BatchCreateAttendeeResponse {
  
  inline def apply(): BatchCreateAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateAttendeeResponse]
  }
  
  extension [Self <: BatchCreateAttendeeResponse](x: Self) {
    
    inline def setAttendees(value: AttendeeList): Self = StObject.set(x, "Attendees", value.asInstanceOf[js.Any])
    
    inline def setAttendeesUndefined: Self = StObject.set(x, "Attendees", js.undefined)
    
    inline def setAttendeesVarargs(value: Attendee*): Self = StObject.set(x, "Attendees", js.Array(value*))
    
    inline def setErrors(value: BatchCreateAttendeeErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: CreateAttendeeError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
