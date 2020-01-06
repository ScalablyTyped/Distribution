package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryStreamDescription extends js.Object {
  /**
    * The date and time that the delivery stream was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the delivery stream. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var DeliveryStreamARN: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamARN = js.native
  /**
    * Indicates the server-side encryption (SSE) status for the delivery stream.
    */
  var DeliveryStreamEncryptionConfiguration: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamEncryptionConfiguration] = js.native
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamName = js.native
  /**
    * The status of the delivery stream. If the status of a delivery stream is CREATING_FAILED, this status doesn't change, and you can't invoke CreateDeliveryStream again on it. However, you can invoke the DeleteDeliveryStream operation to delete it.
    */
  var DeliveryStreamStatus: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamStatus = js.native
  /**
    * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
    */
  var DeliveryStreamType: typings.awsDashSdk.clientsFirehoseMod.DeliveryStreamType = js.native
  /**
    * The destinations.
    */
  var Destinations: DestinationDescriptionList = js.native
  /**
    * Provides details in case one of the following operations fails due to an error related to KMS: CreateDeliveryStream, DeleteDeliveryStream, StartDeliveryStreamEncryption, StopDeliveryStreamEncryption.
    */
  var FailureDescription: js.UndefOr[typings.awsDashSdk.clientsFirehoseMod.FailureDescription] = js.native
  /**
    * Indicates whether there are more destinations available to list.
    */
  var HasMoreDestinations: BooleanObject = js.native
  /**
    * The date and time that the delivery stream was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * If the DeliveryStreamType parameter is KinesisStreamAsSource, a SourceDescription object describing the source Kinesis data stream.
    */
  var Source: js.UndefOr[SourceDescription] = js.native
  /**
    * Each time the destination is updated for a delivery stream, the version ID is changed, and the current version ID is required when updating the destination. This is so that the service knows it is applying the changes to the correct version of the delivery stream.
    */
  var VersionId: DeliveryStreamVersionId = js.native
}

object DeliveryStreamDescription {
  @scala.inline
  def apply(
    DeliveryStreamARN: DeliveryStreamARN,
    DeliveryStreamName: DeliveryStreamName,
    DeliveryStreamStatus: DeliveryStreamStatus,
    DeliveryStreamType: DeliveryStreamType,
    Destinations: DestinationDescriptionList,
    HasMoreDestinations: BooleanObject,
    VersionId: DeliveryStreamVersionId,
    CreateTimestamp: Timestamp = null,
    DeliveryStreamEncryptionConfiguration: DeliveryStreamEncryptionConfiguration = null,
    FailureDescription: FailureDescription = null,
    LastUpdateTimestamp: Timestamp = null,
    Source: SourceDescription = null
  ): DeliveryStreamDescription = {
    val __obj = js.Dynamic.literal(DeliveryStreamARN = DeliveryStreamARN.asInstanceOf[js.Any], DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], DeliveryStreamStatus = DeliveryStreamStatus.asInstanceOf[js.Any], DeliveryStreamType = DeliveryStreamType.asInstanceOf[js.Any], Destinations = Destinations.asInstanceOf[js.Any], HasMoreDestinations = HasMoreDestinations.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp.asInstanceOf[js.Any])
    if (DeliveryStreamEncryptionConfiguration != null) __obj.updateDynamic("DeliveryStreamEncryptionConfiguration")(DeliveryStreamEncryptionConfiguration.asInstanceOf[js.Any])
    if (FailureDescription != null) __obj.updateDynamic("FailureDescription")(FailureDescription.asInstanceOf[js.Any])
    if (LastUpdateTimestamp != null) __obj.updateDynamic("LastUpdateTimestamp")(LastUpdateTimestamp.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryStreamDescription]
  }
}

