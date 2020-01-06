package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultHyperParameterRanges extends js.Object {
  /**
    * The categorical hyperparameters and their default ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[DefaultCategoricalHyperParameterRanges] = js.native
  /**
    * The continuous hyperparameters and their default ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[DefaultContinuousHyperParameterRanges] = js.native
  /**
    * The integer-valued hyperparameters and their default ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[DefaultIntegerHyperParameterRanges] = js.native
}

object DefaultHyperParameterRanges {
  @scala.inline
  def apply(
    categoricalHyperParameterRanges: DefaultCategoricalHyperParameterRanges = null,
    continuousHyperParameterRanges: DefaultContinuousHyperParameterRanges = null,
    integerHyperParameterRanges: DefaultIntegerHyperParameterRanges = null
  ): DefaultHyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    if (categoricalHyperParameterRanges != null) __obj.updateDynamic("categoricalHyperParameterRanges")(categoricalHyperParameterRanges.asInstanceOf[js.Any])
    if (continuousHyperParameterRanges != null) __obj.updateDynamic("continuousHyperParameterRanges")(continuousHyperParameterRanges.asInstanceOf[js.Any])
    if (integerHyperParameterRanges != null) __obj.updateDynamic("integerHyperParameterRanges")(integerHyperParameterRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultHyperParameterRanges]
  }
}

