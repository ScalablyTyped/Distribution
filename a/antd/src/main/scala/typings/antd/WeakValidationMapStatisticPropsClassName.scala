package typings.antd

import typings.antd.libStatisticUtilsMod.Formatter
import typings.antd.libStatisticUtilsMod.valueType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/statistic/Statistic.StatisticProps> */
trait WeakValidationMapStatisticPropsClassName extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var decimalSeparator: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var formatter: js.UndefOr[Validator[js.UndefOr[Formatter | Null]]] = js.undefined
  var groupSeparator: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var precision: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  var suffix: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var title: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var value: js.UndefOr[Validator[js.UndefOr[Null | valueType]]] = js.undefined
  var valueRender: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* node */ ReactNode, ReactNode]) | Null]]] = js.undefined
  var valueStyle: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
}

object WeakValidationMapStatisticPropsClassName {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    decimalSeparator: Validator[js.UndefOr[Null | String]] = null,
    formatter: Validator[js.UndefOr[Formatter | Null]] = null,
    groupSeparator: Validator[js.UndefOr[Null | String]] = null,
    precision: Validator[js.UndefOr[Double | Null]] = null,
    prefix: Validator[js.UndefOr[Null | ReactNode]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null,
    suffix: Validator[js.UndefOr[Null | ReactNode]] = null,
    title: Validator[js.UndefOr[Null | ReactNode]] = null,
    value: Validator[js.UndefOr[Null | valueType]] = null,
    valueRender: Validator[js.UndefOr[(js.Function1[/* node */ ReactNode, ReactNode]) | Null]] = null,
    valueStyle: Validator[js.UndefOr[CSSProperties | Null]] = null
  ): WeakValidationMapStatisticPropsClassName = {
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
    __obj.asInstanceOf[WeakValidationMapStatisticPropsClassName]
  }
}

