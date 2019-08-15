package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVolumeRequest extends js.Object {
  /**
    * The Availability Zone in which to create the volume.
    */
  var AvailabilityZone: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the volume should be encrypted. The effect of setting the encryption state to true depends on the volume origin (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is enabled. For more information, see Encryption by Default in the Amazon Elastic Compute Cloud User Guide. Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption. For more information, see Supported Instance Types.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of I/O operations per second (IOPS) to provision for the volume, with a maximum ratio of 50 IOPS/GiB. Range is 100 to 64,000 IOPS for volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on Nitro-based instances. Other instance families guarantee performance up to 32,000 IOPS. For more information, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud User Guide. This parameter is valid only for Provisioned IOPS SSD (io1) volumes.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  /**
    * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If KmsKeyId is specified, the encrypted state must be true. You can specify the CMK using any of the following:   Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias. For example, alias/ExampleAlias.   Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.   Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the action can appear to complete, but eventually fails.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The size of the volume, in GiBs. Constraints: 1-16,384 for gp2, 4-16,384 for io1, 500-16,384 for st1, 500-16,384 for sc1, and 1-1,024 for standard. If you specify a snapshot, the volume size must be equal to or larger than the snapshot size. Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the snapshot size.  At least one of Size or SnapshotId is required. 
    */
  var Size: js.UndefOr[Integer] = js.undefined
  /**
    * The snapshot from which to create the volume.  At least one of Size or SnapshotId are required. 
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * The tags to apply to the volume during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  /**
    * The volume type. This can be gp2 for General Purpose SSD, io1 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1 for Cold HDD, or standard for Magnetic volumes. Default: gp2 
    */
  var VolumeType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VolumeType] = js.undefined
}

object CreateVolumeRequest {
  @scala.inline
  def apply(
    AvailabilityZone: String,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Iops: js.UndefOr[Integer] = js.undefined,
    KmsKeyId: String = null,
    Size: js.UndefOr[Integer] = js.undefined,
    SnapshotId: String = null,
    TagSpecifications: TagSpecificationList = null,
    VolumeType: VolumeType = null
  ): CreateVolumeRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVolumeRequest]
  }
}

