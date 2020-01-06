package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceExportTaskRequest extends js.Object {
  /**
    * A description for the conversion task or the resource being exported. The maximum length is 255 bytes.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The format and location for an instance export task.
    */
  var ExportToS3Task: js.UndefOr[ExportToS3TaskSpecification] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsDashSdk.clientsEc2Mod.InstanceId = js.native
  /**
    * The target virtualization environment.
    */
  var TargetEnvironment: js.UndefOr[ExportEnvironment] = js.native
}

object CreateInstanceExportTaskRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    Description: String = null,
    ExportToS3Task: ExportToS3TaskSpecification = null,
    TargetEnvironment: ExportEnvironment = null
  ): CreateInstanceExportTaskRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExportToS3Task != null) __obj.updateDynamic("ExportToS3Task")(ExportToS3Task.asInstanceOf[js.Any])
    if (TargetEnvironment != null) __obj.updateDynamic("TargetEnvironment")(TargetEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceExportTaskRequest]
  }
}

