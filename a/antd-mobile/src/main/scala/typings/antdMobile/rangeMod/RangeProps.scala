package typings.antdMobile.rangeMod

import typings.antdMobile.rangePropsTypeMod.RangePropsType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeProps extends RangePropsType {
  var handleStyle: js.UndefOr[js.Array[CSSProperties]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var railStyle: js.UndefOr[CSSProperties] = js.undefined
  var trackStyle: js.UndefOr[js.Array[CSSProperties]] = js.undefined
}

object RangeProps {
  @scala.inline
  def apply(
    defaultValue: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    handleStyle: js.Array[CSSProperties] = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onAfterChange: /* value */ js.UndefOr[Double] => Unit = null,
    onChange: /* value */ js.UndefOr[Double] => Unit = null,
    prefixCls: String = null,
    railStyle: CSSProperties = null,
    step: js.UndefOr[Double] = js.undefined,
    tipFormatter: /* value */ js.UndefOr[Double] => ReactNode = null,
    trackStyle: js.Array[CSSProperties] = null,
    value: js.UndefOr[Double] = js.undefined
  ): RangeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeProps]
  }
}

