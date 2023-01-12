package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogStream extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the log stream.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The creation time of the stream, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time of the first event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var firstEventTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. The lastEventTime value updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but in rare situations might take longer.
    */
  var lastEventTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ingestion time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var lastIngestionTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.undefined
  
  /**
    * The number of bytes stored.  Important: On June 17, 2019, this parameter was deprecated for log streams, and is always reported as zero. This change applies only to log streams. The storedBytes parameter for log groups is not affected.
    */
  var storedBytes: js.UndefOr[StoredBytes] = js.undefined
  
  /**
    * The sequence token.
    */
  var uploadSequenceToken: js.UndefOr[SequenceToken] = js.undefined
}
object LogStream {
  
  inline def apply(): LogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogStream] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setFirstEventTimestamp(value: Timestamp): Self = StObject.set(x, "firstEventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setFirstEventTimestampUndefined: Self = StObject.set(x, "firstEventTimestamp", js.undefined)
    
    inline def setLastEventTimestamp(value: Timestamp): Self = StObject.set(x, "lastEventTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastEventTimestampUndefined: Self = StObject.set(x, "lastEventTimestamp", js.undefined)
    
    inline def setLastIngestionTime(value: Timestamp): Self = StObject.set(x, "lastIngestionTime", value.asInstanceOf[js.Any])
    
    inline def setLastIngestionTimeUndefined: Self = StObject.set(x, "lastIngestionTime", js.undefined)
    
    inline def setLogStreamName(value: LogStreamName): Self = StObject.set(x, "logStreamName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNameUndefined: Self = StObject.set(x, "logStreamName", js.undefined)
    
    inline def setStoredBytes(value: StoredBytes): Self = StObject.set(x, "storedBytes", value.asInstanceOf[js.Any])
    
    inline def setStoredBytesUndefined: Self = StObject.set(x, "storedBytes", js.undefined)
    
    inline def setUploadSequenceToken(value: SequenceToken): Self = StObject.set(x, "uploadSequenceToken", value.asInstanceOf[js.Any])
    
    inline def setUploadSequenceTokenUndefined: Self = StObject.set(x, "uploadSequenceToken", js.undefined)
  }
}
