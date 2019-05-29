package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/es/statistic/Statistic.StatisticProps> */
trait WeakValidationMapStatisticProps extends js.Object {
  var className: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var decimalSeparator: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var formatter: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[antdLib.esStatisticUtilsMod.Formatter | scala.Null]]
  ] = js.undefined
  var groupSeparator: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var precision: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Double | scala.Null]]] = js.undefined
  var prefix: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var prefixCls: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var style: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]]
  ] = js.undefined
  var suffix: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var title: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var value: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | antdLib.esStatisticUtilsMod.valueType]]
  ] = js.undefined
  var valueRender: js.UndefOr[
    reactLib.reactMod.Validator[
      js.UndefOr[
        (js.Function1[/* node */ reactLib.reactMod.ReactNode, reactLib.reactMod.ReactNode]) | scala.Null
      ]
    ]
  ] = js.undefined
  var valueStyle: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]]
  ] = js.undefined
}

object WeakValidationMapStatisticProps {
  @scala.inline
  def apply(
    className: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    decimalSeparator: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    formatter: reactLib.reactMod.Validator[js.UndefOr[antdLib.esStatisticUtilsMod.Formatter | scala.Null]] = null,
    groupSeparator: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    precision: reactLib.reactMod.Validator[js.UndefOr[scala.Double | scala.Null]] = null,
    prefix: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    prefixCls: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    style: reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]] = null,
    suffix: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    title: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    value: reactLib.reactMod.Validator[js.UndefOr[scala.Null | antdLib.esStatisticUtilsMod.valueType]] = null,
    valueRender: reactLib.reactMod.Validator[
      js.UndefOr[
        (js.Function1[/* node */ reactLib.reactMod.ReactNode, reactLib.reactMod.ReactNode]) | scala.Null
      ]
    ] = null,
    valueStyle: reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]] = null
  ): WeakValidationMapStatisticProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (precision != null) __obj.updateDynamic("precision")(precision)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRender != null) __obj.updateDynamic("valueRender")(valueRender)
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle)
    __obj.asInstanceOf[WeakValidationMapStatisticProps]
  }
}

