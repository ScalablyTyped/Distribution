package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attendee extends StObject {
  
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application. If you create an attendee with the same external user id, the service returns the existing record.
    */
  var ExternalUserId: js.UndefOr[ExternalUserIdType] = js.undefined
  
  /**
    * The join token used by the Amazon Chime SDK attendee.
    */
  var JoinToken: js.UndefOr[JoinTokenString] = js.undefined
}
object Attendee {
  
  @scala.inline
  def apply(): Attendee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attendee]
  }
  
  @scala.inline
  implicit class AttendeeMutableBuilder[Self <: Attendee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttendeeId(value: GuidString): Self = StObject.set(x, "AttendeeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeeIdUndefined: Self = StObject.set(x, "AttendeeId", js.undefined)
    
    @scala.inline
    def setExternalUserId(value: ExternalUserIdType): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUserIdUndefined: Self = StObject.set(x, "ExternalUserId", js.undefined)
    
    @scala.inline
    def setJoinToken(value: JoinTokenString): Self = StObject.set(x, "JoinToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinTokenUndefined: Self = StObject.set(x, "JoinToken", js.undefined)
  }
}
