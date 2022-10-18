package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMeetingsResponse extends StObject {
  
  /**
    * The Amazon Chime SDK meeting information.
    */
  var Meetings: js.UndefOr[MeetingList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListMeetingsResponse {
  
  inline def apply(): ListMeetingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMeetingsResponse]
  }
  
  extension [Self <: ListMeetingsResponse](x: Self) {
    
    inline def setMeetings(value: MeetingList): Self = StObject.set(x, "Meetings", value.asInstanceOf[js.Any])
    
    inline def setMeetingsUndefined: Self = StObject.set(x, "Meetings", js.undefined)
    
    inline def setMeetingsVarargs(value: Meeting*): Self = StObject.set(x, "Meetings", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
