package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordInput extends StObject {
  
  /**
    * The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MiB).
    */
  var Data: typings.awsSdk.clientsKinesisMod.Data
  
  /**
    * The hash value used to explicitly determine the shard the data record is assigned to by overriding the partition key hash.
    */
  var ExplicitHashKey: js.UndefOr[HashKey] = js.undefined
  
  /**
    * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream.
    */
  var PartitionKey: typings.awsSdk.clientsKinesisMod.PartitionKey
  
  /**
    * Guarantees strictly increasing sequence numbers, for puts from the same client and to the same partition key. Usage: set the SequenceNumberForOrdering of record n to the sequence number of record n-1 (as returned in the result when putting record n-1). If this parameter is not set, records are coarsely ordered based on arrival time.
    */
  var SequenceNumberForOrdering: js.UndefOr[SequenceNumber] = js.undefined
  
  /**
    * The name of the stream to put the data record into.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
}
object PutRecordInput {
  
  inline def apply(Data: Data, PartitionKey: PartitionKey, StreamName: StreamName): PutRecordInput = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRecordInput] (val x: Self) extends AnyVal {
    
    inline def setData(value: Data): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setExplicitHashKey(value: HashKey): Self = StObject.set(x, "ExplicitHashKey", value.asInstanceOf[js.Any])
    
    inline def setExplicitHashKeyUndefined: Self = StObject.set(x, "ExplicitHashKey", js.undefined)
    
    inline def setPartitionKey(value: PartitionKey): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberForOrdering(value: SequenceNumber): Self = StObject.set(x, "SequenceNumberForOrdering", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberForOrderingUndefined: Self = StObject.set(x, "SequenceNumberForOrdering", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
