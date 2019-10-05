package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportImageRequest extends js.Object {
  /**
    * Token to enable idempotency for export image requests.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * A description of the image being exported. The maximum length is 255 bytes.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The disk image format.
    */
  var DiskImageFormat: typings.awsDashSdk.clientsEc2Mod.DiskImageFormat
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the image.
    */
  var ImageId: String
  /**
    * The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this parameter is not specified, the default role is named 'vmimport'.
    */
  var RoleName: js.UndefOr[String] = js.undefined
  /**
    * Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP permissions to the AWS account vm-import-export@amazon.com.
    */
  var S3ExportLocation: ExportTaskS3LocationRequest
}

object ExportImageRequest {
  @scala.inline
  def apply(
    DiskImageFormat: DiskImageFormat,
    ImageId: String,
    S3ExportLocation: ExportTaskS3LocationRequest,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    RoleName: String = null
  ): ExportImageRequest = {
    val __obj = js.Dynamic.literal(DiskImageFormat = DiskImageFormat.asInstanceOf[js.Any], ImageId = ImageId, S3ExportLocation = S3ExportLocation)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName)
    __obj.asInstanceOf[ExportImageRequest]
  }
}

