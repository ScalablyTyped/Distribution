package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttendeesResponse extends StObject {
  
  /**
    * The Amazon Chime SDK attendee information.
    */
  var Attendees: js.UndefOr[AttendeeList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAttendeesResponse {
  
  @scala.inline
  def apply(): ListAttendeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttendeesResponse]
  }
  
  @scala.inline
  implicit class ListAttendeesResponseMutableBuilder[Self <: ListAttendeesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendees(value: AttendeeList): Self = StObject.set(x, "Attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeesUndefined: Self = StObject.set(x, "Attendees", js.undefined)
    
    @scala.inline
    def setAttendeesVarargs(value: Attendee*): Self = StObject.set(x, "Attendees", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
