package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultCategoricalHyperParameterRange extends js.Object {
  /**
    * Whether the hyperparameter is tunable.
    */
  var isTunable: js.UndefOr[Tunable] = js.undefined
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
  /**
    * A list of the categories for the hyperparameter.
    */
  var values: js.UndefOr[CategoricalValues] = js.undefined
}

object DefaultCategoricalHyperParameterRange {
  @scala.inline
  def apply(
    isTunable: js.UndefOr[Tunable] = js.undefined,
    name: ParameterName = null,
    values: CategoricalValues = null
  ): DefaultCategoricalHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isTunable)) __obj.updateDynamic("isTunable")(isTunable)
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DefaultCategoricalHyperParameterRange]
  }
}

