package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  /**
    * The data encryption key identifier for the snapshot. This value is a unique identifier that corresponds to the data encryption key that was used to encrypt the original volume or snapshot copy. Because data encryption keys are inherited by volumes created from snapshots, and vice versa, if snapshots share the same data encryption key identifier, then they belong to the same volume/snapshot lineage. This parameter is only returned by the DescribeSnapshots API operation.
    */
  var DataEncryptionKeyId: js.UndefOr[String] = js.undefined
  /**
    * The description for the snapshot.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume encryption key for the parent volume.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    *  Value from an Amazon-maintained list (amazon | self | all | aws-marketplace | microsoft) of snapshot owners. Not to be confused with the user-configured AWS account alias, which is set from the IAM console. 
    */
  var OwnerAlias: js.UndefOr[String] = js.undefined
  /**
    * The AWS account ID of the EBS snapshot owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The progress of the snapshot, as a percentage.
    */
  var Progress: js.UndefOr[String] = js.undefined
  /**
    * The ID of the snapshot. Each snapshot receives a unique identifier when it is created.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * The time stamp when the snapshot was initiated.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The snapshot state.
    */
  var State: js.UndefOr[SnapshotState] = js.undefined
  /**
    * Encrypted Amazon EBS snapshots are copied asynchronously. If a snapshot copy operation fails (for example, if the proper AWS Key Management Service (AWS KMS) permissions are not obtained) this field displays error state details to help you diagnose why the error occurred. This parameter is only returned by the DescribeSnapshots API operation.
    */
  var StateMessage: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the volume that was used to create the snapshot. Snapshots created by the CopySnapshot action have an arbitrary volume ID that should not be used for any purpose.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
  /**
    * The size of the volume, in GiB.
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
}

object Snapshot {
  @scala.inline
  def apply(
    DataEncryptionKeyId: String = null,
    Description: String = null,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    KmsKeyId: String = null,
    OwnerAlias: String = null,
    OwnerId: String = null,
    Progress: String = null,
    SnapshotId: String = null,
    StartTime: DateTime = null,
    State: SnapshotState = null,
    StateMessage: String = null,
    Tags: TagList = null,
    VolumeId: String = null,
    VolumeSize: js.UndefOr[Integer] = js.undefined
  ): Snapshot = {
    val __obj = js.Dynamic.literal()
    if (DataEncryptionKeyId != null) __obj.updateDynamic("DataEncryptionKeyId")(DataEncryptionKeyId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (OwnerAlias != null) __obj.updateDynamic("OwnerAlias")(OwnerAlias)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateMessage != null) __obj.updateDynamic("StateMessage")(StateMessage)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    if (!js.isUndefined(VolumeSize)) __obj.updateDynamic("VolumeSize")(VolumeSize)
    __obj.asInstanceOf[Snapshot]
  }
}

