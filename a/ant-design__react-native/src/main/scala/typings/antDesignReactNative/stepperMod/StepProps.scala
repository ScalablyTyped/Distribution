package typings.antDesignReactNative.stepperMod

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.stepperPropsTypeMod.StepPropsType
import typings.antDesignReactNative.stepperStyleMod.StepperStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepProps
  extends StepPropsType
     with WithThemeStyles[StepperStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    downStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    inputStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    name: String = null,
    onChange: /* value */ js.Any => Unit = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    step: Double | String = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: Partial[StepperStyle] = null,
    upStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(downStyle)) __obj.updateDynamic("downStyle")(downStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(inputStyle)) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(upStyle)) __obj.updateDynamic("upStyle")(upStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepProps]
  }
}

