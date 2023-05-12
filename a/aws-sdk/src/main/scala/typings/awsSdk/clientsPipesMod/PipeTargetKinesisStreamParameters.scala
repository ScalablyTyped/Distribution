package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetKinesisStreamParameters extends StObject {
  
  /**
    * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream.
    */
  var PartitionKey: KinesisPartitionKey
}
object PipeTargetKinesisStreamParameters {
  
  inline def apply(PartitionKey: KinesisPartitionKey): PipeTargetKinesisStreamParameters = {
    val __obj = js.Dynamic.literal(PartitionKey = PartitionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeTargetKinesisStreamParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetKinesisStreamParameters] (val x: Self) extends AnyVal {
    
    inline def setPartitionKey(value: KinesisPartitionKey): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
  }
}
