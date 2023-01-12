package typings.awsSdk.clientsDynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamDescription extends StObject {
  
  /**
    * The date and time when the request to create this stream was issued.
    */
  var CreationRequestDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The key attribute(s) of the stream's DynamoDB table.
    */
  var KeySchema: js.UndefOr[typings.awsSdk.clientsDynamodbstreamsMod.KeySchema] = js.undefined
  
  /**
    * The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value to start a new operation, excluding this value in the new request. If LastEvaluatedShardId is empty, then the "last page" of results has been processed and there is currently no more data to be retrieved. If LastEvaluatedShardId is not empty, it does not necessarily mean that there is more data in the result set. The only way to know when you have reached the end of the result set is when LastEvaluatedShardId is empty.
    */
  var LastEvaluatedShardId: js.UndefOr[ShardId] = js.undefined
  
  /**
    * The shards that comprise the stream.
    */
  var Shards: js.UndefOr[ShardDescriptionList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the stream.
    */
  var StreamArn: js.UndefOr[typings.awsSdk.clientsDynamodbstreamsMod.StreamArn] = js.undefined
  
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   the AWS customer ID.   the table name   the StreamLabel   
    */
  var StreamLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the current status of the stream:    ENABLING - Streams is currently being enabled on the DynamoDB table.    ENABLED - the stream is enabled.    DISABLING - Streams is currently being disabled on the DynamoDB table.    DISABLED - the stream is disabled.  
    */
  var StreamStatus: js.UndefOr[typings.awsSdk.clientsDynamodbstreamsMod.StreamStatus] = js.undefined
  
  /**
    * Indicates the format of the records within this stream:    KEYS_ONLY - only the key attributes of items that were modified in the DynamoDB table.    NEW_IMAGE - entire items from the table, as they appeared after they were modified.    OLD_IMAGE - entire items from the table, as they appeared before they were modified.    NEW_AND_OLD_IMAGES - both the new and the old images of the items from the table.  
    */
  var StreamViewType: js.UndefOr[typings.awsSdk.clientsDynamodbstreamsMod.StreamViewType] = js.undefined
  
  /**
    * The DynamoDB table with which the stream is associated.
    */
  var TableName: js.UndefOr[typings.awsSdk.clientsDynamodbstreamsMod.TableName] = js.undefined
}
object StreamDescription {
  
  inline def apply(): StreamDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamDescription] (val x: Self) extends AnyVal {
    
    inline def setCreationRequestDateTime(value: js.Date): Self = StObject.set(x, "CreationRequestDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationRequestDateTimeUndefined: Self = StObject.set(x, "CreationRequestDateTime", js.undefined)
    
    inline def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    inline def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    inline def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value*))
    
    inline def setLastEvaluatedShardId(value: ShardId): Self = StObject.set(x, "LastEvaluatedShardId", value.asInstanceOf[js.Any])
    
    inline def setLastEvaluatedShardIdUndefined: Self = StObject.set(x, "LastEvaluatedShardId", js.undefined)
    
    inline def setShards(value: ShardDescriptionList): Self = StObject.set(x, "Shards", value.asInstanceOf[js.Any])
    
    inline def setShardsUndefined: Self = StObject.set(x, "Shards", js.undefined)
    
    inline def setShardsVarargs(value: Shard*): Self = StObject.set(x, "Shards", js.Array(value*))
    
    inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
    
    inline def setStreamLabel(value: String): Self = StObject.set(x, "StreamLabel", value.asInstanceOf[js.Any])
    
    inline def setStreamLabelUndefined: Self = StObject.set(x, "StreamLabel", js.undefined)
    
    inline def setStreamStatus(value: StreamStatus): Self = StObject.set(x, "StreamStatus", value.asInstanceOf[js.Any])
    
    inline def setStreamStatusUndefined: Self = StObject.set(x, "StreamStatus", js.undefined)
    
    inline def setStreamViewType(value: StreamViewType): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
    
    inline def setStreamViewTypeUndefined: Self = StObject.set(x, "StreamViewType", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
