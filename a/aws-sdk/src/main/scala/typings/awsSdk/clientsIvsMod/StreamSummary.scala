package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSummary extends StObject {
  
  /**
    * Channel ARN for the stream.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.undefined
  
  /**
    * The stream’s health.
    */
  var health: js.UndefOr[StreamHealth] = js.undefined
  
  /**
    * Time of the stream’s start. This is an ISO 8601 timestamp; note that this is returned as a string. 
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The stream’s state.
    */
  var state: js.UndefOr[StreamState] = js.undefined
  
  /**
    * Unique identifier for a live or previously live stream in the specified channel.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
  
  /**
    * A count of concurrent views of the stream. Typically, a new view appears in viewerCount within 15 seconds of when video playback starts and a view is removed from viewerCount within 1 minute of when video playback ends. A value of -1 indicates that the request timed out; in this case, retry.
    */
  var viewerCount: js.UndefOr[StreamViewerCount] = js.undefined
}
object StreamSummary {
  
  inline def apply(): StreamSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamSummary] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "channelArn", js.undefined)
    
    inline def setHealth(value: StreamHealth): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: StreamState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setViewerCount(value: StreamViewerCount): Self = StObject.set(x, "viewerCount", value.asInstanceOf[js.Any])
    
    inline def setViewerCountUndefined: Self = StObject.set(x, "viewerCount", js.undefined)
  }
}
