package typings.antDesignReactNative.stepperPropsTypeMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepPropsType extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var downStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Double | String] = js.undefined
  var upStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object StepPropsType {
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
    upStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): StepPropsType = {
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
    if (!js.isUndefined(upStyle)) __obj.updateDynamic("upStyle")(upStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepPropsType]
  }
}

