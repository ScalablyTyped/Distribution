package typings.antd.sliderMod

import typings.antd.tooltipMod.TooltipPlacement
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[SliderValue] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dots: js.UndefOr[Boolean] = js.undefined
  var getTooltipPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var included: js.UndefOr[Boolean] = js.undefined
  var marks: js.UndefOr[SliderMarks] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onAfterChange: js.UndefOr[js.Function1[/* value */ SliderValue, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ SliderValue, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double | Null] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tipFormatter: js.UndefOr[Null | (js.Function1[/* value */ js.UndefOr[Double], ReactNode])] = js.undefined
  var tooltipPlacement: js.UndefOr[TooltipPlacement] = js.undefined
  var tooltipPrefixCls: js.UndefOr[String] = js.undefined
  var tooltipVisible: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[SliderValue] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultValue: SliderValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    getTooltipPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    id: String = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: SliderMarks = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onAfterChange: /* value */ SliderValue => Unit = null,
    onChange: /* value */ SliderValue => Unit = null,
    prefixCls: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Null | Double] = js.undefined,
    style: CSSProperties = null,
    tipFormatter: js.UndefOr[Null | (/* value */ js.UndefOr[Double] => ReactNode)] = js.undefined,
    tooltipPlacement: TooltipPlacement = null,
    tooltipPrefixCls: String = null,
    tooltipVisible: js.UndefOr[Boolean] = js.undefined,
    value: SliderValue = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (getTooltipPopupContainer != null) __obj.updateDynamic("getTooltipPopupContainer")(js.Any.fromFunction1(getTooltipPopupContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.get.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tipFormatter)) __obj.updateDynamic("tipFormatter")(if (tipFormatter != null) js.Any.fromFunction1(tipFormatter.asInstanceOf[/* value */ js.UndefOr[Double] => ReactNode]) else null)
    if (tooltipPlacement != null) __obj.updateDynamic("tooltipPlacement")(tooltipPlacement.asInstanceOf[js.Any])
    if (tooltipPrefixCls != null) __obj.updateDynamic("tooltipPrefixCls")(tooltipPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipVisible)) __obj.updateDynamic("tooltipVisible")(tooltipVisible.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

