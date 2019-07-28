package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformJobSummary extends js.Object {
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: Timestamp
  /**
    * If the transform job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.undefined
  /**
    * Indicates when the transform job was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that the job failed.
    */
  var TransformEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typings.awsDashSdk.clientsSagemakerMod.TransformJobArn
  /**
    * The name of the transform job.
    */
  var TransformJobName: typings.awsDashSdk.clientsSagemakerMod.TransformJobName
  /**
    * The status of the transform job.
    */
  var TransformJobStatus: typings.awsDashSdk.clientsSagemakerMod.TransformJobStatus
}

object TransformJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    TransformJobArn: TransformJobArn,
    TransformJobName: TransformJobName,
    TransformJobStatus: TransformJobStatus,
    FailureReason: FailureReason = null,
    LastModifiedTime: Timestamp = null,
    TransformEndTime: Timestamp = null
  ): TransformJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, TransformJobArn = TransformJobArn, TransformJobName = TransformJobName, TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (TransformEndTime != null) __obj.updateDynamic("TransformEndTime")(TransformEndTime)
    __obj.asInstanceOf[TransformJobSummary]
  }
}

