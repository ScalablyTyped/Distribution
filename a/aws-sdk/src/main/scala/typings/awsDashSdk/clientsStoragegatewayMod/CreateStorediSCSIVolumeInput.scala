package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStorediSCSIVolumeInput extends js.Object {
  /**
    * The unique identifier for the gateway local disk that is configured as a stored volume. Use ListLocalDisks to list disk IDs for a gateway.
    */
  var DiskId: typings.awsDashSdk.clientsStoragegatewayMod.DiskId
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.KMSKey] = js.undefined
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use DescribeGatewayInformation to get a list of the network interfaces available on a gateway.  Valid Values: A valid IP address.
    */
  var NetworkInterfaceId: typings.awsDashSdk.clientsStoragegatewayMod.NetworkInterfaceId
  /**
    * Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.  Valid Values: true, false
    */
  var PreserveExistingData: scala.Boolean
  /**
    * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list snapshots for your account use DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference.
    */
  var SnapshotId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.SnapshotId] = js.undefined
  /**
    * A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Tags] = js.undefined
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: typings.awsDashSdk.clientsStoragegatewayMod.TargetName
}

object CreateStorediSCSIVolumeInput {
  @scala.inline
  def apply(
    DiskId: DiskId,
    GatewayARN: GatewayARN,
    NetworkInterfaceId: NetworkInterfaceId,
    PreserveExistingData: scala.Boolean,
    TargetName: TargetName,
    KMSEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    KMSKey: KMSKey = null,
    SnapshotId: SnapshotId = null,
    Tags: Tags = null
  ): CreateStorediSCSIVolumeInput = {
    val __obj = js.Dynamic.literal(DiskId = DiskId, GatewayARN = GatewayARN, NetworkInterfaceId = NetworkInterfaceId, PreserveExistingData = PreserveExistingData, TargetName = TargetName)
    if (!js.isUndefined(KMSEncrypted)) __obj.updateDynamic("KMSEncrypted")(KMSEncrypted)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateStorediSCSIVolumeInput]
  }
}

