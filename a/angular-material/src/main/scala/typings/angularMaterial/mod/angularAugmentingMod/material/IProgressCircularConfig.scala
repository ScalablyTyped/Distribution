package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressCircularConfig extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var durationIndeterminate: js.UndefOr[Double] = js.undefined
  var easeFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.undefined
  var easeFnIndeterminate: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  ] = js.undefined
  var endIndeterminate: js.UndefOr[Double] = js.undefined
  var progressSize: js.UndefOr[Double] = js.undefined
  var startIndeterminate: js.UndefOr[Double] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object IProgressCircularConfig {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    durationIndeterminate: js.UndefOr[Double] = js.undefined,
    easeFn: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double = null,
    easeFnIndeterminate: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double = null,
    endIndeterminate: js.UndefOr[Double] = js.undefined,
    progressSize: js.UndefOr[Double] = js.undefined,
    startIndeterminate: js.UndefOr[Double] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined
  ): IProgressCircularConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(durationIndeterminate)) __obj.updateDynamic("durationIndeterminate")(durationIndeterminate.get.asInstanceOf[js.Any])
    if (easeFn != null) __obj.updateDynamic("easeFn")(js.Any.fromFunction4(easeFn))
    if (easeFnIndeterminate != null) __obj.updateDynamic("easeFnIndeterminate")(js.Any.fromFunction4(easeFnIndeterminate))
    if (!js.isUndefined(endIndeterminate)) __obj.updateDynamic("endIndeterminate")(endIndeterminate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressSize)) __obj.updateDynamic("progressSize")(progressSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndeterminate)) __obj.updateDynamic("startIndeterminate")(startIndeterminate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressCircularConfig]
  }
}

