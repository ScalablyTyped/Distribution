package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectiveStatusCounters extends js.Object {
  /**
    * The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.
    */
  var Failed: js.UndefOr[ObjectiveStatusCounter] = js.undefined
  /**
    * The number of training jobs that are in progress and pending evaluation of their final objective metric.
    */
  var Pending: js.UndefOr[ObjectiveStatusCounter] = js.undefined
  /**
    * The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.
    */
  var Succeeded: js.UndefOr[ObjectiveStatusCounter] = js.undefined
}

object ObjectiveStatusCounters {
  @scala.inline
  def apply(Failed: Int | Double = null, Pending: Int | Double = null, Succeeded: Int | Double = null): ObjectiveStatusCounters = {
    val __obj = js.Dynamic.literal()
    if (Failed != null) __obj.updateDynamic("Failed")(Failed.asInstanceOf[js.Any])
    if (Pending != null) __obj.updateDynamic("Pending")(Pending.asInstanceOf[js.Any])
    if (Succeeded != null) __obj.updateDynamic("Succeeded")(Succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectiveStatusCounters]
  }
}

