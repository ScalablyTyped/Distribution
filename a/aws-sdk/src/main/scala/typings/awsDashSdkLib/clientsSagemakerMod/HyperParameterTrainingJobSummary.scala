package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperParameterTrainingJobSummary extends js.Object {
  /**
    * The date and time that the training job was created.
    */
  var CreationTime: Timestamp
  /**
    * The reason that the training job failed. 
    */
  var FailureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The FinalHyperParameterTuningJobObjectiveMetric object that specifies the value of the objective metric of the tuning job that launched this training job.
    */
  var FinalHyperParameterTuningJobObjectiveMetric: js.UndefOr[FinalHyperParameterTuningJobObjectiveMetric] = js.undefined
  /**
    * The status of the objective metric for the training job:   Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.     Pending: The training job is in progress and evaluation of its final objective metric is pending.     Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.  
    */
  var ObjectiveStatus: js.UndefOr[ObjectiveStatus] = js.undefined
  /**
    * Specifies the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job failure.
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: awsDashSdkLib.clientsSagemakerMod.TrainingJobArn
  /**
    * The name of the training job.
    */
  var TrainingJobName: awsDashSdkLib.clientsSagemakerMod.TrainingJobName
  /**
    * The status of the training job.
    */
  var TrainingJobStatus: awsDashSdkLib.clientsSagemakerMod.TrainingJobStatus
  /**
    * The date and time that the training job started.
    */
  var TrainingStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * A list of the hyperparameters for which you specified ranges to search.
    */
  var TunedHyperParameters: HyperParameters
  /**
    * The HyperParameter tuning job that launched the training job.
    */
  var TuningJobName: js.UndefOr[HyperParameterTuningJobName] = js.undefined
}

object HyperParameterTrainingJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    TrainingJobArn: TrainingJobArn,
    TrainingJobName: TrainingJobName,
    TrainingJobStatus: TrainingJobStatus,
    TunedHyperParameters: HyperParameters,
    FailureReason: FailureReason = null,
    FinalHyperParameterTuningJobObjectiveMetric: FinalHyperParameterTuningJobObjectiveMetric = null,
    ObjectiveStatus: ObjectiveStatus = null,
    TrainingEndTime: Timestamp = null,
    TrainingStartTime: Timestamp = null,
    TuningJobName: HyperParameterTuningJobName = null
  ): HyperParameterTrainingJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, TrainingJobArn = TrainingJobArn, TrainingJobName = TrainingJobName, TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any], TunedHyperParameters = TunedHyperParameters)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (FinalHyperParameterTuningJobObjectiveMetric != null) __obj.updateDynamic("FinalHyperParameterTuningJobObjectiveMetric")(FinalHyperParameterTuningJobObjectiveMetric)
    if (ObjectiveStatus != null) __obj.updateDynamic("ObjectiveStatus")(ObjectiveStatus.asInstanceOf[js.Any])
    if (TrainingEndTime != null) __obj.updateDynamic("TrainingEndTime")(TrainingEndTime)
    if (TrainingStartTime != null) __obj.updateDynamic("TrainingStartTime")(TrainingStartTime)
    if (TuningJobName != null) __obj.updateDynamic("TuningJobName")(TuningJobName)
    __obj.asInstanceOf[HyperParameterTrainingJobSummary]
  }
}

