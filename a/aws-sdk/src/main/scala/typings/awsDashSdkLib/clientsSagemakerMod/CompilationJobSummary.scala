package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationJobSummary extends js.Object {
  /**
    * The time when the model compilation job completed.
    */
  var CompilationEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the model compilation job.
    */
  var CompilationJobArn: awsDashSdkLib.clientsSagemakerMod.CompilationJobArn
  /**
    * The name of the model compilation job that you want a summary for.
    */
  var CompilationJobName: EntityName
  /**
    * The status of the model compilation job.
    */
  var CompilationJobStatus: awsDashSdkLib.clientsSagemakerMod.CompilationJobStatus
  /**
    * The time when the model compilation job started.
    */
  var CompilationStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The type of device that the model will run on after compilation has completed.
    */
  var CompilationTargetDevice: TargetDevice
  /**
    * The time when the model compilation job was created.
    */
  var CreationTime: awsDashSdkLib.clientsSagemakerMod.CreationTime
  /**
    * The time when the model compilation job was last modified.
    */
  var LastModifiedTime: js.UndefOr[LastModifiedTime] = js.undefined
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
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn, CompilationJobName = CompilationJobName, CompilationJobStatus = CompilationJobStatus.asInstanceOf[js.Any], CompilationTargetDevice = CompilationTargetDevice.asInstanceOf[js.Any], CreationTime = CreationTime)
    if (CompilationEndTime != null) __obj.updateDynamic("CompilationEndTime")(CompilationEndTime)
    if (CompilationStartTime != null) __obj.updateDynamic("CompilationStartTime")(CompilationStartTime)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    __obj.asInstanceOf[CompilationJobSummary]
  }
}

