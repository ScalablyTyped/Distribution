package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/statistic/Statistic.StatisticProps> */
trait PartialStatisticPropsClassName extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  var formatter: js.UndefOr[antdLib.libStatisticUtilsMod.Formatter] = js.undefined
  var groupSeparator: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var suffix: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var value: js.UndefOr[antdLib.libStatisticUtilsMod.valueType] = js.undefined
  var valueRender: js.UndefOr[
    js.Function1[/* node */ reactLib.reactMod.ReactNode, reactLib.reactMod.ReactNode]
  ] = js.undefined
  var valueStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object PartialStatisticPropsClassName {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    decimalSeparator: java.lang.String = null,
    formatter: antdLib.libStatisticUtilsMod.Formatter = null,
    groupSeparator: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    prefix: reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    suffix: reactLib.reactMod.ReactNode = null,
    title: reactLib.reactMod.ReactNode = null,
    value: antdLib.libStatisticUtilsMod.valueType = null,
    valueRender: /* node */ reactLib.reactMod.ReactNode => reactLib.reactMod.ReactNode = null,
    valueStyle: reactLib.reactMod.CSSProperties = null
  ): PartialStatisticPropsClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRender != null) __obj.updateDynamic("valueRender")(js.Any.fromFunction1(valueRender))
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle)
    __obj.asInstanceOf[PartialStatisticPropsClassName]
  }
}

