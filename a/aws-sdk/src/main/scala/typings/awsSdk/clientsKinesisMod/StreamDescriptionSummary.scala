package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamDescriptionSummary extends StObject {
  
  /**
    * The number of enhanced fan-out consumers registered with the stream.
    */
  var ConsumerCount: js.UndefOr[ConsumerCountObject] = js.undefined
  
  /**
    * The encryption type used. This value is one of the following:    KMS     NONE   
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.clientsKinesisMod.EncryptionType] = js.undefined
  
  /**
    * Represents the current enhanced monitoring settings of the stream.
    */
  var EnhancedMonitoring: EnhancedMonitoringList
  
  /**
    * The GUID for the customer-managed Amazon Web Services KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example:  arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
    */
  var KeyId: js.UndefOr[typings.awsSdk.clientsKinesisMod.KeyId] = js.undefined
  
  /**
    * The number of open shards in the stream.
    */
  var OpenShardCount: ShardCountObject
  
  /**
    * The current retention period, in hours.
    */
  var RetentionPeriodHours: typings.awsSdk.clientsKinesisMod.RetentionPeriodHours
  
  /**
    * The Amazon Resource Name (ARN) for the stream being described.
    */
  var StreamARN: typings.awsSdk.clientsKinesisMod.StreamARN
  
  /**
    * The approximate time that the stream was created.
    */
  var StreamCreationTimestamp: js.Date
  
  /**
    *  Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you can choose between an on-demand ycapacity mode and a provisioned capacity mode for your data streams. 
    */
  var StreamModeDetails: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamModeDetails] = js.undefined
  
  /**
    * The name of the stream being described.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
  
  /**
    * The current status of the stream being described. The stream status is one of the following states:    CREATING - The stream is being created. Kinesis Data Streams immediately returns and sets StreamStatus to CREATING.    DELETING - The stream is being deleted. The specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.    ACTIVE - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an ACTIVE stream.    UPDATING - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the UPDATING state.  
    */
  var StreamStatus: typings.awsSdk.clientsKinesisMod.StreamStatus
}
object StreamDescriptionSummary {
  
  inline def apply(
    EnhancedMonitoring: EnhancedMonitoringList,
    OpenShardCount: ShardCountObject,
    RetentionPeriodHours: RetentionPeriodHours,
    StreamARN: StreamARN,
    StreamCreationTimestamp: js.Date,
    StreamName: StreamName,
    StreamStatus: StreamStatus
  ): StreamDescriptionSummary = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamDescriptionSummary]
  }
  
  extension [Self <: StreamDescriptionSummary](x: Self) {
    
    inline def setConsumerCount(value: ConsumerCountObject): Self = StObject.set(x, "ConsumerCount", value.asInstanceOf[js.Any])
    
    inline def setConsumerCountUndefined: Self = StObject.set(x, "ConsumerCount", js.undefined)
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setEnhancedMonitoring(value: EnhancedMonitoringList): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnhancedMonitoringVarargs(value: EnhancedMetrics*): Self = StObject.set(x, "EnhancedMonitoring", js.Array(value*))
    
    inline def setKeyId(value: KeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setOpenShardCount(value: ShardCountObject): Self = StObject.set(x, "OpenShardCount", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodHours(value: RetentionPeriodHours): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamCreationTimestamp(value: js.Date): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStreamModeDetails(value: StreamModeDetails): Self = StObject.set(x, "StreamModeDetails", value.asInstanceOf[js.Any])
    
    inline def setStreamModeDetailsUndefined: Self = StObject.set(x, "StreamModeDetails", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamStatus(value: StreamStatus): Self = StObject.set(x, "StreamStatus", value.asInstanceOf[js.Any])
  }
}
