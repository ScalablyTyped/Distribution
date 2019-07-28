package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultHyperParameterRanges extends js.Object {
  /**
    * The categorical hyperparameters and their default ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[DefaultCategoricalHyperParameterRanges] = js.undefined
  /**
    * The continuous hyperparameters and their default ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[DefaultContinuousHyperParameterRanges] = js.undefined
  /**
    * The integer-valued hyperparameters and their default ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[DefaultIntegerHyperParameterRanges] = js.undefined
}

object DefaultHyperParameterRanges {
  @scala.inline
  def apply(
    categoricalHyperParameterRanges: DefaultCategoricalHyperParameterRanges = null,
    continuousHyperParameterRanges: DefaultContinuousHyperParameterRanges = null,
    integerHyperParameterRanges: DefaultIntegerHyperParameterRanges = null
  ): DefaultHyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    if (categoricalHyperParameterRanges != null) __obj.updateDynamic("categoricalHyperParameterRanges")(categoricalHyperParameterRanges)
    if (continuousHyperParameterRanges != null) __obj.updateDynamic("continuousHyperParameterRanges")(continuousHyperParameterRanges)
    if (integerHyperParameterRanges != null) __obj.updateDynamic("integerHyperParameterRanges")(integerHyperParameterRanges)
    __obj.asInstanceOf[DefaultHyperParameterRanges]
  }
}

