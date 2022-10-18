package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeShardsInput extends StObject {
  
  /**
    * The shard ID of the adjacent shard for the merge.
    */
  var AdjacentShardToMerge: ShardId
  
  /**
    * The shard ID of the shard to combine with the adjacent shard for the merge.
    */
  var ShardToMerge: ShardId
  
  /**
    * The name of the stream for the merge.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
}
object MergeShardsInput {
  
  inline def apply(AdjacentShardToMerge: ShardId, ShardToMerge: ShardId, StreamName: StreamName): MergeShardsInput = {
    val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge.asInstanceOf[js.Any], ShardToMerge = ShardToMerge.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeShardsInput]
  }
  
  extension [Self <: MergeShardsInput](x: Self) {
    
    inline def setAdjacentShardToMerge(value: ShardId): Self = StObject.set(x, "AdjacentShardToMerge", value.asInstanceOf[js.Any])
    
    inline def setShardToMerge(value: ShardId): Self = StObject.set(x, "ShardToMerge", value.asInstanceOf[js.Any])
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
