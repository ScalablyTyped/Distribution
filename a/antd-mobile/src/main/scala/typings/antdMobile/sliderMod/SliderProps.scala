package typings.antdMobile.sliderMod

import org.scalablytyped.runtime.NumberDictionary
import typings.antdMobile.sliderPropsTypeMod.SliderPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends SliderPropsType {
  var dots: js.UndefOr[Boolean] = js.undefined
  var handleStyle: js.UndefOr[CSSProperties] = js.undefined
  var included: js.UndefOr[Boolean] = js.undefined
  var marks: js.UndefOr[NumberDictionary[String]] = js.undefined
  var maximumTrackStyle: js.UndefOr[CSSProperties] = js.undefined
  var minimumTrackStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var railStyle: js.UndefOr[CSSProperties] = js.undefined
  var trackStyle: js.UndefOr[CSSProperties] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    defaultValue: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: js.Any = null,
    handleStyle: CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: NumberDictionary[String] = null,
    max: js.UndefOr[Double] = js.undefined,
    maximumTrackStyle: CSSProperties = null,
    min: js.UndefOr[Double] = js.undefined,
    minimumTrackStyle: CSSProperties = null,
    onAfterChange: /* value */ js.UndefOr[Double] => Unit = null,
    onChange: /* value */ js.UndefOr[Double] => Unit = null,
    prefixCls: String = null,
    railStyle: CSSProperties = null,
    step: js.UndefOr[Double] = js.undefined,
    tipFormatter: /* value */ js.UndefOr[String] => ReactNode = null,
    trackStyle: CSSProperties = null,
    value: js.UndefOr[Double] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.get.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (maximumTrackStyle != null) __obj.updateDynamic("maximumTrackStyle")(maximumTrackStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (minimumTrackStyle != null) __obj.updateDynamic("minimumTrackStyle")(minimumTrackStyle.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

