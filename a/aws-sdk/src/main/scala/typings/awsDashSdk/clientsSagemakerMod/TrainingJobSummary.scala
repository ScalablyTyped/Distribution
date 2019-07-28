package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingJobSummary extends js.Object {
  /**
    * A timestamp that shows when the training job was created.
    */
  var CreationTime: Timestamp
  /**
    *  Timestamp when the training job was last modified. 
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * A timestamp that shows when the training job ended. This field is set only if the training job has one of the terminal statuses (Completed, Failed, or Stopped). 
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typings.awsDashSdk.clientsSagemakerMod.TrainingJobArn
  /**
    * The name of the training job that you want a summary for.
    */
  var TrainingJobName: typings.awsDashSdk.clientsSagemakerMod.TrainingJobName
  /**
    * The status of the training job.
    */
  var TrainingJobStatus: typings.awsDashSdk.clientsSagemakerMod.TrainingJobStatus
}

object TrainingJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    TrainingJobArn: TrainingJobArn,
    TrainingJobName: TrainingJobName,
    TrainingJobStatus: TrainingJobStatus,
    LastModifiedTime: Timestamp = null,
    TrainingEndTime: Timestamp = null
  ): TrainingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, TrainingJobArn = TrainingJobArn, TrainingJobName = TrainingJobName, TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (TrainingEndTime != null) __obj.updateDynamic("TrainingEndTime")(TrainingEndTime)
    __obj.asInstanceOf[TrainingJobSummary]
  }
}

