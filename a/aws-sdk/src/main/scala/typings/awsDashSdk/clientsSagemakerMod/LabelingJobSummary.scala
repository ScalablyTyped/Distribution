package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual workers into a label for a data object. For more information, see Annotation Consolidation.
    */
  var AnnotationConsolidationLambdaArn: js.UndefOr[LambdaFunctionArn] = js.undefined
  /**
    * The date and time that the job was created (timestamp).
    */
  var CreationTime: Timestamp
  /**
    * If the LabelingJobStatus field is Failed, this field contains a description of the error.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.undefined
  /**
    * Input configuration for the labeling job.
    */
  var InputConfig: js.UndefOr[LabelingJobInputConfig] = js.undefined
  /**
    * Counts showing the progress of the labeling job.
    */
  var LabelCounters: typings.awsDashSdk.clientsSagemakerMod.LabelCounters
  /**
    * The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
    */
  var LabelingJobArn: typings.awsDashSdk.clientsSagemakerMod.LabelingJobArn
  /**
    * The name of the labeling job.
    */
  var LabelingJobName: typings.awsDashSdk.clientsSagemakerMod.LabelingJobName
  /**
    * The location of the output produced by the labeling job.
    */
  var LabelingJobOutput: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LabelingJobOutput] = js.undefined
  /**
    * The current status of the labeling job. 
    */
  var LabelingJobStatus: typings.awsDashSdk.clientsSagemakerMod.LabelingJobStatus
  /**
    * The date and time that the job was last modified (timestamp).
    */
  var LastModifiedTime: Timestamp
  /**
    * The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent to a worker.
    */
  var PreHumanTaskLambdaArn: LambdaFunctionArn
  /**
    * The Amazon Resource Name (ARN) of the work team assigned to the job.
    */
  var WorkteamArn: typings.awsDashSdk.clientsSagemakerMod.WorkteamArn
}

object LabelingJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    LabelCounters: LabelCounters,
    LabelingJobArn: LabelingJobArn,
    LabelingJobName: LabelingJobName,
    LabelingJobStatus: LabelingJobStatus,
    LastModifiedTime: Timestamp,
    PreHumanTaskLambdaArn: LambdaFunctionArn,
    WorkteamArn: WorkteamArn,
    AnnotationConsolidationLambdaArn: LambdaFunctionArn = null,
    FailureReason: FailureReason = null,
    InputConfig: LabelingJobInputConfig = null,
    LabelingJobOutput: LabelingJobOutput = null
  ): LabelingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, LabelCounters = LabelCounters, LabelingJobArn = LabelingJobArn, LabelingJobName = LabelingJobName, LabelingJobStatus = LabelingJobStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime, PreHumanTaskLambdaArn = PreHumanTaskLambdaArn, WorkteamArn = WorkteamArn)
    if (AnnotationConsolidationLambdaArn != null) __obj.updateDynamic("AnnotationConsolidationLambdaArn")(AnnotationConsolidationLambdaArn)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (InputConfig != null) __obj.updateDynamic("InputConfig")(InputConfig)
    if (LabelingJobOutput != null) __obj.updateDynamic("LabelingJobOutput")(LabelingJobOutput)
    __obj.asInstanceOf[LabelingJobSummary]
  }
}

