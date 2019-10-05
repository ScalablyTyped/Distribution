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
  def apply(maxValue: Int | Double = null, minValue: Int | Double = null, name: ParameterName = null): IntegerHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IntegerHyperParameterRange]
  }
}

