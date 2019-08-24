package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportImageTask extends js.Object {
  /**
    * A description of the image being exported.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the export image task.
    */
  var ExportImageTaskId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the image.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  /**
    * The percent complete of the export image task.
    */
  var Progress: js.UndefOr[String] = js.undefined
  /**
    * Information about the destination S3 bucket.
    */
  var S3ExportLocation: js.UndefOr[ExportTaskS3Location] = js.undefined
  /**
    * The status of the export image task. The possible values are active, completed, deleting, and deleted.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The status message for the export image task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}

object ExportImageTask {
  @scala.inline
  def apply(
    Description: String = null,
    ExportImageTaskId: String = null,
    ImageId: String = null,
    Progress: String = null,
    S3ExportLocation: ExportTaskS3Location = null,
    Status: String = null,
    StatusMessage: String = null
  ): ExportImageTask = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExportImageTaskId != null) __obj.updateDynamic("ExportImageTaskId")(ExportImageTaskId)
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (S3ExportLocation != null) __obj.updateDynamic("S3ExportLocation")(S3ExportLocation)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[ExportImageTask]
  }
}

