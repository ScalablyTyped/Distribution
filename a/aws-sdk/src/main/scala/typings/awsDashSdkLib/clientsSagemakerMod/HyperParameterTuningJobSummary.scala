package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperParameterTuningJobSummary extends js.Object {
  /**
    * The date and time that the tuning job was created.
    */
  var CreationTime: Timestamp
  /**
    * The date and time that the tuning job ended.
    */
  var HyperParameterTuningEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the tuning job.
    */
  var HyperParameterTuningJobArn: awsDashSdkLib.clientsSagemakerMod.HyperParameterTuningJobArn
  /**
    * The name of the tuning job.
    */
  var HyperParameterTuningJobName: awsDashSdkLib.clientsSagemakerMod.HyperParameterTuningJobName
  /**
    * The status of the tuning job.
    */
  var HyperParameterTuningJobStatus: awsDashSdkLib.clientsSagemakerMod.HyperParameterTuningJobStatus
  /**
    * The date and time that the tuning job was modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ObjectiveStatusCounters object that specifies the numbers of training jobs, categorized by objective metric status, that this tuning job launched.
    */
  var ObjectiveStatusCounters: awsDashSdkLib.clientsSagemakerMod.ObjectiveStatusCounters
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs allowed for this tuning job.
    */
  var ResourceLimits: js.UndefOr[ResourceLimits] = js.undefined
  /**
    * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each iteration. Currently, the only valid value is Bayesian.
    */
  var Strategy: HyperParameterTuningJobStrategyType
  /**
    * The TrainingJobStatusCounters object that specifies the numbers of training jobs, categorized by status, that this tuning job launched.
    */
  var TrainingJobStatusCounters: awsDashSdkLib.clientsSagemakerMod.TrainingJobStatusCounters
}

object HyperParameterTuningJobSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    HyperParameterTuningJobArn: HyperParameterTuningJobArn,
    HyperParameterTuningJobName: HyperParameterTuningJobName,
    HyperParameterTuningJobStatus: HyperParameterTuningJobStatus,
    ObjectiveStatusCounters: ObjectiveStatusCounters,
    Strategy: HyperParameterTuningJobStrategyType,
    TrainingJobStatusCounters: TrainingJobStatusCounters,
    HyperParameterTuningEndTime: Timestamp = null,
    LastModifiedTime: Timestamp = null,
    ResourceLimits: ResourceLimits = null
  ): HyperParameterTuningJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, HyperParameterTuningJobArn = HyperParameterTuningJobArn, HyperParameterTuningJobName = HyperParameterTuningJobName, HyperParameterTuningJobStatus = HyperParameterTuningJobStatus.asInstanceOf[js.Any], ObjectiveStatusCounters = ObjectiveStatusCounters, Strategy = Strategy.asInstanceOf[js.Any], TrainingJobStatusCounters = TrainingJobStatusCounters)
    if (HyperParameterTuningEndTime != null) __obj.updateDynamic("HyperParameterTuningEndTime")(HyperParameterTuningEndTime)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (ResourceLimits != null) __obj.updateDynamic("ResourceLimits")(ResourceLimits)
    __obj.asInstanceOf[HyperParameterTuningJobSummary]
  }
}

