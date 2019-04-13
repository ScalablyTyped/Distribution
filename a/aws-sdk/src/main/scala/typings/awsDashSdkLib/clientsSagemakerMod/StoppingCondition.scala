package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoppingCondition extends js.Object {
  /**
    * The maximum length of time, in seconds, that the training job can run. If model training does not complete during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. Maximum value is 28 days.
    */
  var MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds] = js.undefined
}

object StoppingCondition {
  @scala.inline
  def apply(MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds] = js.undefined): StoppingCondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxRuntimeInSeconds)) __obj.updateDynamic("MaxRuntimeInSeconds")(MaxRuntimeInSeconds)
    __obj.asInstanceOf[StoppingCondition]
  }
}

