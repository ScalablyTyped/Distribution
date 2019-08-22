package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperParameterTuningJobConfig extends js.Object {
  /**
    * Specifies the ranges of valid values for the hyperparameters.
    */
  var ParameterRanges: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.ParameterRanges] = js.undefined
}

object HyperParameterTuningJobConfig {
  @scala.inline
  def apply(ParameterRanges: ParameterRanges = null): HyperParameterTuningJobConfig = {
    val __obj = js.Dynamic.literal()
    if (ParameterRanges != null) __obj.updateDynamic("ParameterRanges")(ParameterRanges)
    __obj.asInstanceOf[HyperParameterTuningJobConfig]
  }
}

