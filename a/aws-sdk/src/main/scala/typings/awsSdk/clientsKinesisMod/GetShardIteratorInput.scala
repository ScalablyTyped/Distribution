package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetShardIteratorInput extends StObject {
  
  /**
    * The shard ID of the Kinesis Data Streams shard to get the iterator for.
    */
  var ShardId: typings.awsSdk.clientsKinesisMod.ShardId
  
  /**
    * Determines how the shard iterator is used to start reading data records from the shard. The following are the valid Amazon Kinesis shard iterator types:   AT_SEQUENCE_NUMBER - Start reading from the position denoted by a specific sequence number, provided in the value StartingSequenceNumber.   AFTER_SEQUENCE_NUMBER - Start reading right after the position denoted by a specific sequence number, provided in the value StartingSequenceNumber.   AT_TIMESTAMP - Start reading from the position denoted by a specific time stamp, provided in the value Timestamp.   TRIM_HORIZON - Start reading at the last untrimmed record in the shard in the system, which is the oldest data record in the shard.   LATEST - Start reading just after the most recent record in the shard, so that you always read the most recent data in the shard.  
    */
  var ShardIteratorType: typings.awsSdk.clientsKinesisMod.ShardIteratorType
  
  /**
    * The sequence number of the data record in the shard from which to start reading. Used with shard iterator type AT_SEQUENCE_NUMBER and AFTER_SEQUENCE_NUMBER.
    */
  var StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
  
  /**
    * The name of the Amazon Kinesis data stream.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
  
  /**
    * The time stamp of the data record from which to start reading. Used with shard iterator type AT_TIMESTAMP. A time stamp is the Unix epoch date with precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. If a record with this exact time stamp does not exist, the iterator returned is for the next (later) record. If the time stamp is older than the current trim horizon, the iterator returned is for the oldest untrimmed data record (TRIM_HORIZON).
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object GetShardIteratorInput {
  
  inline def apply(ShardId: ShardId, ShardIteratorType: ShardIteratorType, StreamName: StreamName): GetShardIteratorInput = {
    val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShardIteratorInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetShardIteratorInput] (val x: Self) extends AnyVal {
    
    inline def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
    
    inline def setShardIteratorType(value: ShardIteratorType): Self = StObject.set(x, "ShardIteratorType", value.asInstanceOf[js.Any])
    
    inline def setStartingSequenceNumber(value: SequenceNumber): Self = StObject.set(x, "StartingSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setStartingSequenceNumberUndefined: Self = StObject.set(x, "StartingSequenceNumber", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
