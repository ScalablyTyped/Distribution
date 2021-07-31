package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateAttendeeResponse extends StObject {
  
  /**
    * The attendee information, including attendees IDs and join tokens.
    */
  var Attendees: js.UndefOr[AttendeeList] = js.undefined
  
  /**
    * If the action fails for one or more of the attendees in the request, a list of the attendees is returned, along with error codes and error messages.
    */
  var Errors: js.UndefOr[BatchCreateAttendeeErrorList] = js.undefined
}
object BatchCreateAttendeeResponse {
  
  @scala.inline
  def apply(): BatchCreateAttendeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateAttendeeResponse]
  }
  
  @scala.inline
  implicit class BatchCreateAttendeeResponseMutableBuilder[Self <: BatchCreateAttendeeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendees(value: AttendeeList): Self = StObject.set(x, "Attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeesUndefined: Self = StObject.set(x, "Attendees", js.undefined)
    
    @scala.inline
    def setAttendeesVarargs(value: Attendee*): Self = StObject.set(x, "Attendees", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: BatchCreateAttendeeErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: CreateAttendeeError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
  }
}
