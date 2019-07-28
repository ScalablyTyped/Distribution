package typings.antdDashMobile.esSliderMod

import org.scalablytyped.runtime.NumberDictionary
import typings.antdDashMobile.esSliderPropsTypeMod.SliderPropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
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
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: js.Any = null,
    handleStyle: CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: NumberDictionary[String] = null,
    max: Int | Double = null,
    maximumTrackStyle: CSSProperties = null,
    min: Int | Double = null,
    minimumTrackStyle: CSSProperties = null,
    onAfterChange: /* value */ js.UndefOr[Double] => Unit = null,
    onChange: /* value */ js.UndefOr[Double] => Unit = null,
    prefixCls: String = null,
    railStyle: CSSProperties = null,
    step: Int | Double = null,
    tipFormatter: /* value */ js.UndefOr[String] => ReactNode = null,
    trackStyle: CSSProperties = null,
    value: Int | Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle)
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maximumTrackStyle != null) __obj.updateDynamic("maximumTrackStyle")(maximumTrackStyle)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minimumTrackStyle != null) __obj.updateDynamic("minimumTrackStyle")(minimumTrackStyle)
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

