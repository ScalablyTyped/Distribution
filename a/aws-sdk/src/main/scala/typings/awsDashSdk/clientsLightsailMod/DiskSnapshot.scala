package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The date when the disk snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the source disk from which the disk snapshot was created.
    */
  var fromDiskArn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The unique name of the source disk from which the disk snapshot was created.
    */
  var fromDiskName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The unique name of the source instance from which the disk (system volume) snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * A Boolean value indicating whether the snapshot was created from an automatic snapshot.
    */
  var isFromAutoSnapshot: js.UndefOr[Boolean] = js.undefined
  /**
    * The AWS Region and Availability Zone where the disk snapshot was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The progress of the disk snapshot operation.
    */
  var progress: js.UndefOr[String] = js.undefined
  /**
    * The Lightsail resource type (e.g., DiskSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
  /**
    * The status of the disk snapshot operation.
    */
  var state: js.UndefOr[DiskSnapshotState] = js.undefined
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
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
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (fromDiskArn != null) __obj.updateDynamic("fromDiskArn")(fromDiskArn)
    if (fromDiskName != null) __obj.updateDynamic("fromDiskName")(fromDiskName)
    if (fromInstanceArn != null) __obj.updateDynamic("fromInstanceArn")(fromInstanceArn)
    if (fromInstanceName != null) __obj.updateDynamic("fromInstanceName")(fromInstanceName)
    if (!js.isUndefined(isFromAutoSnapshot)) __obj.updateDynamic("isFromAutoSnapshot")(isFromAutoSnapshot)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sizeInGb != null) __obj.updateDynamic("sizeInGb")(sizeInGb.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[DiskSnapshot]
  }
}

