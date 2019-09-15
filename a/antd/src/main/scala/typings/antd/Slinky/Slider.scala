package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esSliderMod.SliderMarks
import typings.antd.esSliderMod.SliderProps
import typings.antd.esSliderMod.SliderValue
import typings.antd.esSliderMod.default
import typings.antd.esTooltipMod.TooltipPlacement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, id, className, disabled */
object Slider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esSliderMod.default].asInstanceOf[String | js.Object]
  def apply(
    defaultValue: SliderValue = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    getTooltipPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: SliderMarks = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onAfterChange: /* value */ SliderValue => Unit = null,
    onChange: /* value */ SliderValue => Unit = null,
    prefixCls: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    tipFormatter: /* value */ Double => TagMod[Any] = null,
    tooltipPlacement: TooltipPlacement = null,
    tooltipPrefixCls: String = null,
    tooltipVisible: js.UndefOr[Boolean] = js.undefined,
    value: SliderValue = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (getTooltipPopupContainer != null) __obj.updateDynamic("getTooltipPopupContainer")(js.Any.fromFunction1(getTooltipPopupContainer))
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (tooltipPlacement != null) __obj.updateDynamic("tooltipPlacement")(tooltipPlacement)
    if (tooltipPrefixCls != null) __obj.updateDynamic("tooltipPrefixCls")(tooltipPrefixCls)
    if (!js.isUndefined(tooltipVisible)) __obj.updateDynamic("tooltipVisible")(tooltipVisible)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SliderProps
}

