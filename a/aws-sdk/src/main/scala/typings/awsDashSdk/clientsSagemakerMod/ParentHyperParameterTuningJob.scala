package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentHyperParameterTuningJob extends js.Object {
  /**
    * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
    */
  var HyperParameterTuningJobName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.HyperParameterTuningJobName] = js.undefined
}

object ParentHyperParameterTuningJob {
  @scala.inline
  def apply(HyperParameterTuningJobName: HyperParameterTuningJobName = null): ParentHyperParameterTuningJob = {
    val __obj = js.Dynamic.literal()
    if (HyperParameterTuningJobName != null) __obj.updateDynamic("HyperParameterTuningJobName")(HyperParameterTuningJobName)
    __obj.asInstanceOf[ParentHyperParameterTuningJob]
  }
}

