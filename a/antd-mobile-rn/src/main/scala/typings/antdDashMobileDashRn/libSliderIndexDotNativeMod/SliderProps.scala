package typings.antdDashMobileDashRn.libSliderIndexDotNativeMod

import typings.antdDashMobileDashRn.libSliderPropsTypeMod.SliderPropsType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends SliderPropsType {
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
  var minimumTrackTintColor: js.UndefOr[String] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    handle: js.Any = null,
    max: Int | Double = null,
    maximumTrackTintColor: String = null,
    min: Int | Double = null,
    minimumTrackTintColor: String = null,
    onAfterChange: /* value */ js.UndefOr[Double] => Unit = null,
    onChange: /* value */ js.UndefOr[Double] => Unit = null,
    step: Int | Double = null,
    tipFormatter: /* value */ js.UndefOr[String] => ReactNode = null,
    value: Int | Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (handle != null) __obj.updateDynamic("handle")(handle)
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

