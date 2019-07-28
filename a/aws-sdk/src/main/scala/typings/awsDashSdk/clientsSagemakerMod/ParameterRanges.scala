package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterRanges extends js.Object {
  /**
    * The array of CategoricalParameterRange objects that specify ranges of categorical hyperparameters that a hyperparameter tuning job searches.
    */
  var CategoricalParameterRanges: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CategoricalParameterRanges] = js.undefined
  /**
    * The array of ContinuousParameterRange objects that specify ranges of continuous hyperparameters that a hyperparameter tuning job searches.
    */
  var ContinuousParameterRanges: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ContinuousParameterRanges] = js.undefined
  /**
    * The array of IntegerParameterRange objects that specify ranges of integer hyperparameters that a hyperparameter tuning job searches.
    */
  var IntegerParameterRanges: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.IntegerParameterRanges] = js.undefined
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

