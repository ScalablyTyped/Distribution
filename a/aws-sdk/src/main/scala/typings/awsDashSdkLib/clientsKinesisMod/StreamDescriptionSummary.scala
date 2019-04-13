package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamDescriptionSummary extends js.Object {
  /**
    * The number of enhanced fan-out consumers registered with the stream.
    */
  var ConsumerCount: js.UndefOr[ConsumerCountObject] = js.undefined
  /**
    * The encryption type used. This value is one of the following:    KMS     NONE   
    */
  var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
  /**
    * Represents the current enhanced monitoring settings of the stream.
    */
  var EnhancedMonitoring: EnhancedMonitoringList
  /**
    * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example:  arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
    */
  var KeyId: js.UndefOr[KeyId] = js.undefined
  /**
    * The number of open shards in the stream.
    */
  var OpenShardCount: ShardCountObject
  /**
    * The current retention period, in hours.
    */
  var RetentionPeriodHours: PositiveIntegerObject
  /**
    * The Amazon Resource Name (ARN) for the stream being described.
    */
  var StreamARN: awsDashSdkLib.clientsKinesisMod.StreamARN
  /**
    * The approximate time that the stream was created.
    */
  var StreamCreationTimestamp: Timestamp
  /**
    * The name of the stream being described.
    */
  var StreamName: awsDashSdkLib.clientsKinesisMod.StreamName
  /**
    * The current status of the stream being described. The stream status is one of the following states:    CREATING - The stream is being created. Kinesis Data Streams immediately returns and sets StreamStatus to CREATING.    DELETING - The stream is being deleted. The specified stream is in the DELETING state until Kinesis Data Streams completes the deletion.    ACTIVE - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an ACTIVE stream.    UPDATING - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the UPDATING state.  
    */
  var StreamStatus: awsDashSdkLib.clientsKinesisMod.StreamStatus
}

object StreamDescriptionSummary {
  @scala.inline
  def apply(
    EnhancedMonitoring: EnhancedMonitoringList,
    OpenShardCount: ShardCountObject,
    RetentionPeriodHours: PositiveIntegerObject,
    StreamARN: StreamARN,
    StreamCreationTimestamp: Timestamp,
    StreamName: StreamName,
    StreamStatus: StreamStatus,
    ConsumerCount: js.UndefOr[ConsumerCountObject] = js.undefined,
    EncryptionType: EncryptionType = null,
    KeyId: KeyId = null
  ): StreamDescriptionSummary = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring, OpenShardCount = OpenShardCount, RetentionPeriodHours = RetentionPeriodHours, StreamARN = StreamARN, StreamCreationTimestamp = StreamCreationTimestamp, StreamName = StreamName, StreamStatus = StreamStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(ConsumerCount)) __obj.updateDynamic("ConsumerCount")(ConsumerCount)
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    __obj.asInstanceOf[StreamDescriptionSummary]
  }
}

