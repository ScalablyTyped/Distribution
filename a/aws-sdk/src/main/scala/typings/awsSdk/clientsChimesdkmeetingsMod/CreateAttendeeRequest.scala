package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAttendeeRequest extends StObject {
  
  /**
    * The capabilities (audio, video, or content) that you want to grant an attendee. If you don't specify capabilities, all users have send and receive capabilities on all media channels by default.  You use the capabilities with a set of values that control what the capabilities can do, such as SendReceive data. For more information about those values, see .  When using capabilities, be aware of these corner cases:   You can't set content capabilities to SendReceive or Receive unless you also set video capabilities to SendReceive or Receive. If you don't set the video capability to receive, the response will contain an HTTP 400 Bad Request status code. However, you can set your video capability to receive and you set your content capability to not receive.   When you change an audio capability from None or Receive to Send or SendReceive , and if the attendee left their microphone unmuted, audio will flow from the attendee to the other meeting participants.   When you change a video or content capability from None or Receive to Send or SendReceive , and if the attendee turned on their video or content streams, remote attendees can receive those streams, but only after media renegotiation between the client and the Amazon Chime back-end server.  
    */
  var Capabilities: js.UndefOr[AttendeeCapabilities] = js.undefined
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application. Pattern: [-_&amp;@+=,(){}\[\]\/«».:|'"#a-zA-Z0-9À-ÿ\s]*  Values that begin with aws: are reserved. You can't configure a value that uses this prefix.
    */
  var ExternalUserId: typings.awsSdk.clientsChimesdkmeetingsMod.ExternalUserId
  
  /**
    * The unique ID of the meeting.
    */
  var MeetingId: GuidString
}
object CreateAttendeeRequest {
  
  inline def apply(ExternalUserId: ExternalUserId, MeetingId: GuidString): CreateAttendeeRequest = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any], MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAttendeeRequest] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: AttendeeCapabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setExternalUserId(value: ExternalUserId): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
