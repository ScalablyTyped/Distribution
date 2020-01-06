package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionProperty extends js.Object {
  /**
    * The maximum number of concurrent runs allowed for the job. The default is 1. An error is returned when this threshold is reached. The maximum value you can specify is controlled by a service limit.
    */
  var MaxConcurrentRuns: js.UndefOr[typings.awsDashSdk.clientsGlueMod.MaxConcurrentRuns] = js.native
}

object ExecutionProperty {
  @scala.inline
  def apply(MaxConcurrentRuns: Int | Double = null): ExecutionProperty = {
    val __obj = js.Dynamic.literal()
    if (MaxConcurrentRuns != null) __obj.updateDynamic("MaxConcurrentRuns")(MaxConcurrentRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionProperty]
  }
}

