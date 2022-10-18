package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardFilter extends StObject {
  
  /**
    * The exclusive start shardID speified in the ShardFilter parameter. This property can only be used if the AFTER_SHARD_ID shard type is specified.
    */
  var ShardId: js.UndefOr[typings.awsSdk.clientsKinesisMod.ShardId] = js.undefined
  
  /**
    * The timestamps specified in the ShardFilter parameter. A timestamp is a Unix epoch date with precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. This property can only be used if FROM_TIMESTAMP or AT_TIMESTAMP shard types are specified.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The shard type specified in the ShardFilter parameter. This is a required property of the ShardFilter parameter. You can specify the following valid values:     AFTER_SHARD_ID - the response includes all the shards, starting with the shard whose ID immediately follows the ShardId that you provided.     AT_TRIM_HORIZON - the response includes all the shards that were open at TRIM_HORIZON.    FROM_TRIM_HORIZON - (default), the response includes all the shards within the retention period of the data stream (trim to tip).    AT_LATEST - the response includes only the currently open shards of the data stream.    AT_TIMESTAMP - the response includes all shards whose start timestamp is less than or equal to the given timestamp and end timestamp is greater than or equal to the given timestamp or still open.     FROM_TIMESTAMP - the response incldues all closed shards whose end timestamp is greater than or equal to the given timestamp and also all open shards. Corrected to TRIM_HORIZON of the data stream if FROM_TIMESTAMP is less than the TRIM_HORIZON value.  
    */
  var Type: ShardFilterType
}
object ShardFilter {
  
  inline def apply(Type: ShardFilterType): ShardFilter = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShardFilter]
  }
  
  extension [Self <: ShardFilter](x: Self) {
    
    inline def setShardId(value: ShardId): Self = StObject.set(x, "ShardId", value.asInstanceOf[js.Any])
    
    inline def setShardIdUndefined: Self = StObject.set(x, "ShardId", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setType(value: ShardFilterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
