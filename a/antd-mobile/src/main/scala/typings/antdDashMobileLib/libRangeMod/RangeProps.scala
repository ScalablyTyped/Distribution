package typings
package antdDashMobileLib.libRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeProps
  extends antdDashMobileLib.libRangePropsTypeMod.RangePropsType {
  var handleStyle: js.UndefOr[js.Array[reactLib.reactMod.CSSProperties]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var railStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var trackStyle: js.UndefOr[js.Array[reactLib.reactMod.CSSProperties]] = js.undefined
}

object RangeProps {
  @scala.inline
  def apply(
    defaultValue: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    handleStyle: js.Array[reactLib.reactMod.CSSProperties] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    onAfterChange: /* value */ js.UndefOr[scala.Double] => scala.Unit = null,
    onChange: /* value */ js.UndefOr[scala.Double] => scala.Unit = null,
    prefixCls: java.lang.String = null,
    railStyle: reactLib.reactMod.CSSProperties = null,
    step: scala.Int | scala.Double = null,
    tipFormatter: /* value */ js.UndefOr[scala.Double] => reactLib.reactMod.ReactNode = null,
    trackStyle: js.Array[reactLib.reactMod.CSSProperties] = null,
    value: scala.Int | scala.Double = null
  ): RangeProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeProps]
  }
}

