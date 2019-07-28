package typings.antd.libSpinMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var indicator: js.UndefOr[SpinIndicator] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[SpinSize] = js.undefined
  var spinning: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tip: js.UndefOr[String] = js.undefined
  var wrapperClassName: js.UndefOr[String] = js.undefined
}

object SpinProps {
  @scala.inline
  def apply(
    className: String = null,
    delay: Int | Double = null,
    indicator: SpinIndicator = null,
    prefixCls: String = null,
    size: SpinSize = null,
    spinning: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tip: String = null,
    wrapperClassName: String = null
  ): SpinProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(spinning)) __obj.updateDynamic("spinning")(spinning)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tip != null) __obj.updateDynamic("tip")(tip)
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName)
    __obj.asInstanceOf[SpinProps]
  }
}

