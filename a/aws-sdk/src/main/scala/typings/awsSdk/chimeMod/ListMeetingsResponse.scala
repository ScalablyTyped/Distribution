package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMeetingsResponse extends StObject {
  
  /**
    * The Amazon Chime SDK meeting information.
    */
  var Meetings: js.UndefOr[MeetingList] = js.native
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListMeetingsResponse {
  
  @scala.inline
  def apply(): ListMeetingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMeetingsResponse]
  }
  
  @scala.inline
  implicit class ListMeetingsResponseMutableBuilder[Self <: ListMeetingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeetings(value: MeetingList): Self = StObject.set(x, "Meetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingsUndefined: Self = StObject.set(x, "Meetings", js.undefined)
    
    @scala.inline
    def setMeetingsVarargs(value: Meeting*): Self = StObject.set(x, "Meetings", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
