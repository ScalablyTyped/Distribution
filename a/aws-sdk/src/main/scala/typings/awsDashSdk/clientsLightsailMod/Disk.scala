package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disk extends js.Object {
  /**
    * An array of objects representing the add-ons enabled on the disk.
    */
  var addOns: js.UndefOr[AddOnList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the disk.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The resources to which the disk is attached.
    */
  var attachedTo: js.UndefOr[ResourceName] = js.native
  /**
    * (Deprecated) The attachment state of the disk.  In releases prior to November 14, 2017, this parameter returned attached for system disks in the API response. It is now deprecated, but still included in the response. Use isAttached instead. 
    */
  var attachmentState: js.UndefOr[String] = js.native
  /**
    * The date when the disk was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * (Deprecated) The number of GB in use by the disk.  In releases prior to November 14, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var gbInUse: js.UndefOr[integer] = js.native
  /**
    * The input/output operations per second (IOPS) of the disk.
    */
  var iops: js.UndefOr[integer] = js.native
  /**
    * A Boolean value indicating whether the disk is attached.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.native
  /**
    * The AWS Region and Availability Zone where the disk is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The unique name of the disk.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The disk path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The Lightsail resource type (e.g., Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * Describes the status of the disk.
    */
  var state: js.UndefOr[DiskState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object Disk {
  @scala.inline
  def apply(
    addOns: AddOnList = null,
    arn: NonEmptyString = null,
    attachedTo: ResourceName = null,
    attachmentState: String = null,
    createdAt: IsoDate = null,
    gbInUse: Int | Double = null,
    iops: Int | Double = null,
    isAttached: js.UndefOr[Boolean] = js.undefined,
    isSystemDisk: js.UndefOr[Boolean] = js.undefined,
    location: ResourceLocation = null,
    name: ResourceName = null,
    path: String = null,
    resourceType: ResourceType = null,
    sizeInGb: Int | Double = null,
    state: DiskState = null,
    supportCode: String = null,
    tags: TagList = null
  ): Disk = {
    val __obj = js.Dynamic.literal()
    if (addOns != null) __obj.updateDynamic("addOns")(addOns.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (attachedTo != null) __obj.updateDynamic("attachedTo")(attachedTo.asInstanceOf[js.Any])
    if (attachmentState != null) __obj.updateDynamic("attachmentState")(attachmentState.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (gbInUse != null) __obj.updateDynamic("gbInUse")(gbInUse.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (!js.isUndefined(isAttached)) __obj.updateDynamic("isAttached")(isAttached.asInstanceOf[js.Any])
    if (!js.isUndefined(isSystemDisk)) __obj.updateDynamic("isSystemDisk")(isSystemDisk.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sizeInGb != null) __obj.updateDynamic("sizeInGb")(sizeInGb.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disk]
  }
}

