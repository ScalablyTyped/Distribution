package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoppingCondition extends js.Object {
  /**
    * The maximum length of time, in seconds, that the training or compilation job can run. If job does not complete during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. The maximum value is 28 days.
    */
  var MaxRuntimeInSeconds: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxRuntimeInSeconds] = js.undefined
  /**
    * The maximum length of time, in seconds, how long you are willing to wait for a managed spot training job to complete. It is the amount of time spent waiting for Spot capacity plus the amount of time the training job runs. It must be equal to or greater than MaxRuntimeInSeconds. 
    */
  var MaxWaitTimeInSeconds: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxWaitTimeInSeconds] = js.undefined
}

object StoppingCondition {
  @scala.inline
  def apply(MaxRuntimeInSeconds: Int | Double = null, MaxWaitTimeInSeconds: Int | Double = null): StoppingCondition = {
    val __obj = js.Dynamic.literal()
    if (MaxRuntimeInSeconds != null) __obj.updateDynamic("MaxRuntimeInSeconds")(MaxRuntimeInSeconds.asInstanceOf[js.Any])
    if (MaxWaitTimeInSeconds != null) __obj.updateDynamic("MaxWaitTimeInSeconds")(MaxWaitTimeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoppingCondition]
  }
}

