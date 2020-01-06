package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamInfo extends js.Object {
  /**
    * A time stamp that indicates when the stream was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * How long the stream retains data, in hours.
    */
  var DataRetentionInHours: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.DataRetentionInHours] = js.native
  /**
    * The name of the device that is associated with the stream.
    */
  var DeviceName: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.DeviceName] = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key that Kinesis Video Streams uses to encrypt data on the stream.
    */
  var KmsKeyId: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.KmsKeyId] = js.native
  /**
    * The MediaType of the stream. 
    */
  var MediaType: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.MediaType] = js.native
  /**
    * The status of the stream.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.Status] = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.StreamName] = js.native
  /**
    * The version of the stream.
    */
  var Version: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.Version] = js.native
}

object StreamInfo {
  @scala.inline
  def apply(
    CreationTime: Timestamp = null,
    DataRetentionInHours: Int | Double = null,
    DeviceName: DeviceName = null,
    KmsKeyId: KmsKeyId = null,
    MediaType: MediaType = null,
    Status: Status = null,
    StreamARN: ResourceARN = null,
    StreamName: StreamName = null,
    Version: Version = null
  ): StreamInfo = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DataRetentionInHours != null) __obj.updateDynamic("DataRetentionInHours")(DataRetentionInHours.asInstanceOf[js.Any])
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (MediaType != null) __obj.updateDynamic("MediaType")(MediaType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInfo]
  }
}

