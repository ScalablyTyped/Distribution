package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attendee extends js.Object {
  
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: js.UndefOr[GuidString] = js.native
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application. If you create an attendee with the same external user id, the service returns the existing record.
    */
  var ExternalUserId: js.UndefOr[ExternalUserIdType] = js.native
  
  /**
    * The join token used by the Amazon Chime SDK attendee.
    */
  var JoinToken: js.UndefOr[JoinTokenString] = js.native
}
object Attendee {
  
  @scala.inline
  def apply(): Attendee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attendee]
  }
  
  @scala.inline
  implicit class AttendeeOps[Self <: Attendee] (val x: Self) extends AnyVal {
    
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
    def setAttendeeId(value: GuidString): Self = this.set("AttendeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttendeeId: Self = this.set("AttendeeId", js.undefined)
    
    @scala.inline
    def setExternalUserId(value: ExternalUserIdType): Self = this.set("ExternalUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalUserId: Self = this.set("ExternalUserId", js.undefined)
    
    @scala.inline
    def setJoinToken(value: JoinTokenString): Self = this.set("JoinToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinToken: Self = this.set("JoinToken", js.undefined)
  }
}
