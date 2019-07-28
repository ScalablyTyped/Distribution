package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionProperty extends js.Object {
  /**
    * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this threshold is reached. The maximum value you can specify is controlled by a service limit.
    */
  var MaxConcurrentRuns: js.UndefOr[typings.awsDashSdk.clientsGlueMod.MaxConcurrentRuns] = js.undefined
}

object ExecutionProperty {
  @scala.inline
  def apply(MaxConcurrentRuns: js.UndefOr[MaxConcurrentRuns] = js.undefined): ExecutionProperty = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxConcurrentRuns)) __obj.updateDynamic("MaxConcurrentRuns")(MaxConcurrentRuns)
    __obj.asInstanceOf[ExecutionProperty]
  }
}

