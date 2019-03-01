package typings
package antdLib.libInputDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.InputHTMLAttributes<react.HTMLInputElement>, antd.antd/lib/input-number.OmitAttrs> ]: react.react.InputHTMLAttributes<react.HTMLInputElement>[P]} */ trait InputNumberProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[
    js.Function1[/* value */ js.UndefOr[scala.Double | java.lang.String], java.lang.String]
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* displayValue */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default
  ] = js.undefined
  var step: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object InputNumberProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    decimalSeparator: java.lang.String = null,
    defaultValue: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: js.Function1[/* value */ js.UndefOr[scala.Double | java.lang.String], java.lang.String] = null,
    id: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onChange: js.Function1[/* value */ js.UndefOr[scala.Double], scala.Unit] = null,
    parser: js.Function1[/* displayValue */ js.UndefOr[java.lang.String], scala.Double] = null,
    placeholder: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    prefixCls: java.lang.String = null,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default = null,
    step: scala.Double | java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): InputNumberProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (id != null) __obj.updateDynamic("id")(id)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputNumberProps]
  }
}

