package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecordsOutput extends StObject {
  
  /**
    * The list of the current shard's child shards, returned in the GetRecords API's response only when the end of the current shard is reached.
    */
  var ChildShards: js.UndefOr[ChildShardList] = js.undefined
  
  /**
    * The number of milliseconds the GetRecords response is from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.
    */
  var MillisBehindLatest: js.UndefOr[typings.awsSdk.clientsKinesisMod.MillisBehindLatest] = js.undefined
  
  /**
    * The next position in the shard from which to start sequentially reading data records. If set to null, the shard has been closed and the requested iterator does not return any more data. 
    */
  var NextShardIterator: js.UndefOr[ShardIterator] = js.undefined
  
  /**
    * The data records retrieved from the shard.
    */
  var Records: RecordList
}
object GetRecordsOutput {
  
  inline def apply(Records: RecordList): GetRecordsOutput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecordsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRecordsOutput] (val x: Self) extends AnyVal {
    
    inline def setChildShards(value: ChildShardList): Self = StObject.set(x, "ChildShards", value.asInstanceOf[js.Any])
    
    inline def setChildShardsUndefined: Self = StObject.set(x, "ChildShards", js.undefined)
    
    inline def setChildShardsVarargs(value: ChildShard*): Self = StObject.set(x, "ChildShards", js.Array(value*))
    
    inline def setMillisBehindLatest(value: MillisBehindLatest): Self = StObject.set(x, "MillisBehindLatest", value.asInstanceOf[js.Any])
    
    inline def setMillisBehindLatestUndefined: Self = StObject.set(x, "MillisBehindLatest", js.undefined)
    
    inline def setNextShardIterator(value: ShardIterator): Self = StObject.set(x, "NextShardIterator", value.asInstanceOf[js.Any])
    
    inline def setNextShardIteratorUndefined: Self = StObject.set(x, "NextShardIterator", js.undefined)
    
    inline def setRecords(value: RecordList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    inline def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value*))
  }
}
