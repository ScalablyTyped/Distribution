package typings.angularDashMaterial.angularDashMaterialMod.angularMod.materialNs

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
    duration: Int | Double = null,
    durationIndeterminate: Int | Double = null,
    easeFn: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double = null,
    easeFnIndeterminate: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Double = null,
    endIndeterminate: Int | Double = null,
    progressSize: Int | Double = null,
    startIndeterminate: Int | Double = null,
    strokeWidth: Int | Double = null
  ): IProgressCircularConfig = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (durationIndeterminate != null) __obj.updateDynamic("durationIndeterminate")(durationIndeterminate.asInstanceOf[js.Any])
    if (easeFn != null) __obj.updateDynamic("easeFn")(js.Any.fromFunction4(easeFn))
    if (easeFnIndeterminate != null) __obj.updateDynamic("easeFnIndeterminate")(js.Any.fromFunction4(easeFnIndeterminate))
    if (endIndeterminate != null) __obj.updateDynamic("endIndeterminate")(endIndeterminate.asInstanceOf[js.Any])
    if (progressSize != null) __obj.updateDynamic("progressSize")(progressSize.asInstanceOf[js.Any])
    if (startIndeterminate != null) __obj.updateDynamic("startIndeterminate")(startIndeterminate.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressCircularConfig]
  }
}

