package typings
package antdLib.esRateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateProps extends js.Object {
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  var allowHalf: js.UndefOr[scala.Boolean] = js.undefined
  var character: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Double, _]] = js.undefined
  var onHoverChange: js.UndefOr[js.Function1[/* value */ scala.Double, _]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tooltips: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object RateProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    allowHalf: js.UndefOr[scala.Boolean] = js.undefined,
    character: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    count: scala.Int | scala.Double = null,
    defaultValue: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* value */ scala.Double => _ = null,
    onHoverChange: /* value */ scala.Double => _ = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    tooltips: js.Array[java.lang.String] = null,
    value: scala.Int | scala.Double = null
  ): RateProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(allowHalf)) __obj.updateDynamic("allowHalf")(allowHalf)
    if (character != null) __obj.updateDynamic("character")(character.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onHoverChange != null) __obj.updateDynamic("onHoverChange")(js.Any.fromFunction1(onHoverChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateProps]
  }
}

