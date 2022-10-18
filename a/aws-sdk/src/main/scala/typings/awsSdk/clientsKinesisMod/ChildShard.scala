package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildShard extends StObject {
  
  var HashKeyRange: typings.awsSdk.clientsKinesisMod.HashKeyRange
  
  /**
    * The current shard that is the parent of the existing child shard.
    */
  var ParentShards: ShardIdList
  
  /**
    * The shard ID of the existing child shard of the current shard.
    */
  var ShardId: typings.awsSdk.clientsKinesisMod.ShardId
}
object ChildShard {
  
  inline def apply(HashKeyRange: HashKeyRange, ParentShards: ShardIdList, ShardId: ShardId): ChildShard = {
    val __obj = js.Dynamic.literal(HashKeyRange = HashKeyRange.asInstanceOf[js.Any], ParentShards = ParentShards.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildShard]
  }
  
  extension [Self <: ChildShard](x: Self) {
    
    inline def setHashKeyRange(value: HashKeyRange): Self = StObject.set(x, "HashKeyRange", value.asInstanceOf[js.Any])
    
    inline def setParentShards(value: ShardIdList): Self = StObject.set(x, "ParentShards", value.asInstanceOf[js.Any])
    
    inline def setParentShardsVarargs(value: ShardId*): Self = StObject.set(x, "ParentShards", js.Array(value*))
    
    inline def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
  }
}
