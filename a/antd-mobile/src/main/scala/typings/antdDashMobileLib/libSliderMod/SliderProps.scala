package typings
package antdDashMobileLib.libSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps
  extends antdDashMobileLib.libSliderPropsTypeMod.SliderPropsType {
  var dots: js.UndefOr[scala.Boolean] = js.undefined
  var handleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var included: js.UndefOr[scala.Boolean] = js.undefined
  var marks: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  var maximumTrackStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var minimumTrackStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var railStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var trackStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    defaultValue: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    handle: js.Any = null,
    handleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    included: js.UndefOr[scala.Boolean] = js.undefined,
    marks: org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    max: scala.Int | scala.Double = null,
    maximumTrackStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    min: scala.Int | scala.Double = null,
    minimumTrackStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    onAfterChange: /* value */ js.UndefOr[scala.Double] => scala.Unit = null,
    onChange: /* value */ js.UndefOr[scala.Double] => scala.Unit = null,
    prefixCls: java.lang.String = null,
    railStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    step: scala.Int | scala.Double = null,
    tipFormatter: /* value */ js.UndefOr[java.lang.String] => reactLib.reactMod.ReactNs.ReactNode = null,
    trackStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: scala.Int | scala.Double = null
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

