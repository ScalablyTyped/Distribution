package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportTask extends js.Object {
  /**
    * A description of the resource being exported.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the export task.
    */
  var ExportTaskId: js.UndefOr[String] = js.undefined
  /**
    * Information about the export task.
    */
  var ExportToS3Task: js.UndefOr[ExportToS3Task] = js.undefined
  /**
    * Information about the instance to export.
    */
  var InstanceExportDetails: js.UndefOr[InstanceExportDetails] = js.undefined
  /**
    * The state of the export task.
    */
  var State: js.UndefOr[ExportTaskState] = js.undefined
  /**
    * The status message related to the export task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}

object ExportTask {
  @scala.inline
  def apply(
    Description: String = null,
    ExportTaskId: String = null,
    ExportToS3Task: ExportToS3Task = null,
    InstanceExportDetails: InstanceExportDetails = null,
    State: ExportTaskState = null,
    StatusMessage: String = null
  ): ExportTask = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExportTaskId != null) __obj.updateDynamic("ExportTaskId")(ExportTaskId)
    if (ExportToS3Task != null) __obj.updateDynamic("ExportToS3Task")(ExportToS3Task)
    if (InstanceExportDetails != null) __obj.updateDynamic("InstanceExportDetails")(InstanceExportDetails)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[ExportTask]
  }
}

