package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttendeesRequest extends js.Object {
  /**
    * The maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.native
  /**
    * The Amazon Chime SDK meeting ID.
    */
  var MeetingId: GuidString = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListAttendeesRequest {
  @scala.inline
  def apply(MeetingId: GuidString): ListAttendeesRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttendeesRequest]
  }
  @scala.inline
  implicit class ListAttendeesRequestOps[Self <: ListAttendeesRequest] (val x: Self) extends AnyVal {
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
    def setMeetingId(value: GuidString): Self = this.set("MeetingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: ResultMax): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

