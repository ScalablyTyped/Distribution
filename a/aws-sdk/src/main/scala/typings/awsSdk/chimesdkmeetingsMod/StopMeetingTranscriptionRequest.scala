package typings.awsSdk.chimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopMeetingTranscriptionRequest extends StObject {
  
  /**
    * The unique ID of the meeting for which you stop transcription.
    */
  var MeetingId: GuidString
}
object StopMeetingTranscriptionRequest {
  
  inline def apply(MeetingId: GuidString): StopMeetingTranscriptionRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopMeetingTranscriptionRequest]
  }
  
  extension [Self <: StopMeetingTranscriptionRequest](x: Self) {
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
  }
}
