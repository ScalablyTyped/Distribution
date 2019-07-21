package typings
package atAntDashDesignReactDashNativeLib.esSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maximumTrackTintColor: js.UndefOr[java.lang.String] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minimumTrackTintColor: js.UndefOr[java.lang.String] = js.undefined
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var tipFormatter: js.UndefOr[
    js.Function1[/* value */ js.UndefOr[java.lang.String], reactLib.reactMod.ReactNode]
  ] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    defaultValue: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    maximumTrackTintColor: java.lang.String = null,
    min: scala.Int | scala.Double = null,
    minimumTrackTintColor: java.lang.String = null,
    onAfterChange: /* value */ js.UndefOr[scala.Double] => scala.Unit = null,
    onChange: /* value */ js.UndefOr[scala.Double] => scala.Unit = null,
    step: scala.Int | scala.Double = null,
    tipFormatter: /* value */ js.UndefOr[java.lang.String] => reactLib.reactMod.ReactNode = null,
    value: scala.Int | scala.Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maximumTrackTintColor != null) __obj.updateDynamic("maximumTrackTintColor")(maximumTrackTintColor)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minimumTrackTintColor != null) __obj.updateDynamic("minimumTrackTintColor")(minimumTrackTintColor)
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

