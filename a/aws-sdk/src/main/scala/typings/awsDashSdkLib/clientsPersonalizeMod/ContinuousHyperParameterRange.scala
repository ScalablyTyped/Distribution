package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousHyperParameterRange extends js.Object {
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

object ContinuousHyperParameterRange {
  @scala.inline
  def apply(
    maxValue: js.UndefOr[ContinuousMaxValue] = js.undefined,
    minValue: js.UndefOr[ContinuousMinValue] = js.undefined,
    name: ParameterName = null
  ): ContinuousHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue)
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ContinuousHyperParameterRange]
  }
}

