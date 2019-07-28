package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperParameterRanges extends js.Object {
  /**
    * The categorical hyperparameters and their ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[CategoricalHyperParameterRanges] = js.undefined
  /**
    * The continuous hyperparameters and their ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[ContinuousHyperParameterRanges] = js.undefined
  /**
    * The integer-valued hyperparameters and their ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[IntegerHyperParameterRanges] = js.undefined
}

object HyperParameterRanges {
  @scala.inline
  def apply(
    categoricalHyperParameterRanges: CategoricalHyperParameterRanges = null,
    continuousHyperParameterRanges: ContinuousHyperParameterRanges = null,
    integerHyperParameterRanges: IntegerHyperParameterRanges = null
  ): HyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    if (categoricalHyperParameterRanges != null) __obj.updateDynamic("categoricalHyperParameterRanges")(categoricalHyperParameterRanges)
    if (continuousHyperParameterRanges != null) __obj.updateDynamic("continuousHyperParameterRanges")(continuousHyperParameterRanges)
    if (integerHyperParameterRanges != null) __obj.updateDynamic("integerHyperParameterRanges")(integerHyperParameterRanges)
    __obj.asInstanceOf[HyperParameterRanges]
  }
}

