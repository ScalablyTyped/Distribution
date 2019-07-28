package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingJobStatusCounters extends js.Object {
  /**
    * The number of completed training jobs launched by the hyperparameter tuning job.
    */
  var Completed: js.UndefOr[TrainingJobStatusCounter] = js.undefined
  /**
    * The number of in-progress training jobs launched by a hyperparameter tuning job.
    */
  var InProgress: js.UndefOr[TrainingJobStatusCounter] = js.undefined
  /**
    * The number of training jobs that failed and can't be retried. A failed training job can't be retried if it failed because a client error occurred.
    */
  var NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined
  /**
    * The number of training jobs that failed, but can be retried. A failed training job can be retried only if it failed because an internal service error occurred.
    */
  var RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined
  /**
    * The number of training jobs launched by a hyperparameter tuning job that were manually stopped.
    */
  var Stopped: js.UndefOr[TrainingJobStatusCounter] = js.undefined
}

object TrainingJobStatusCounters {
  @scala.inline
  def apply(
    Completed: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
    InProgress: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
    NonRetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
    RetryableError: js.UndefOr[TrainingJobStatusCounter] = js.undefined,
    Stopped: js.UndefOr[TrainingJobStatusCounter] = js.undefined
  ): TrainingJobStatusCounters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Completed)) __obj.updateDynamic("Completed")(Completed)
    if (!js.isUndefined(InProgress)) __obj.updateDynamic("InProgress")(InProgress)
    if (!js.isUndefined(NonRetryableError)) __obj.updateDynamic("NonRetryableError")(NonRetryableError)
    if (!js.isUndefined(RetryableError)) __obj.updateDynamic("RetryableError")(RetryableError)
    if (!js.isUndefined(Stopped)) __obj.updateDynamic("Stopped")(Stopped)
    __obj.asInstanceOf[TrainingJobStatusCounters]
  }
}

