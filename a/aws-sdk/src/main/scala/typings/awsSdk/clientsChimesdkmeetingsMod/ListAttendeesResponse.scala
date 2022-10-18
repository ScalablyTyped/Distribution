package typings.awsSdk.clientsChimesdkmeetingsMod

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
  
  inline def apply(): ListAttendeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttendeesResponse]
  }
  
  extension [Self <: ListAttendeesResponse](x: Self) {
    
    inline def setAttendees(value: AttendeeList): Self = StObject.set(x, "Attendees", value.asInstanceOf[js.Any])
    
    inline def setAttendeesUndefined: Self = StObject.set(x, "Attendees", js.undefined)
    
    inline def setAttendeesVarargs(value: Attendee*): Self = StObject.set(x, "Attendees", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
