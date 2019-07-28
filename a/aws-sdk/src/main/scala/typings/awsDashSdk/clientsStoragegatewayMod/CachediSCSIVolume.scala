package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachediSCSIVolume extends js.Object {
  /**
    * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this time stamp.
    */
  var CreatedDate: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.CreatedDate] = js.undefined
  var KMSKey: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.KMSKey] = js.undefined
  /**
    * If the cached volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-78e22663. Otherwise, this field is not included.
    */
  var SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TargetName] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the storage volume.
    */
  var VolumeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN] = js.undefined
  /**
    * A value that indicates whether a storage volume is attached to or detached from a gateway. For more information, see Moving Your Volumes to a Different Gateway.
    */
  var VolumeAttachmentStatus: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeAttachmentStatus] = js.undefined
  /**
    * The unique identifier of the volume, e.g. vol-AE4B946D.
    */
  var VolumeId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeId] = js.undefined
  /**
    * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of data transferred. This field does not appear in the response if the cached volume is not restoring or bootstrapping.
    */
  var VolumeProgress: js.UndefOr[DoubleObject] = js.undefined
  /**
    * The size, in bytes, of the volume capacity.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
  /**
    * One of the VolumeStatus values that indicates the state of the storage volume.
    */
  var VolumeStatus: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeStatus] = js.undefined
  /**
    * One of the VolumeType enumeration values that describes the type of the volume.
    */
  var VolumeType: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeType] = js.undefined
  /**
    * The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks that are touched, instead of the actual amount of data written. This value can be useful for sequential write patterns but less accurate for random write patterns. VolumeUsedInBytes is different from the compressed size of the volume, which is the value that is used to calculate your bill.  This value is not available for volumes created prior to May 13, 2015, until you store data on the volume. 
    */
  var VolumeUsedInBytes: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeUsedInBytes] = js.undefined
  /**
    * An VolumeiSCSIAttributes object that represents a collection of iSCSI attributes for one stored volume.
    */
  var VolumeiSCSIAttributes: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.VolumeiSCSIAttributes] = js.undefined
}

object CachediSCSIVolume {
  @scala.inline
  def apply(
    CreatedDate: CreatedDate = null,
    KMSKey: KMSKey = null,
    SourceSnapshotId: SnapshotId = null,
    TargetName: TargetName = null,
    VolumeARN: VolumeARN = null,
    VolumeAttachmentStatus: VolumeAttachmentStatus = null,
    VolumeId: VolumeId = null,
    VolumeProgress: js.UndefOr[DoubleObject] = js.undefined,
    VolumeSizeInBytes: js.UndefOr[long] = js.undefined,
    VolumeStatus: VolumeStatus = null,
    VolumeType: VolumeType = null,
    VolumeUsedInBytes: js.UndefOr[VolumeUsedInBytes] = js.undefined,
    VolumeiSCSIAttributes: VolumeiSCSIAttributes = null
  ): CachediSCSIVolume = {
    val __obj = js.Dynamic.literal()
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (KMSKey != null) __obj.updateDynamic("KMSKey")(KMSKey)
    if (SourceSnapshotId != null) __obj.updateDynamic("SourceSnapshotId")(SourceSnapshotId)
    if (TargetName != null) __obj.updateDynamic("TargetName")(TargetName)
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN)
    if (VolumeAttachmentStatus != null) __obj.updateDynamic("VolumeAttachmentStatus")(VolumeAttachmentStatus)
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    if (!js.isUndefined(VolumeProgress)) __obj.updateDynamic("VolumeProgress")(VolumeProgress)
    if (!js.isUndefined(VolumeSizeInBytes)) __obj.updateDynamic("VolumeSizeInBytes")(VolumeSizeInBytes)
    if (VolumeStatus != null) __obj.updateDynamic("VolumeStatus")(VolumeStatus)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType)
    if (!js.isUndefined(VolumeUsedInBytes)) __obj.updateDynamic("VolumeUsedInBytes")(VolumeUsedInBytes)
    if (VolumeiSCSIAttributes != null) __obj.updateDynamic("VolumeiSCSIAttributes")(VolumeiSCSIAttributes)
    __obj.asInstanceOf[CachediSCSIVolume]
  }
}

