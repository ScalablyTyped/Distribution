package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceExportTaskRequest extends js.Object {
  /**
    * A description for the conversion task or the resource being exported. The maximum length is 255 bytes.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The format and location for an instance export task.
    */
  var ExportToS3Task: js.UndefOr[ExportToS3TaskSpecification] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: String
  /**
    * The target virtualization environment.
    */
  var TargetEnvironment: js.UndefOr[ExportEnvironment] = js.undefined
}

object CreateInstanceExportTaskRequest {
  @scala.inline
  def apply(
    InstanceId: String,
    Description: String = null,
    ExportToS3Task: ExportToS3TaskSpecification = null,
    TargetEnvironment: ExportEnvironment = null
  ): CreateInstanceExportTaskRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExportToS3Task != null) __obj.updateDynamic("ExportToS3Task")(ExportToS3Task)
    if (TargetEnvironment != null) __obj.updateDynamic("TargetEnvironment")(TargetEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceExportTaskRequest]
  }
}

