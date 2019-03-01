package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressCircularConfig extends js.Object {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var durationIndeterminate: js.UndefOr[scala.Double] = js.undefined
  var easeFn: js.UndefOr[
    js.Function4[
      /* t */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      /* d */ scala.Double, 
      scala.Double
    ]
  ] = js.undefined
  var easeFnIndeterminate: js.UndefOr[
    js.Function4[
      /* t */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      /* d */ scala.Double, 
      scala.Double
    ]
  ] = js.undefined
  var endIndeterminate: js.UndefOr[scala.Double] = js.undefined
  var progressSize: js.UndefOr[scala.Double] = js.undefined
  var startIndeterminate: js.UndefOr[scala.Double] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
}

object IProgressCircularConfig {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    durationIndeterminate: scala.Int | scala.Double = null,
    easeFn: js.Function4[
      /* t */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      /* d */ scala.Double, 
      scala.Double
    ] = null,
    easeFnIndeterminate: js.Function4[
      /* t */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      /* d */ scala.Double, 
      scala.Double
    ] = null,
    endIndeterminate: scala.Int | scala.Double = null,
    progressSize: scala.Int | scala.Double = null,
    startIndeterminate: scala.Int | scala.Double = null,
    strokeWidth: scala.Int | scala.Double = null
  ): IProgressCircularConfig = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (durationIndeterminate != null) __obj.updateDynamic("durationIndeterminate")(durationIndeterminate.asInstanceOf[js.Any])
    if (easeFn != null) __obj.updateDynamic("easeFn")(easeFn)
    if (easeFnIndeterminate != null) __obj.updateDynamic("easeFnIndeterminate")(easeFnIndeterminate)
    if (endIndeterminate != null) __obj.updateDynamic("endIndeterminate")(endIndeterminate.asInstanceOf[js.Any])
    if (progressSize != null) __obj.updateDynamic("progressSize")(progressSize.asInstanceOf[js.Any])
    if (startIndeterminate != null) __obj.updateDynamic("startIndeterminate")(startIndeterminate.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressCircularConfig]
  }
}

