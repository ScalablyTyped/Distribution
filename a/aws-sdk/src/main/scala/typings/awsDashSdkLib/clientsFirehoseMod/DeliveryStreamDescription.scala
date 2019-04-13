package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryStreamDescription extends js.Object {
  /**
    * The date and time that the delivery stream was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the delivery stream. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var DeliveryStreamARN: awsDashSdkLib.clientsFirehoseMod.DeliveryStreamARN
  /**
    * Indicates the server-side encryption (SSE) status for the delivery stream.
    */
  var DeliveryStreamEncryptionConfiguration: js.UndefOr[DeliveryStreamEncryptionConfiguration] = js.undefined
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: awsDashSdkLib.clientsFirehoseMod.DeliveryStreamName
  /**
    * The status of the delivery stream.
    */
  var DeliveryStreamStatus: awsDashSdkLib.clientsFirehoseMod.DeliveryStreamStatus
  /**
    * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.  
    */
  var DeliveryStreamType: awsDashSdkLib.clientsFirehoseMod.DeliveryStreamType
  /**
    * The destinations.
    */
  var Destinations: DestinationDescriptionList
  /**
    * Indicates whether there are more destinations available to list.
    */
  var HasMoreDestinations: BooleanObject
  /**
    * The date and time that the delivery stream was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * If the DeliveryStreamType parameter is KinesisStreamAsSource, a SourceDescription object describing the source Kinesis data stream.
    */
  var Source: js.UndefOr[SourceDescription] = js.undefined
  /**
    * Each time the destination is updated for a delivery stream, the version ID is changed, and the current version ID is required when updating the destination. This is so that the service knows it is applying the changes to the correct version of the delivery stream.
    */
  var VersionId: DeliveryStreamVersionId
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
    LastUpdateTimestamp: Timestamp = null,
    Source: SourceDescription = null
  ): DeliveryStreamDescription = {
    val __obj = js.Dynamic.literal(DeliveryStreamARN = DeliveryStreamARN, DeliveryStreamName = DeliveryStreamName, DeliveryStreamStatus = DeliveryStreamStatus.asInstanceOf[js.Any], DeliveryStreamType = DeliveryStreamType.asInstanceOf[js.Any], Destinations = Destinations, HasMoreDestinations = HasMoreDestinations, VersionId = VersionId)
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp)
    if (DeliveryStreamEncryptionConfiguration != null) __obj.updateDynamic("DeliveryStreamEncryptionConfiguration")(DeliveryStreamEncryptionConfiguration)
    if (LastUpdateTimestamp != null) __obj.updateDynamic("LastUpdateTimestamp")(LastUpdateTimestamp)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[DeliveryStreamDescription]
  }
}

