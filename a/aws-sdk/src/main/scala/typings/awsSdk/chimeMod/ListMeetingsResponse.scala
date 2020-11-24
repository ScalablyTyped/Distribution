package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMeetingsResponse extends js.Object {
  
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
  implicit class ListMeetingsResponseOps[Self <: ListMeetingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMeetingsVarargs(value: Meeting*): Self = this.set("Meetings", js.Array(value :_*))
    
    @scala.inline
    def setMeetings(value: MeetingList): Self = this.set("Meetings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeetings: Self = this.set("Meetings", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
