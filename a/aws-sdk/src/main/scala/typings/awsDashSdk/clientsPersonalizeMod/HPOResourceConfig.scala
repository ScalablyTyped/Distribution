package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HPOResourceConfig extends js.Object {
  /**
    * The maximum number of training jobs.
    */
  var maxNumberOfTrainingJobs: js.UndefOr[HPOResource] = js.undefined
  /**
    * The maximum number of parallel training jobs.
    */
  var maxParallelTrainingJobs: js.UndefOr[HPOResource] = js.undefined
}

object HPOResourceConfig {
  @scala.inline
  def apply(maxNumberOfTrainingJobs: HPOResource = null, maxParallelTrainingJobs: HPOResource = null): HPOResourceConfig = {
    val __obj = js.Dynamic.literal()
    if (maxNumberOfTrainingJobs != null) __obj.updateDynamic("maxNumberOfTrainingJobs")(maxNumberOfTrainingJobs)
    if (maxParallelTrainingJobs != null) __obj.updateDynamic("maxParallelTrainingJobs")(maxParallelTrainingJobs)
    __obj.asInstanceOf[HPOResourceConfig]
  }
}

