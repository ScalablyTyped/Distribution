package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperParameterTuningJobConfig extends js.Object {
  /**
    * The HyperParameterTuningJobObjective object that specifies the objective metric for this tuning job.
    */
  var HyperParameterTuningJobObjective: awsDashSdkLib.clientsSagemakerMod.HyperParameterTuningJobObjective
  /**
    * The ParameterRanges object that specifies the ranges of hyperparameters that this tuning job searches.
    */
  var ParameterRanges: awsDashSdkLib.clientsSagemakerMod.ParameterRanges
  /**
    * The ResourceLimits object that specifies the maximum number of training jobs and parallel training jobs for this tuning job.
    */
  var ResourceLimits: awsDashSdkLib.clientsSagemakerMod.ResourceLimits
  /**
    * Specifies how hyperparameter tuning chooses the combinations of hyperparameter values to use for the training job it launches. To use the Bayesian search stategy, set this to Bayesian. To randomly search, set it to Random. For information about search strategies, see How Hyperparameter Tuning Works.
    */
  var Strategy: HyperParameterTuningJobStrategyType
  /**
    * Specifies whether to use early stopping for training jobs launched by the hyperparameter tuning job. This can be one of the following values (the default value is OFF):  OFF  Training jobs launched by the hyperparameter tuning job do not use early stopping.  AUTO  Amazon SageMaker stops training jobs launched by the hyperparameter tuning job when they are unlikely to perform better than previously completed training jobs. For more information, see Stop Training Jobs Early.  
    */
  var TrainingJobEarlyStoppingType: js.UndefOr[TrainingJobEarlyStoppingType] = js.undefined
}

object HyperParameterTuningJobConfig {
  @scala.inline
  def apply(
    HyperParameterTuningJobObjective: HyperParameterTuningJobObjective,
    ParameterRanges: ParameterRanges,
    ResourceLimits: ResourceLimits,
    Strategy: HyperParameterTuningJobStrategyType,
    TrainingJobEarlyStoppingType: TrainingJobEarlyStoppingType = null
  ): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobObjective = HyperParameterTuningJobObjective, ParameterRanges = ParameterRanges, ResourceLimits = ResourceLimits, Strategy = Strategy.asInstanceOf[js.Any])
    if (TrainingJobEarlyStoppingType != null) __obj.updateDynamic("TrainingJobEarlyStoppingType")(TrainingJobEarlyStoppingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
}

