package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMeetingTranscriptionRequest extends StObject {
  
  /**
    * The unique ID of the meeting being transcribed.
    */
  var MeetingId: GuidString
  
  /**
    * The configuration for the current transcription operation. Must contain EngineTranscribeSettings or EngineTranscribeMedicalSettings.
    */
  var TranscriptionConfiguration: typings.awsSdk.clientsChimeMod.TranscriptionConfiguration
}
object StartMeetingTranscriptionRequest {
  
  inline def apply(MeetingId: GuidString, TranscriptionConfiguration: TranscriptionConfiguration): StartMeetingTranscriptionRequest = {
    val __obj = js.Dynamic.literal(MeetingId = MeetingId.asInstanceOf[js.Any], TranscriptionConfiguration = TranscriptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMeetingTranscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartMeetingTranscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setMeetingId(value: GuidString): Self = StObject.set(x, "MeetingId", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionConfiguration(value: TranscriptionConfiguration): Self = StObject.set(x, "TranscriptionConfiguration", value.asInstanceOf[js.Any])
  }
}
