package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultContinuousHyperParameterRange extends js.Object {
  /**
    * Whether the hyperparameter is tunable.
    */
  var isTunable: js.UndefOr[Tunable] = js.undefined
  /**
    * The maximum allowable value for the hyperparameter.
    */
  var maxValue: js.UndefOr[ContinuousMaxValue] = js.undefined
  /**
    * The minimum allowable value for the hyperparameter.
    */
  var minValue: js.UndefOr[ContinuousMinValue] = js.undefined
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
}

object DefaultContinuousHyperParameterRange {
  @scala.inline
  def apply(
    isTunable: js.UndefOr[Tunable] = js.undefined,
    maxValue: js.UndefOr[ContinuousMaxValue] = js.undefined,
    minValue: js.UndefOr[ContinuousMinValue] = js.undefined,
    name: ParameterName = null
  ): DefaultContinuousHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isTunable)) __obj.updateDynamic("isTunable")(isTunable)
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue)
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DefaultContinuousHyperParameterRange]
  }
}

