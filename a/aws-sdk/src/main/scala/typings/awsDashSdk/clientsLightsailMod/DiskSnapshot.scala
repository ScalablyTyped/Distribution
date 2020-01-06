package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date when the disk snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
    */
  var fromDiskArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The unique name of the source disk from which the disk snapshot was created.
    */
  var fromDiskName: js.UndefOr[ResourceName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The unique name of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.native
  /**
    * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
    */
  var isFromAutoSnapshot: js.UndefOr[Boolean] = js.native
  /**
    * The AWS Region and Availability Zone where the disk snapshot was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The progress of the disk snapshot operation.
    */
  var progress: js.UndefOr[String] = js.native
  /**
    * The Lightsail resource type (e.g., DiskSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * The status of the disk snapshot operation.
    */
  var state: js.UndefOr[DiskSnapshotState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object DiskSnapshot {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    fromDiskArn: NonEmptyString = null,
    fromDiskName: ResourceName = null,
    fromInstanceArn: NonEmptyString = null,
    fromInstanceName: ResourceName = null,
    isFromAutoSnapshot: js.UndefOr[Boolean] = js.undefined,
    location: ResourceLocation = null,
    name: ResourceName = null,
    progress: String = null,
    resourceType: ResourceType = null,
    sizeInGb: Int | Double = null,
    state: DiskSnapshotState = null,
    supportCode: String = null,
    tags: TagList = null
  ): DiskSnapshot = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (fromDiskArn != null) __obj.updateDynamic("fromDiskArn")(fromDiskArn.asInstanceOf[js.Any])
    if (fromDiskName != null) __obj.updateDynamic("fromDiskName")(fromDiskName.asInstanceOf[js.Any])
    if (fromInstanceArn != null) __obj.updateDynamic("fromInstanceArn")(fromInstanceArn.asInstanceOf[js.Any])
    if (fromInstanceName != null) __obj.updateDynamic("fromInstanceName")(fromInstanceName.asInstanceOf[js.Any])
    if (!js.isUndefined(isFromAutoSnapshot)) __obj.updateDynamic("isFromAutoSnapshot")(isFromAutoSnapshot.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sizeInGb != null) __obj.updateDynamic("sizeInGb")(sizeInGb.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskSnapshot]
  }
}

