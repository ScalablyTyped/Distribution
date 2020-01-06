package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterRanges extends js.Object {
  /**
    * The array of CategoricalParameterRange objects that specify ranges of categorical hyperparameters that a hyperparameter tuning job searches.
    */
  var CategoricalParameterRanges: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CategoricalParameterRanges] = js.native
  /**
    * The array of ContinuousParameterRange objects that specify ranges of continuous hyperparameters that a hyperparameter tuning job searches.
    */
  var ContinuousParameterRanges: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ContinuousParameterRanges] = js.native
  /**
    * The array of IntegerParameterRange objects that specify ranges of integer hyperparameters that a hyperparameter tuning job searches.
    */
  var IntegerParameterRanges: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.IntegerParameterRanges] = js.native
}

object ParameterRanges {
  @scala.inline
  def apply(
    CategoricalParameterRanges: CategoricalParameterRanges = null,
    ContinuousParameterRanges: ContinuousParameterRanges = null,
    IntegerParameterRanges: IntegerParameterRanges = null
  ): ParameterRanges = {
    val __obj = js.Dynamic.literal()
    if (CategoricalParameterRanges != null) __obj.updateDynamic("CategoricalParameterRanges")(CategoricalParameterRanges.asInstanceOf[js.Any])
    if (ContinuousParameterRanges != null) __obj.updateDynamic("ContinuousParameterRanges")(ContinuousParameterRanges.asInstanceOf[js.Any])
    if (IntegerParameterRanges != null) __obj.updateDynamic("IntegerParameterRanges")(IntegerParameterRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterRanges]
  }
}

