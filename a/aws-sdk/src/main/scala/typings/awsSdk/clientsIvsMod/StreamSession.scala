package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSession extends StObject {
  
  /**
    * The properties of the channel at the time of going live.
    */
  var channel: js.UndefOr[Channel] = js.undefined
  
  /**
    * Time when the channel went offline. This is an ISO 8601 timestamp; note that this is returned as a string. For live streams, this is NULL.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The properties of the incoming RTMP stream for the stream.
    */
  var ingestConfiguration: js.UndefOr[IngestConfiguration] = js.undefined
  
  /**
    * The properties of recording the live stream.
    */
  var recordingConfiguration: js.UndefOr[RecordingConfiguration] = js.undefined
  
  /**
    * Time when the channel went live. This is an ISO 8601 timestamp; note that this is returned as a string.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Unique identifier for a live or previously live stream in the specified channel.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
  
  /**
    * List of Amazon IVS events that the stream encountered. The list is sorted by most recent events and contains up to 500 events. For Amazon IVS events, see Using Amazon EventBridge with Amazon IVS.
    */
  var truncatedEvents: js.UndefOr[StreamEvents] = js.undefined
}
object StreamSession {
  
  inline def apply(): StreamSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSession]
  }
  
  extension [Self <: StreamSession](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setIngestConfiguration(value: IngestConfiguration): Self = StObject.set(x, "ingestConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIngestConfigurationUndefined: Self = StObject.set(x, "ingestConfiguration", js.undefined)
    
    inline def setRecordingConfiguration(value: RecordingConfiguration): Self = StObject.set(x, "recordingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRecordingConfigurationUndefined: Self = StObject.set(x, "recordingConfiguration", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setTruncatedEvents(value: StreamEvents): Self = StObject.set(x, "truncatedEvents", value.asInstanceOf[js.Any])
    
    inline def setTruncatedEventsUndefined: Self = StObject.set(x, "truncatedEvents", js.undefined)
    
    inline def setTruncatedEventsVarargs(value: StreamEvent*): Self = StObject.set(x, "truncatedEvents", js.Array(value*))
  }
}
