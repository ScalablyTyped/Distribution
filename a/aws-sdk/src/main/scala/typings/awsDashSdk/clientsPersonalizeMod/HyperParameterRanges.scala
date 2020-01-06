package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HyperParameterRanges extends js.Object {
  /**
    * The categorical hyperparameters and their ranges.
    */
  var categoricalHyperParameterRanges: js.UndefOr[CategoricalHyperParameterRanges] = js.native
  /**
    * The continuous hyperparameters and their ranges.
    */
  var continuousHyperParameterRanges: js.UndefOr[ContinuousHyperParameterRanges] = js.native
  /**
    * The integer-valued hyperparameters and their ranges.
    */
  var integerHyperParameterRanges: js.UndefOr[IntegerHyperParameterRanges] = js.native
}

object HyperParameterRanges {
  @scala.inline
  def apply(
    categoricalHyperParameterRanges: CategoricalHyperParameterRanges = null,
    continuousHyperParameterRanges: ContinuousHyperParameterRanges = null,
    integerHyperParameterRanges: IntegerHyperParameterRanges = null
  ): HyperParameterRanges = {
    val __obj = js.Dynamic.literal()
    if (categoricalHyperParameterRanges != null) __obj.updateDynamic("categoricalHyperParameterRanges")(categoricalHyperParameterRanges.asInstanceOf[js.Any])
    if (continuousHyperParameterRanges != null) __obj.updateDynamic("continuousHyperParameterRanges")(continuousHyperParameterRanges.asInstanceOf[js.Any])
    if (integerHyperParameterRanges != null) __obj.updateDynamic("integerHyperParameterRanges")(integerHyperParameterRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterRanges]
  }
}

