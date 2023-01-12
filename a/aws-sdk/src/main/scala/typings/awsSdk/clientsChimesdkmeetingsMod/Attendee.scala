package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attendee extends StObject {
  
  /**
    * The Amazon Chime SDK attendee ID.
    */
  var AttendeeId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * The capabilities assigned to an attendee: audio, video, or content.  You use the capabilities with a set of values that control what the capabilities can do, such as SendReceive data. For more information about those values, see .  When using capabilities, be aware of these corner cases:   You can't set content capabilities to SendReceive or Receive unless you also set video capabilities to SendReceive or Receive. If you don't set the video capability to receive, the response will contain an HTTP 400 Bad Request status code. However, you can set your video capability to receive and you set your content capability to not receive.   When you change an audio capability from None or Receive to Send or SendReceive , and if the attendee left their microphone unmuted, audio will flow from the attendee to the other meeting participants.   When you change a video or content capability from None or Receive to Send or SendReceive , and if the attendee turned on their video or content streams, remote attendess can receive those streams, but only after media renegotiation between the client and the Amazon Chime back-end server.  
    */
  var Capabilities: js.UndefOr[AttendeeCapabilities] = js.undefined
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: js.UndefOr[typings.awsSdk.clientsChimesdkmeetingsMod.ExternalUserId] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attendee] (val x: Self) extends AnyVal {
    
    inline def setAttendeeId(value: GuidString): Self = StObject.set(x, "AttendeeId", value.asInstanceOf[js.Any])
    
    inline def setAttendeeIdUndefined: Self = StObject.set(x, "AttendeeId", js.undefined)
    
    inline def setCapabilities(value: AttendeeCapabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setExternalUserId(value: ExternalUserId): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
    
    inline def setExternalUserIdUndefined: Self = StObject.set(x, "ExternalUserId", js.undefined)
    
    inline def setJoinToken(value: JoinTokenString): Self = StObject.set(x, "JoinToken", value.asInstanceOf[js.Any])
    
    inline def setJoinTokenUndefined: Self = StObject.set(x, "JoinToken", js.undefined)
  }
}
