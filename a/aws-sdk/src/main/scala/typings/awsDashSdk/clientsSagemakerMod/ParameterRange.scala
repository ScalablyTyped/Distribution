package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterRange extends js.Object {
  /**
    * A CategoricalParameterRangeSpecification object that defines the possible values for a categorical hyperparameter.
    */
  var CategoricalParameterRangeSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CategoricalParameterRangeSpecification] = js.undefined
  /**
    * A ContinuousParameterRangeSpecification object that defines the possible values for a continuous hyperparameter.
    */
  var ContinuousParameterRangeSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ContinuousParameterRangeSpecification] = js.undefined
  /**
    * A IntegerParameterRangeSpecification object that defines the possible values for an integer hyperparameter.
    */
  var IntegerParameterRangeSpecification: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.IntegerParameterRangeSpecification] = js.undefined
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

