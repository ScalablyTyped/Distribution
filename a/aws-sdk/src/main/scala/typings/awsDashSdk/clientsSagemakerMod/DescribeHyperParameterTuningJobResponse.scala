package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHyperParameterTuningJobResponse extends js.Object {
  /**
    * A TrainingJobSummary object that describes the training job that completed with the best current HyperParameterTuningJobObjective.
    */
  var BestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined
  /**
    * The date and time that the tuning job started.
    */
  var CreationTime: Timestamp
  /**
    * If the tuning job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.undefined
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: typings.awsDashSdk.clientsSagemakerMod.HyperParameterTuningJobArn
  /**
    * The HyperParameterTuningJobConfig object that specifies the configuration of the tuning job.
    */
  var HyperParameterTuningJobConfig: typings.awsDashSdk.clientsSagemakerMod.HyperParameterTuningJobConfig
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: typings.awsDashSdk.clientsSagemakerMod.HyperParameterTuningJobName
  /**
    * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
    */
  var HyperParameterTuningJobStatus: typings.awsDashSdk.clientsSagemakerMod.HyperParameterTuningJobStatus
  /**
    * The date and time that the status of the tuning job was modified. 
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ObjectiveStatusCounters object that specifies the number of training jobs, categorized by the status of their final objective metric, that this tuning job launched.
    */
  var ObjectiveStatusCounters: typings.awsDashSdk.clientsSagemakerMod.ObjectiveStatusCounters
  /**
    * If the hyperparameter tuning job is an warm start tuning job with a WarmStartType of IDENTICAL_DATA_AND_ALGORITHM, this is the TrainingJobSummary for the training job with the best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for the warm start tuning job.
    */
  var OverallBestTrainingJob: js.UndefOr[HyperParameterTrainingJobSummary] = js.undefined
  /**
    * The HyperParameterTrainingJobDefinition object that specifies the definition of the training jobs that this tuning job launches.
    */
  var TrainingJobDefinition: js.UndefOr[HyperParameterTrainingJobDefinition] = js.undefined
  /**
    * The TrainingJobStatusCounters object that specifies the number of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: typings.awsDashSdk.clientsSagemakerMod.TrainingJobStatusCounters
  /**
    * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to search over in the new tuning job.
    */
  var WarmStartConfig: js.UndefOr[HyperParameterTuningJobWarmStartConfig] = js.undefined
}

object DescribeHyperParameterTuningJobResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobConfig: HyperParameterTuningJobConfig,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    TrainingJobStatusCounters: TrainingJobStatusCounters,
    BestTrainingJob: HyperParameterTrainingJobSummary = null,
    FailureReason: FailureReason = null,
    HyperParameterTuningEndTime: Timestamp = null,
    LastModifiedTime: Timestamp = null,
    OverallBestTrainingJob: HyperParameterTrainingJobSummary = null,
    TrainingJobDefinition: HyperParameterTrainingJobDefinition = null,
    WarmStartConfig: HyperParameterTuningJobWarmStartConfig = null
  ): DescribeHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, HyperParameterTuningJobArn = HyperParameterTuningJobArn, HyperParameterTuningJobConfig = HyperParameterTuningJobConfig, HyperParameterTuningJobName = HyperParameterTuningJobName, HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters, TrainingJobStatusCounters = TrainingJobStatusCounters)
    if (BestTrainingJob != null) __obj.updateDynamic("BestTrainingJob")(BestTrainingJob)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (HyperParameterTuningEndTime != null) __obj.updateDynamic("HyperParameterTuningEndTime")(HyperParameterTuningEndTime)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (OverallBestTrainingJob != null) __obj.updateDynamic("OverallBestTrainingJob")(OverallBestTrainingJob)
    if (TrainingJobDefinition != null) __obj.updateDynamic("TrainingJobDefinition")(TrainingJobDefinition)
    if (WarmStartConfig != null) __obj.updateDynamic("WarmStartConfig")(WarmStartConfig)
    __obj.asInstanceOf[DescribeHyperParameterTuningJobResponse]
  }
}

