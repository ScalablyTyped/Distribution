package typings.antDesignReactNative.inputNumberMod

import typings.antDesignReactNative.anon.DisabledStepTextColor
import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputNumberProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var downStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var keyboardType: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onBlur: js.UndefOr[js.Function2[/* e */ js.Any, /* repeated */ js.Any, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[String | Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: ReturnType[js.Function1[/* theme */ Theme, DisabledStepTextColor]]
  var upStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object InputNumberProps {
  @scala.inline
  def apply(
    styles: ReturnType[js.Function1[/* theme */ Theme, DisabledStepTextColor]],
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    downStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    inputStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    keyboardType: js.Any = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onBlur: (/* e */ js.Any, /* repeated */ js.Any) => Unit = null,
    onChange: /* e */ js.Any => Unit = null,
    onFocus: /* e */ js.UndefOr[js.Any] => Unit = null,
    parser: /* v */ js.Any => Unit = null,
    precision: js.UndefOr[Double] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    step: String | Double = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    upStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): InputNumberProps = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(downStyle)) __obj.updateDynamic("downStyle")(downStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(inputStyle)) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction2(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1(parser))
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(upStyle)) __obj.updateDynamic("upStyle")(upStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputNumberProps]
  }
}

