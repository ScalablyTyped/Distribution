package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportImageResult extends js.Object {
  /**
    * A description of the image being exported.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The disk image format for the exported image.
    */
  var DiskImageFormat: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.DiskImageFormat] = js.native
  /**
    * The ID of the export image task.
    */
  var ExportImageTaskId: js.UndefOr[String] = js.native
  /**
    * The ID of the image.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The percent complete of the export image task.
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * The name of the role that grants VM Import/Export permission to export images to your S3 bucket.
    */
  var RoleName: js.UndefOr[String] = js.native
  /**
    * Information about the destination S3 bucket.
    */
  var S3ExportLocation: js.UndefOr[ExportTaskS3Location] = js.native
  /**
    * The status of the export image task. The possible values are active, completed, deleting, and deleted.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The status message for the export image task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object ExportImageResult {
  @scala.inline
  def apply(
    Description: String = null,
    DiskImageFormat: DiskImageFormat = null,
    ExportImageTaskId: String = null,
    ImageId: String = null,
    Progress: String = null,
    RoleName: String = null,
    S3ExportLocation: ExportTaskS3Location = null,
    Status: String = null,
    StatusMessage: String = null
  ): ExportImageResult = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DiskImageFormat != null) __obj.updateDynamic("DiskImageFormat")(DiskImageFormat.asInstanceOf[js.Any])
    if (ExportImageTaskId != null) __obj.updateDynamic("ExportImageTaskId")(ExportImageTaskId.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName.asInstanceOf[js.Any])
    if (S3ExportLocation != null) __obj.updateDynamic("S3ExportLocation")(S3ExportLocation.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportImageResult]
  }
}

