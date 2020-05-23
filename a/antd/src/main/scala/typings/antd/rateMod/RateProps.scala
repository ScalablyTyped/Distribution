package typings.antd.rateMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var allowHalf: js.UndefOr[Boolean] = js.undefined
  var character: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var defaultValue: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var onHoverChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tooltips: js.UndefOr[js.Array[String]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object RateProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    allowHalf: js.UndefOr[Boolean] = js.undefined,
    character: ReactNode = null,
    className: String = null,
    count: js.UndefOr[Double] = js.undefined,
    defaultValue: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ Double => Unit = null,
    onHoverChange: /* value */ Double => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    tooltips: js.Array[String] = null,
    value: js.UndefOr[Double] = js.undefined
  ): RateProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalf)) __obj.updateDynamic("allowHalf")(allowHalf.get.asInstanceOf[js.Any])
    if (character != null) __obj.updateDynamic("character")(character.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onHoverChange != null) __obj.updateDynamic("onHoverChange")(js.Any.fromFunction1(onHoverChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateProps]
  }
}

