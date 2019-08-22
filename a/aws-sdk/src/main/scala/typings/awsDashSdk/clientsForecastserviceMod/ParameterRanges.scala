package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterRanges extends js.Object {
  /**
    * Specifies the tunable range for each categorical hyperparameter.
    */
  var CategoricalParameterRanges: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.CategoricalParameterRanges] = js.undefined
  /**
    * Specifies the tunable range for each continuous hyperparameter.
    */
  var ContinuousParameterRanges: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.ContinuousParameterRanges] = js.undefined
  /**
    * Specifies the tunable range for each integer hyperparameter.
    */
  var IntegerParameterRanges: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.IntegerParameterRanges] = js.undefined
}

object ParameterRanges {
  @scala.inline
  def apply(
    CategoricalParameterRanges: CategoricalParameterRanges = null,
    ContinuousParameterRanges: ContinuousParameterRanges = null,
    IntegerParameterRanges: IntegerParameterRanges = null
  ): ParameterRanges = {
    val __obj = js.Dynamic.literal()
    if (CategoricalParameterRanges != null) __obj.updateDynamic("CategoricalParameterRanges")(CategoricalParameterRanges)
    if (ContinuousParameterRanges != null) __obj.updateDynamic("ContinuousParameterRanges")(ContinuousParameterRanges)
    if (IntegerParameterRanges != null) __obj.updateDynamic("IntegerParameterRanges")(IntegerParameterRanges)
    __obj.asInstanceOf[ParameterRanges]
  }
}

