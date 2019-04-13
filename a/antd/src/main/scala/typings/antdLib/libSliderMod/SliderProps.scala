package typings
package antdLib.libSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[SliderValue] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dots: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var included: js.UndefOr[scala.Boolean] = js.undefined
  var marks: js.UndefOr[SliderMarks] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onAfterChange: js.UndefOr[js.Function1[/* value */ SliderValue, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ SliderValue, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tipFormatter: js.UndefOr[
    scala.Null | (js.Function1[/* value */ scala.Double, reactLib.reactMod.ReactNode])
  ] = js.undefined
  var tooltipPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var tooltipVisible: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[SliderValue] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultValue: SliderValue = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    included: js.UndefOr[scala.Boolean] = js.undefined,
    marks: SliderMarks = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onAfterChange: /* value */ SliderValue => scala.Unit = null,
    onChange: /* value */ SliderValue => scala.Unit = null,
    prefixCls: java.lang.String = null,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    step: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    tipFormatter: /* value */ scala.Double => reactLib.reactMod.ReactNode = null,
    tooltipPrefixCls: java.lang.String = null,
    tooltipVisible: js.UndefOr[scala.Boolean] = js.undefined,
    value: SliderValue = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (tooltipPrefixCls != null) __obj.updateDynamic("tooltipPrefixCls")(tooltipPrefixCls)
    if (!js.isUndefined(tooltipVisible)) __obj.updateDynamic("tooltipVisible")(tooltipVisible)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[SliderProps]
  }
}

