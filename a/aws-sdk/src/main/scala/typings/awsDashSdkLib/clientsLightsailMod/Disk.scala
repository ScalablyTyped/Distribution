package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disk extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the disk.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The resources to which the disk is attached.
    */
  var attachedTo: js.UndefOr[ResourceName] = js.undefined
  /**
    * (Deprecated) The attachment state of the disk.  In releases prior to November 14, 2017, this parameter returned attached for system disks in the API response. It is now deprecated, but still included in the response. Use isAttached instead. 
    */
  var attachmentState: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date when the disk was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * (Deprecated) The number of GB in use by the disk.  In releases prior to November 14, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var gbInUse: js.UndefOr[integer] = js.undefined
  /**
    * The input/output operations per second (IOPS) of the disk.
    */
  var iops: js.UndefOr[integer] = js.undefined
  /**
    * A Boolean value indicating whether the disk is attached.
    */
  var isAttached: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The AWS Region and Availability Zone where the disk is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The unique name of the disk.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The disk path.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Lightsail resource type (e.g., Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
  /**
    * Describes the status of the disk.
    */
  var state: js.UndefOr[DiskState] = js.undefined
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object Disk {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    attachedTo: ResourceName = null,
    attachmentState: java.lang.String = null,
    createdAt: IsoDate = null,
    gbInUse: js.UndefOr[integer] = js.undefined,
    iops: js.UndefOr[integer] = js.undefined,
    isAttached: js.UndefOr[scala.Boolean] = js.undefined,
    isSystemDisk: js.UndefOr[scala.Boolean] = js.undefined,
    location: ResourceLocation = null,
    name: ResourceName = null,
    path: java.lang.String = null,
    resourceType: ResourceType = null,
    sizeInGb: js.UndefOr[integer] = js.undefined,
    state: DiskState = null,
    supportCode: java.lang.String = null,
    tags: TagList = null
  ): Disk = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (attachedTo != null) __obj.updateDynamic("attachedTo")(attachedTo)
    if (attachmentState != null) __obj.updateDynamic("attachmentState")(attachmentState)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (!js.isUndefined(gbInUse)) __obj.updateDynamic("gbInUse")(gbInUse)
    if (!js.isUndefined(iops)) __obj.updateDynamic("iops")(iops)
    if (!js.isUndefined(isAttached)) __obj.updateDynamic("isAttached")(isAttached)
    if (!js.isUndefined(isSystemDisk)) __obj.updateDynamic("isSystemDisk")(isSystemDisk)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeInGb)) __obj.updateDynamic("sizeInGb")(sizeInGb)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Disk]
  }
}

