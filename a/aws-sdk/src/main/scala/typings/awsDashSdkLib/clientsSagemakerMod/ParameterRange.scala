package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterRange extends js.Object {
  /**
    * A CategoricalParameterRangeSpecification object that defines the possible values for a categorical hyperparameter.
    */
  var CategoricalParameterRangeSpecification: js.UndefOr[CategoricalParameterRangeSpecification] = js.undefined
  /**
    * A ContinuousParameterRangeSpecification object that defines the possible values for a continuous hyperparameter.
    */
  var ContinuousParameterRangeSpecification: js.UndefOr[ContinuousParameterRangeSpecification] = js.undefined
  /**
    * A IntegerParameterRangeSpecification object that defines the possible values for an integer hyperparameter.
    */
  var IntegerParameterRangeSpecification: js.UndefOr[IntegerParameterRangeSpecification] = js.undefined
}

object ParameterRange {
  @scala.inline
  def apply(
    CategoricalParameterRangeSpecification: CategoricalParameterRangeSpecification = null,
    ContinuousParameterRangeSpecification: ContinuousParameterRangeSpecification = null,
    IntegerParameterRangeSpecification: IntegerParameterRangeSpecification = null
  ): ParameterRange = {
    val __obj = js.Dynamic.literal()
    if (CategoricalParameterRangeSpecification != null) __obj.updateDynamic("CategoricalParameterRangeSpecification")(CategoricalParameterRangeSpecification)
    if (ContinuousParameterRangeSpecification != null) __obj.updateDynamic("ContinuousParameterRangeSpecification")(ContinuousParameterRangeSpecification)
    if (IntegerParameterRangeSpecification != null) __obj.updateDynamic("IntegerParameterRangeSpecification")(IntegerParameterRangeSpecification)
    __obj.asInstanceOf[ParameterRange]
  }
}

