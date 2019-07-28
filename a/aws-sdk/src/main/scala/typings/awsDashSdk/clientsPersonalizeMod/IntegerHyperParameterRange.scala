package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerHyperParameterRange extends js.Object {
  /**
    * The maximum allowable value for the hyperparameter.
    */
  var maxValue: js.UndefOr[IntegerMaxValue] = js.undefined
  /**
    * The minimum allowable value for the hyperparameter.
    */
  var minValue: js.UndefOr[IntegerMinValue] = js.undefined
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
}

object IntegerHyperParameterRange {
  @scala.inline
  def apply(
    maxValue: js.UndefOr[IntegerMaxValue] = js.undefined,
    minValue: js.UndefOr[IntegerMinValue] = js.undefined,
    name: ParameterName = null
  ): IntegerHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue)
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IntegerHyperParameterRange]
  }
}

