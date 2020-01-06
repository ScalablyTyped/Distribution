package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilationJobSummary extends js.Object {
  /**
    * The time when the model compilation job completed.
    */
  var CompilationEndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var CompilationJobArn: typings.awsDashSdk.clientsSagemakerMod.CompilationJobArn = js.native
  /**
    * The name of the model compilation job that you want a summary for.
    */
  var CompilationJobName: EntityName = js.native
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: typings.awsDashSdk.clientsSagemakerMod.CompilationJobStatus = js.native
  /**
    * The time when the model compilation job started.
    */
  var CompilationStartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The type of device that the model will run on after compilation has completed.
    */
  var CompilationTargetDevice: TargetDevice = js.native
  /**
    * The time when the model compilation job was created.
    */
  var CreationTime: typings.awsDashSdk.clientsSagemakerMod.CreationTime = js.native
  /**
    * The time when the model compilation job was last modified.
    */
  var LastModifiedTime: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LastModifiedTime] = js.native
}

object CompilationJobSummary {
  @scala.inline
  def apply(
    CompilationJobArn: CompilationJobArn,
    CompilationJobName: EntityName,
    CompilationJobStatus: CompilationJobStatus,
    CompilationTargetDevice: TargetDevice,
    CreationTime: CreationTime,
    CompilationEndTime: Timestamp = null,
    CompilationStartTime: Timestamp = null,
    LastModifiedTime: LastModifiedTime = null
  ): CompilationJobSummary = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any], CompilationJobName = CompilationJobName.asInstanceOf[js.Any], CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CompilationTargetDevice = CompilationTargetDevice.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    if (CompilationEndTime != null) __obj.updateDynamic("CompilationEndTime")(CompilationEndTime.asInstanceOf[js.Any])
    if (CompilationStartTime != null) __obj.updateDynamic("CompilationStartTime")(CompilationStartTime.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationJobSummary]
  }
}

