package typings.antd

import typings.antd.libStatisticUtilsMod.Formatter
import typings.antd.libStatisticUtilsMod.countdownValueType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/statistic/Countdown.CountdownProps> */
trait PartialCountdownPropsClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var decimalSeparator: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var groupSeparator: js.UndefOr[String] = js.undefined
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffix: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[countdownValueType] = js.undefined
  var valueRender: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.undefined
  var valueStyle: js.UndefOr[CSSProperties] = js.undefined
}

object PartialCountdownPropsClassName {
  @scala.inline
  def apply(
    className: String = null,
    decimalSeparator: String = null,
    format: String = null,
    formatter: Formatter = null,
    groupSeparator: String = null,
    onFinish: () => Unit = null,
    precision: Int | Double = null,
    prefix: ReactNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    suffix: ReactNode = null,
    title: ReactNode = null,
    value: countdownValueType = null,
    valueRender: /* node */ ReactNode => ReactNode = null,
    valueStyle: CSSProperties = null
  ): PartialCountdownPropsClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRender != null) __obj.updateDynamic("valueRender")(js.Any.fromFunction1(valueRender))
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle)
    __obj.asInstanceOf[PartialCountdownPropsClassName]
  }
}

