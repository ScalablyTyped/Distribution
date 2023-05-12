package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSummary extends StObject {
  
  /**
    * The ARN of the stream.
    */
  var StreamARN: typings.awsSdk.clientsKinesisMod.StreamARN
  
  /**
    * The timestamp at which the stream was created.
    */
  var StreamCreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  var StreamModeDetails: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamModeDetails] = js.undefined
  
  /**
    * The name of a stream.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
  
  /**
    * The status of the stream.
    */
  var StreamStatus: typings.awsSdk.clientsKinesisMod.StreamStatus
}
object StreamSummary {
  
  inline def apply(StreamARN: StreamARN, StreamName: StreamName, StreamStatus: StreamStatus): StreamSummary = {
    val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamSummary] (val x: Self) extends AnyVal {
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamCreationTimestamp(value: js.Date): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStreamCreationTimestampUndefined: Self = StObject.set(x, "StreamCreationTimestamp", js.undefined)
    
    inline def setStreamModeDetails(value: StreamModeDetails): Self = StObject.set(x, "StreamModeDetails", value.asInstanceOf[js.Any])
    
    inline def setStreamModeDetailsUndefined: Self = StObject.set(x, "StreamModeDetails", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamStatus(value: StreamStatus): Self = StObject.set(x, "StreamStatus", value.asInstanceOf[js.Any])
  }
}
