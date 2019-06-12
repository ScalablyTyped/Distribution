package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoricalHyperParameterRange extends js.Object {
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
  /**
    * A list of the categories for the hyperparameter.
    */
  var values: js.UndefOr[CategoricalValues] = js.undefined
}

object CategoricalHyperParameterRange {
  @scala.inline
  def apply(name: ParameterName = null, values: CategoricalValues = null): CategoricalHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[CategoricalHyperParameterRange]
  }
}

