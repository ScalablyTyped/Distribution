package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attendee extends StObject {
  
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: js.UndefOr[ExternalUserIdType] = js.undefined
  
  /**
    * The join token used by the Amazon Chime SDK attendee.
    */
  var JoinToken: js.UndefOr[JoinTokenString] = js.undefined
}
object Attendee {
  
  inline def apply(): Attendee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attendee]
  }
  
  extension [Self <: Attendee](x: Self) {
    
    inline def setAttendeeId(value: GuidString): Self = StObject.set(x, "AttendeeId", value.asInstanceOf[js.Any])
    
    inline def setAttendeeIdUndefined: Self = StObject.set(x, "AttendeeId", js.undefined)
    
    inline def setExternalUserId(value: ExternalUserIdType): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
    
    inline def setExternalUserIdUndefined: Self = StObject.set(x, "ExternalUserId", js.undefined)
    
    inline def setJoinToken(value: JoinTokenString): Self = StObject.set(x, "JoinToken", value.asInstanceOf[js.Any])
    
    inline def setJoinTokenUndefined: Self = StObject.set(x, "JoinToken", js.undefined)
  }
}
