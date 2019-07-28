package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the snapshot (e.g., arn:aws:lightsail:us-east-2:123456789101:InstanceSnapshot/d23b5706-3322-4d83-81e5-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The timestamp when the snapshot was created (e.g., 1479907467.024).
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * An array of disk objects containing information about all block storage disks.
    */
  var fromAttachedDisks: js.UndefOr[DiskList] = js.undefined
  /**
    * The blueprint ID from which you created the snapshot (e.g., os_debian_8_3). A blueprint is a virtual private server (or instance) image used to create instances quickly.
    */
  var fromBlueprintId: js.UndefOr[String] = js.undefined
  /**
    * The bundle ID from which you created the snapshot (e.g., micro_1_0).
    */
  var fromBundleId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the instance from which the snapshot was created (e.g., arn:aws:lightsail:us-east-2:123456789101:Instance/64b8404c-ccb1-430b-8daf-12345EXAMPLE).
    */
  var fromInstanceArn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The instance from which the snapshot was created.
    */
  var fromInstanceName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The region name and Availability Zone where you created the snapshot.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The name of the snapshot.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The progress of the snapshot.
    */
  var progress: js.UndefOr[String] = js.undefined
  /**
    * The type of resource (usually InstanceSnapshot).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The size in GB of the SSD.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
  /**
    * The state the snapshot is in.
    */
  var state: js.UndefOr[InstanceSnapshotState] = js.undefined
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object InstanceSnapshot {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    fromAttachedDisks: DiskList = null,
    fromBlueprintId: String = null,
    fromBundleId: String = null,
    fromInstanceArn: NonEmptyString = null,
    fromInstanceName: ResourceName = null,
    location: ResourceLocation = null,
    name: ResourceName = null,
    progress: String = null,
    resourceType: ResourceType = null,
    sizeInGb: js.UndefOr[integer] = js.undefined,
    state: InstanceSnapshotState = null,
    supportCode: String = null,
    tags: TagList = null
  ): InstanceSnapshot = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (fromAttachedDisks != null) __obj.updateDynamic("fromAttachedDisks")(fromAttachedDisks)
    if (fromBlueprintId != null) __obj.updateDynamic("fromBlueprintId")(fromBlueprintId)
    if (fromBundleId != null) __obj.updateDynamic("fromBundleId")(fromBundleId)
    if (fromInstanceArn != null) __obj.updateDynamic("fromInstanceArn")(fromInstanceArn)
    if (fromInstanceName != null) __obj.updateDynamic("fromInstanceName")(fromInstanceName)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeInGb)) __obj.updateDynamic("sizeInGb")(sizeInGb)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[InstanceSnapshot]
  }
}

